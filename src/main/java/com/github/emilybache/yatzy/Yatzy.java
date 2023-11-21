package com.github.emilybache.yatzy;

public class Yatzy {

    protected int[] dices;

    public Yatzy(final int dice1, final int dice2, final int dice3, final int dice4, final int dice5) {
        this.dices = new int[5];
        this.dices[0] = dice1;
        this.dices[1] = dice2;
        this.dices[2] = dice3;
        this.dices[3] = dice4;
        this.dices[4] = dice5;
    }

    public int yatzy() {
        final int[] counts = new int[6];
        for (final int dice : this.dices) {
            counts[dice - 1]++;
        }
        for (final int count : counts) {
            if (count == 5) {
                return 50;
            }
        }
        return 0;
    }

    public int chance() {
        int sum;
        sum = 0;
        for (final int dice : this.dices) {
            sum += dice;
        }
        return sum;
    }

    public int ones() {
        int sum;
        sum = 0;
        for (final int dice : this.dices) {
            if (dice == 1) {
                sum += 1;
            }
        }
        return sum;
    }

    public int twos() {
        int sum;
        sum = 0;
        for (final int dice : this.dices) {
            if (dice == 2) {
                sum += 2;
            }
        }
        return sum;
    }

    public int threes() {
        int sum;
        sum = 0;
        for (final int dice : this.dices) {
            if (dice == 3) {
                sum += 3;
            }
        }
        return sum;
    }

    public int fours() {
        int sum;
        sum = 0;
        for (final int dice : this.dices) {
            if (dice == 4) {
                sum += 4;
            }
        }
        return sum;
    }

    public int fives() {
        int sum = 0;
        for (final int dice : this.dices) {
            if (dice == 5) {
                sum = sum + 5;
            }
        }
        return sum;
    }

    public int sixes() {
        int sum = 0;
        for (final int dice : this.dices) {
            if (dice == 6) {
                sum = sum + 6;
            }
        }
        return sum;
    }

    public int pair() {
        final int[] counts = new int[6];
        counts[this.dices[0] - 1]++;
        counts[this.dices[1] - 1]++;
        counts[this.dices[2] - 1]++;
        counts[this.dices[3] - 1]++;
        counts[this.dices[4] - 1]++;
        for (int at = 0; at < counts.length; at++) {
            if (counts[6 - at - 1] >= 2) {
                return (6 - at) * 2;
            }
        }
        return 0;
    }

    public int twoPair() {
        final int[] counts = new int[6];
        counts[this.dices[0] - 1]++;
        counts[this.dices[1] - 1]++;
        counts[this.dices[2] - 1]++;
        counts[this.dices[3] - 1]++;
        counts[this.dices[4] - 1]++;
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
        final int[] counts = new int[6];
        counts[this.dices[0] - 1]++;
        counts[this.dices[1] - 1]++;
        counts[this.dices[2] - 1]++;
        counts[this.dices[3] - 1]++;
        counts[this.dices[4] - 1]++;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] >= 4) {
                return (i + 1) * 4;
            }
        }
        return 0;
    }

    public int threeOfAKind() {
        final int[] counts = new int[6];
        counts[this.dices[0] - 1]++;
        counts[this.dices[1] - 1]++;
        counts[this.dices[2] - 1]++;
        counts[this.dices[3] - 1]++;
        counts[this.dices[4] - 1]++;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] >= 3) {
                return (i + 1) * 3;
            }
        }
        return 0;
    }

    public int smallStraight() {
        final int[] counts = new int[6];
        counts[this.dices[0] - 1] += 1;
        counts[this.dices[1] - 1] += 1;
        counts[this.dices[2] - 1] += 1;
        counts[this.dices[3] - 1] += 1;
        counts[this.dices[4] - 1] += 1;
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
        final int[] counts = new int[6];
        counts[this.dices[0] - 1] += 1;
        counts[this.dices[1] - 1] += 1;
        counts[this.dices[2] - 1] += 1;
        counts[this.dices[3] - 1] += 1;
        counts[this.dices[4] - 1] += 1;
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
        final int[] counts = new int[6];
        boolean haveTwoSameDice = false;
        int twoSameDiceValue = 0;
        boolean haveThreeSameDice = false;
        int threeSameDiceValue = 0;

        counts[this.dices[0] - 1] += 1;
        counts[this.dices[1] - 1] += 1;
        counts[this.dices[2] - 1] += 1;
        counts[this.dices[3] - 1] += 1;
        counts[this.dices[4] - 1] += 1;

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
}



