package com.github.emilybache.yatzy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Yatzy {

    private final Map<Integer, Long> dicesGrouped;

    public Yatzy(final int dice1, final int dice2, final int dice3, final int dice4, final int dice5) {
        final List<Integer> dices = List.of(dice1, dice2, dice3, dice4, dice5);
        this.dicesGrouped = this.groupDicesByValues(dices);
    }

    public int yatzy() {

        final List<Integer> points = this.countDicePoints(5);

        if (points.isEmpty()) {
            return 0;
        }
        return 50;
    }

    public int chance() {
        return this.dicesGrouped.entrySet()
            .stream()
            .mapToInt(entry -> entry.getKey() * entry.getValue().intValue())
            .sum();
    }

    public int ones() {
        return this.countDicesPoint(1);
    }

    public int twos() {
        return this.countDicesPoint(2);
    }

    public int threes() {
        return this.countDicesPoint(3);
    }

    public int fours() {
        return this.countDicesPoint(4);
    }

    public int fives() {
        return this.countDicesPoint(5);
    }

    public int sixes() {
        return this.countDicesPoint(6);
    }

    public int pair() {
        final List<Integer> points = this.countDicePoints(2);

        return points.stream().reduce((firstDouble, secondDouble) -> secondDouble).orElse(0);
    }

    public int twoPair() {
        final List<Integer> points = this.countDicePoints(2);

        if (points.size() != 2) {
            return 0;
        }

        return points.stream().mapToInt(Integer::intValue).sum();
    }

    public int fourOfAKind() {
        final List<Integer> points = this.countDicePoints(4);

        return points.stream().reduce(0, Integer::sum);
    }

    public int threeOfAKind() {
        final List<Integer> points = this.countDicePoints(3);

        return points.stream().reduce(0, Integer::sum);
    }

    public int smallStraight() {
        final ArrayList<Integer> straightList = buildStraightList(1, 5);
        return this.countStraightPoints(straightList);
    }

    public int largeStraight() {
        final ArrayList<Integer> straightList = buildStraightList(2, 6);
        return this.countStraightPoints(straightList);
    }

    public int fullHouse() {
        final boolean containsThreeSameDices = this.dicesGrouped.values().stream().anyMatch(value -> value == 3);

        if (containsThreeSameDices && this.dicesGrouped.size() == 2) {
            return this.dicesGrouped.entrySet().stream().mapToInt(entry -> entry.getKey() * entry.getValue().intValue()).sum();
        }

        return 0;
    }

    /**
     * Grouping dices by values
     * Ex: 12312
     * 1 : 2 dices
     * 2 : 2 dices
     * 3 : 1 dices
     *
     * @param dices the dices list
     * @return a {@link Map}<{@link Integer}, {@link Long}> where key is a dice value and value is the number of dices
     */
    private Map<Integer, Long> groupDicesByValues(final List<Integer> dices) {
        return dices.stream()
            .sorted()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    /**
     * Count dices point for a specific dice value.
     * Ex: 12312 count point for 2 => 4
     *
     * @param diceValue the dice value use to count points
     * @return the points number for a specific dice value
     */
    private int countDicesPoint(final int diceValue) {
        return this.dicesGrouped.entrySet()
            .stream()
            .filter(entry -> entry.getKey() == diceValue)
            .mapToInt(entry -> entry.getValue().intValue() * diceValue)
            .sum();
    }

    /**
     * Count dices points for multiple same dices specify.
     * Ex : 12312 sameDicesValue = 2
     * [2, 4]
     *
     * @param sameDiceValue count points for this same dice value
     * @return a {@link List} of {@link Integer} who contains same dices value points
     */
    private List<Integer> countDicePoints(final int sameDiceValue) {
        return this.dicesGrouped
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() >= sameDiceValue)
            .map(entry -> entry.getKey() * sameDiceValue)
            .collect(Collectors.toList());
    }

    /**
     * Count straight points for a straight values specify
     *
     * @param straightValues the straight values
     * @return the straight points
     */
    private int countStraightPoints(final ArrayList<Integer> straightValues) {
        final boolean containsStraight = this.dicesGrouped.keySet().stream()
            .anyMatch(value -> straightValues.remove(value)
                && straightValues.isEmpty());

        if (this.dicesGrouped.size() != 5 || !containsStraight) {
            return 0;
        }

        return this.dicesGrouped.keySet().stream().mapToInt(Integer::intValue).sum();
    }

    /**
     * Build a straight list start by start value and end with  end value
     *
     * @param startValue the straight list start by this value
     * @param endValue   the straight list end with this value
     * @return a {@link List} of {@link Integer} with the straight generated
     */
    private static ArrayList<Integer> buildStraightList(final int startValue, final int endValue) {
        final ArrayList<Integer> smallStraightValues = new ArrayList<>();

        for (int i = startValue; i <= endValue; i++) {
            smallStraightValues.add(i);
        }
        return smallStraightValues;
    }
}



