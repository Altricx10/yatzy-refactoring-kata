package com.github.emilybache.yatzy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Yatzy {

    protected List<Integer> dices;

    public Yatzy(final int dice1, final int dice2, final int dice3, final int dice4, final int dice5) {
        this.dices = List.of(dice1, dice2, dice3, dice4, dice5);
    }

    public int yatzy() {
        final List<Integer> points = this.countDicePoints(5);

        if (points.isEmpty()) {
            return 0;
        }
        return 50;
    }

    public int chance() {
        return this.dices.stream().mapToInt(Integer::intValue).sum();
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

        final Map<Integer, Long> countsMap = this.dices.stream()
            .sorted()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        final boolean containsThreeSameDices = countsMap.values().stream().anyMatch(value -> value == 3);

        if (containsThreeSameDices && countsMap.size() == 2) {
            return countsMap.entrySet().stream().mapToInt(entry -> entry.getKey() * entry.getValue().intValue()).sum();
        }

        return 0;
    }

    private int countDicesPoint(final int diceValue) {
        return this.dices.stream().filter(dice -> dice == diceValue).mapToInt(Integer::intValue).sum();
    }

    private List<Integer> countDicePoints(final int diceValue) {
        final Map<Integer, Long> countsMap = this.dices.stream()
            .sorted()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return countsMap
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() >= diceValue)
            .map(entry -> entry.getKey() * diceValue)
            .collect(Collectors.toList());
    }

    private int countStraightPoints(final ArrayList<Integer> straightValues) {

        final Map<Integer, Long> countsMap = this.dices.stream()
            .sorted()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        final boolean containsStraight = countsMap.keySet().stream()
            .anyMatch(value -> straightValues.remove(value)
                && straightValues.isEmpty());

        if (countsMap.size() != 5 || !containsStraight) {
            return 0;
        }

        return countsMap.keySet().stream().mapToInt(Integer::intValue).sum();
    }

    private static ArrayList<Integer> buildStraightList(final int startValue, final int endValue) {
        final ArrayList<Integer> smallStraightValues = new ArrayList<>();

        for (int i = startValue; i <= endValue; i++) {
            smallStraightValues.add(i);
        }
        return smallStraightValues;
    }
}



