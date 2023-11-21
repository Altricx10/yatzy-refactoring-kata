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
        for (int i = 0; i != 6; i++) {
            if (counts[i] == 5) {
                return 50;
            }
        }
        return 0;
    }

    public int chance() {
        int sum;
        sum = 0;
        for (int at = 0; at != 5; at++) {
            sum += this.dices[at];
        }
        return sum;
    }

    public int ones() {
        int sum;
        sum = 0;
        for (int at = 0; at != 5; at++) {
            if (this.dices[at] == 1) {
                sum += 1;
            }
        }
        return sum;
    }

    public int twos() {
        int sum;
        sum = 0;
        for (int at = 0; at != 5; at++) {
            if (this.dices[at] == 2) {
                sum += 2;
            }
        }
        return sum;
    }

    public int threes() {
        int sum;
        sum = 0;
        for (int at = 0; at != 5; at++) {
            if (this.dices[at] == 3) {
                sum += 3;
            }
        }
        return sum;
    }

    public int fours() {
        int sum;
        sum = 0;
        for (int at = 0; at != 5; at++) {
            if (this.dices[at] == 4) {
                sum += 4;
            }
        }
        return sum;
    }

    public int fives() {
        int sum = 0;
        for (int i = 0; i < this.dices.length; i++) {
            if (this.dices[i] == 5) {
                sum = sum + 5;
            }
        }
        return sum;
    }

    public int sixes() {
        int sum = 0;
        for (int at = 0; at < this.dices.length; at++) {
            if (this.dices[at] == 6) {
                sum = sum + 6;
            }
        }
        return sum;
    }

    public static int score_pair(final int dice1, final int dice2, final int dice3, final int dice4, final int dice5) {
        final int[] counts = new int[6];
        counts[dice1 - 1]++;
        counts[dice2 - 1]++;
        counts[dice3 - 1]++;
        counts[dice4 - 1]++;
        counts[dice5 - 1]++;
        for (int at = 0; at != 6; at++) {
            if (counts[6 - at - 1] >= 2) {
                return (6 - at) * 2;
            }
        }
        return 0;
    }

    public static int two_pair(final int dice1, final int dice2, final int dice3, final int dice4, final int dice5) {
        final int[] counts = new int[6];
        counts[dice1 - 1]++;
        counts[dice2 - 1]++;
        counts[dice3 - 1]++;
        counts[dice4 - 1]++;
        counts[dice5 - 1]++;
        int pairNumber = 0;
        int score = 0;
        for (int i = 0; i < 6; i += 1) {
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

    public static int four_of_a_kind(final int dice1, final int dice2, final int dice3, final int dice4, final int dice5) {
        final int[] counts = new int[6];
        counts[dice1 - 1]++;
        counts[dice2 - 1]++;
        counts[dice3 - 1]++;
        counts[dice4 - 1]++;
        counts[dice5 - 1]++;
        for (int i = 0; i < 6; i++) {
            if (counts[i] >= 4) {
                return (i + 1) * 4;
            }
        }
        return 0;
    }

    public static int three_of_a_kind(final int dice1, final int dice2, final int dice3, final int dice4, final int dice5) {
        final int[] counts = new int[6];
        counts[dice1 - 1]++;
        counts[dice2 - 1]++;
        counts[dice3 - 1]++;
        counts[dice4 - 1]++;
        counts[dice5 - 1]++;
        for (int i = 0; i < 6; i++) {
            if (counts[i] >= 3) {
                return (i + 1) * 3;
            }
        }
        return 0;
    }

    public static int smallStraight(final int dice1, final int dice2, final int dice3, final int dice4, final int dice5) {
        final int[] counts = new int[6];
        counts[dice1 - 1] += 1;
        counts[dice2 - 1] += 1;
        counts[dice3 - 1] += 1;
        counts[dice4 - 1] += 1;
        counts[dice5 - 1] += 1;
        if (counts[0] == 1 &&
            counts[1] == 1 &&
            counts[2] == 1 &&
            counts[3] == 1 &&
            counts[4] == 1) {
            return 15;
        }
        return 0;
    }

    public static int largeStraight(final int dice1, final int dice2, final int dice3, final int dice4, final int dice5) {
        final int[] counts = new int[6];
        counts[dice1 - 1] += 1;
        counts[dice2 - 1] += 1;
        counts[dice3 - 1] += 1;
        counts[dice4 - 1] += 1;
        counts[dice5 - 1] += 1;
        if (counts[1] == 1 &&
            counts[2] == 1 &&
            counts[3] == 1 &&
            counts[4] == 1
            && counts[5] == 1) {
            return 20;
        }
        return 0;
    }

    public static int fullHouse(final int dice1, final int dice2, final int dice3, final int dice4, final int dice5) {
        final int[] counts = new int[6];
        boolean haveTwoSameDice = false;
        int twoSameDiceValue = 0;
        boolean haveThreeSameDice = false;
        int threeSameDiceValue = 0;

        counts[dice1 - 1] += 1;
        counts[dice2 - 1] += 1;
        counts[dice3 - 1] += 1;
        counts[dice4 - 1] += 1;
        counts[dice5 - 1] += 1;

        for (int i = 0; i != 6; i += 1) {
            if (counts[i] == 2) {
                haveTwoSameDice = true;
                twoSameDiceValue = i + 1;
            }
        }

        for (int i = 0; i != 6; i += 1) {
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



