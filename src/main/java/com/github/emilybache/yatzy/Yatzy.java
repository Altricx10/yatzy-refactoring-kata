package com.github.emilybache.yatzy;

import java.util.Arrays;
import java.util.List;

public class Yatzy {

    protected List<Integer> dices;

    public Yatzy(final int dice1, final int dice2, final int dice3, final int dice4, final int dice5) {
        this.dices = Arrays.asList(dice1, dice2, dice3, dice4, dice5);
    }

    public int yatzy() {
        final int[] counts = this.countDices();
        for (final int count : counts) {
            if (count == 5) {
                return 50;
            }
        }
        return 0;
    }

    public int chance() {
        int sum = 0;
        for (final int dice : this.dices) {
            sum += dice;
        }
        return sum;
    }

    public int ones() {
        return this.countDices(1);
    }

    public int twos() {
        return this.countDices(2);
    }

    public int threes() {
        return this.countDices(3);
    }

    public int fours() {
        return this.countDices(4);
    }

    public int fives() {
        return this.countDices(5);
    }

    public int sixes() {
        return this.countDices(6);
    }

    public int pair() {
        final int[] counts = this.countDices();
        for (int at = 0; at < counts.length; at++) {
            if (counts[6 - at - 1] >= 2) {
                return (6 - at) * 2;
            }
        }
        return 0;
    }

    public int twoPair() {
        final int[] counts = this.countDices();
        int pairNumber = 0;
        int score = 0;
        for (int i = 0; i < counts.length; i += 1) {
            if (counts[6 - i - 1] >= 2) {
                pairNumber++;
                score += (6 - i);
            }
        }
        if (pairNumber == 2) {
            return score * 2;
        } else {
            return 0;
        }
    }

    public int fourOfAKind() {
        final int[] counts = this.countDices();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] >= 4) {
                return (i + 1) * 4;
            }
        }
        return 0;
    }

    public int threeOfAKind() {
        final int[] counts = this.countDices();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] >= 3) {
                return (i + 1) * 3;
            }
        }
        return 0;
    }

    public int smallStraight() {
        final int[] counts = this.countDices();
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
        final int[] counts = this.countDices();
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

        final int[] counts = this.countDices();

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

    private int[] countDices() {
        final int[] counts = new int[6];
        counts[this.dices.get(0) - 1] += 1;
        counts[this.dices.get(1) - 1] += 1;
        counts[this.dices.get(2) - 1] += 1;
        counts[this.dices.get(3) - 1] += 1;
        counts[this.dices.get(4) - 1] += 1;
        return counts;
    }

    private int countDices(final int diceValue) {
        int sum = 0;
        for (final int dice : this.dices) {
            if (dice == diceValue) {
                sum = sum + diceValue;
            }
        }
        return sum;
    }
}



