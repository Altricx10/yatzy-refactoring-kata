package com.github.emilybache.yatzy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Yatzy {

    protected List<Integer> dices;

    public Yatzy(final int dice1, final int dice2, final int dice3, final int dice4, final int dice5) {
        this.dices = Arrays.asList(dice1, dice2, dice3, dice4, dice5);
    }

    public int yatzy() {
        final int[] counts = this.countDicesPoint();
        for (final int count : counts) {
            if (count == 5) {
                return 50;
            }
        }
        return 0;
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
        final int[] counts = this.countDicesPoint();
        if (counts[0] == 1 &&
            counts[1] == 1 &&
            counts[2] == 1 &&
            counts[3] == 1 &&
            counts[4] == 1) {
            return 15;
        }
        return 0;
    }

    public int largeStraight() {
        final int[] counts = this.countDicesPoint();
        if (counts[1] == 1 &&
            counts[2] == 1 &&
            counts[3] == 1 &&
            counts[4] == 1
            && counts[5] == 1) {
            return 20;
        }
        return 0;
    }

    public int fullHouse() {

        boolean haveTwoSameDice = false;
        int twoSameDiceValue = 0;
        boolean haveThreeSameDice = false;
        int threeSameDiceValue = 0;

        final int[] counts = this.countDicesPoint();

        for (int i = 0; i < counts.length; i += 1) {
            if (counts[i] == 2) {
                haveTwoSameDice = true;
                twoSameDiceValue = i + 1;
            }
        }

        for (int i = 0; i < counts.length; i += 1) {
            if (counts[i] == 3) {
                haveThreeSameDice = true;
                threeSameDiceValue = i + 1;
            }
        }

        if (haveTwoSameDice && haveThreeSameDice) {
            return twoSameDiceValue * 2 + threeSameDiceValue * 3;
        } else {
            return 0;
        }
    }

    private int[] countDicesPoint() {
        final int[] counts = new int[6];
        counts[this.dices.get(0) - 1] += 1;
        counts[this.dices.get(1) - 1] += 1;
        counts[this.dices.get(2) - 1] += 1;
        counts[this.dices.get(3) - 1] += 1;
        counts[this.dices.get(4) - 1] += 1;
        return counts;
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
}



