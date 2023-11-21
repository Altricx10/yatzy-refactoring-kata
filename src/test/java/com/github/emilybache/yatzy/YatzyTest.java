package com.github.emilybache.yatzy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("yatzy unit test")
public class YatzyTest {
    private Yatzy yatzy;

    @Nested
    @DisplayName("given five different dices")
    class GivenFiveDifferentDices {

        private final int dice1 = 1;
        private final int dice2 = 3;
        private final int dice3 = 4;
        private final int dice4 = 5;
        private final int dice5 = 6;

        @BeforeEach
        void setUp() {
            YatzyTest.this.yatzy = new Yatzy(this.dice1, this.dice2, this.dice3, this.dice4, this.dice5);
        }

        @Nested
        @DisplayName("whe calling #chance")
        class WhenCallingChance {

            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.chance();
            }

            @Test
            @DisplayName("then it should return 19")
            void thenItShouldReturn19() {
                assertThat(this.result).isEqualTo(19);
            }
        }

        @Nested
        @DisplayName("when calling #yatzy")
        class WhenCallingYatzy {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.yatzy();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #ones")
        class WhenCallingOnes {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.ones();
            }

            @Test
            @DisplayName("then it should return 1")
            void thenItShouldReturn1() {
                assertThat(this.result).isEqualTo(1);
            }
        }

        @Nested
        @DisplayName("when calling #twos")
        class WhenCallingTwos {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.twos();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #threes")
        class WhenCallingThrees {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.threes();
            }

            @Test
            @DisplayName("then it should return 3")
            void thenItShouldReturn3() {
                assertThat(this.result).isEqualTo(3);
            }
        }

        @Nested
        @DisplayName("when calling #fours")
        class WhenCallingFours {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.fours();
            }

            @Test
            @DisplayName("then it should return 4")
            void thenItShouldReturn4() {
                assertThat(this.result).isEqualTo(4);
            }
        }

        @Nested
        @DisplayName("when calling #fives")
        class WhenCallingFives {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.fives();
            }

            @Test
            @DisplayName("then it should return 5")
            void thenItShouldReturn5() {
                assertThat(this.result).isEqualTo(5);
            }
        }

        @Nested
        @DisplayName("when calling #sixes")
        class WhenCallingSixes {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.sixes();
            }

            @Test
            @DisplayName("then it should return 6")
            void thenItShouldReturn6() {
                assertThat(this.result).isEqualTo(6);
            }
        }

        @Nested
        @DisplayName("when calling #score_pair")
        class WhenCallingScorePair {

            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.pair();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #two_pair")
        class WhenCallingTwoPair {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.twoPair();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #thre_of_a_kind")
        class WhenCallingThreeOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.threeOfAKind();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #four_of_a_kind")
        class WhenCallingFourOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.fourOfAKind();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #smallStraight")
        class WhenCallingSmallStraight {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.smallStraight();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #largeStraight")
        class WhenCallingLargeStraight {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = Yatzy.largeStraight(GivenFiveDifferentDices.this.dice1, GivenFiveDifferentDices.this.dice2, GivenFiveDifferentDices.this.dice3, GivenFiveDifferentDices.this.dice4, GivenFiveDifferentDices.this.dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fullHouse")
        class WhenCallingFullHouse {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = Yatzy.fullHouse(GivenFiveDifferentDices.this.dice1, GivenFiveDifferentDices.this.dice2, GivenFiveDifferentDices.this.dice3, GivenFiveDifferentDices.this.dice4, GivenFiveDifferentDices.this.dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }
    }

    @Nested
    @DisplayName("given two same dices")
    class GivenTwoSameDices {

        private final int dice1 = 1;
        private final int dice2 = 1;
        private final int dice3 = 4;
        private final int dice4 = 5;
        private final int dice5 = 6;

        @BeforeEach
        void setUp() {
            YatzyTest.this.yatzy = new Yatzy(this.dice1, this.dice2, this.dice3, this.dice4, this.dice5);
        }

        @Nested
        @DisplayName("whe calling #chance")
        class WhenCallingChance {

            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.chance();
            }

            @Test
            @DisplayName("then it should return 17")
            void thenItShouldReturn17() {
                assertThat(this.result).isEqualTo(17);
            }
        }

        @Nested
        @DisplayName("when calling #yatzy")
        class WhenCallingYatzy {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.yatzy();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #ones")
        class WhenCallingOnes {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.ones();
            }

            @Test
            @DisplayName("then it should return 2")
            void thenItShouldReturn2() {
                assertThat(this.result).isEqualTo(2);
            }
        }

        @Nested
        @DisplayName("when calling #twos")
        class WhenCallingTwos {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.twos();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #threes")
        class WhenCallingThrees {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.threes();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fours")
        class WhenCallingFours {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.fours();
            }

            @Test
            @DisplayName("then it should return 4")
            void thenItShouldReturn4() {
                assertThat(this.result).isEqualTo(4);
            }
        }

        @Nested
        @DisplayName("when calling #fives")
        class WhenCallingFives {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.fives();
            }

            @Test
            @DisplayName("then it should return 5")
            void thenItShouldReturn5() {
                assertThat(this.result).isEqualTo(5);
            }
        }

        @Nested
        @DisplayName("when calling #sixes")
        class WhenCallingSixes {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.sixes();
            }

            @Test
            @DisplayName("then it should return 6")
            void thenItShouldReturn6() {
                assertThat(this.result).isEqualTo(6);
            }
        }

        @Nested
        @DisplayName("when calling #score_pair")
        class WhenCallingScorePair {

            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.pair();
            }

            @Test
            @DisplayName("then it should return 2")
            void thenItShouldReturn2() {
                assertThat(this.result).isEqualTo(2);
            }
        }

        @Nested
        @DisplayName("when calling #two_pair")
        class WhenCallingTwoPair {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.twoPair();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #thre_of_a_kind")
        class WhenCallingThreeOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.threeOfAKind();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #four_of_a_kind")
        class WhenCallingFourOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.fourOfAKind();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #smallStraight")
        class WhenCallingSmallStraight {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.smallStraight();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #largeStraight")
        class WhenCallingLargeStraight {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = Yatzy.largeStraight(GivenTwoSameDices.this.dice1, GivenTwoSameDices.this.dice2, GivenTwoSameDices.this.dice3, GivenTwoSameDices.this.dice4, GivenTwoSameDices.this.dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fullHouse")
        class WhenCallingFullHouse {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = Yatzy.fullHouse(GivenTwoSameDices.this.dice1, GivenTwoSameDices.this.dice2, GivenTwoSameDices.this.dice3, GivenTwoSameDices.this.dice4, GivenTwoSameDices.this.dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }
    }

    @Nested
    @DisplayName("given three same dices")
    class GivenThreeSameDices {

        private final int dice1 = 1;
        private final int dice2 = 1;
        private final int dice3 = 1;
        private final int dice4 = 5;
        private final int dice5 = 6;

        @BeforeEach
        void setUp() {
            YatzyTest.this.yatzy = new Yatzy(this.dice1, this.dice2, this.dice3, this.dice4, this.dice5);
        }

        @Nested
        @DisplayName("whe calling #chance")
        class WhenCallingChance {

            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.chance();
            }

            @Test
            @DisplayName("then it should return 14")
            void thenItShouldReturn14() {
                assertThat(this.result).isEqualTo(14);
            }
        }

        @Nested
        @DisplayName("when calling #yatzy")
        class WhenCallingYatzy {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.yatzy();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #ones")
        class WhenCallingOnes {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.ones();
            }

            @Test
            @DisplayName("then it should return 3")
            void thenItShouldReturn3() {
                assertThat(this.result).isEqualTo(3);
            }
        }

        @Nested
        @DisplayName("when calling #twos")
        class WhenCallingTwos {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.twos();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #threes")
        class WhenCallingThrees {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.threes();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fours")
        class WhenCallingFours {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.fours();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fives")
        class WhenCallingFives {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.fives();
            }

            @Test
            @DisplayName("then it should return 5")
            void thenItShouldReturn5() {
                assertThat(this.result).isEqualTo(5);
            }
        }

        @Nested
        @DisplayName("when calling #sixes")
        class WhenCallingSixes {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.sixes();
            }

            @Test
            @DisplayName("then it should return 6")
            void thenItShouldReturn6() {
                assertThat(this.result).isEqualTo(6);
            }
        }

        @Nested
        @DisplayName("when calling #score_pair")
        class WhenCallingScorePair {

            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.pair();
            }

            @Test
            @DisplayName("then it should return 2")
            void thenItShouldReturn2() {
                assertThat(this.result).isEqualTo(2);
            }
        }

        @Nested
        @DisplayName("when calling #two_pair")
        class WhenCallingTwoPair {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.twoPair();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #three_of_a_kind")
        class WhenCallingThreeOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.threeOfAKind();
            }

            @Test
            @DisplayName("then it should return 3")
            void thenItShouldReturn3() {
                assertThat(this.result).isEqualTo(3);
            }
        }

        @Nested
        @DisplayName("when calling #four_of_a_kind")
        class WhenCallingFourOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.fourOfAKind();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #smallStraight")
        class WhenCallingSmallStraight {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.smallStraight();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #largeStraight")
        class WhenCallingLargeStraight {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = Yatzy.largeStraight(GivenThreeSameDices.this.dice1, GivenThreeSameDices.this.dice2, GivenThreeSameDices.this.dice3, GivenThreeSameDices.this.dice4, GivenThreeSameDices.this.dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fullHouse")
        class WhenCallingFullHouse {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = Yatzy.fullHouse(GivenThreeSameDices.this.dice1, GivenThreeSameDices.this.dice2, GivenThreeSameDices.this.dice3, GivenThreeSameDices.this.dice4, GivenThreeSameDices.this.dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }
    }

    @Nested
    @DisplayName("given four same dices")
    class GivenFourSameDices {

        private final int dice1 = 1;
        private final int dice2 = 1;
        private final int dice3 = 1;
        private final int dice4 = 1;
        private final int dice5 = 6;

        @BeforeEach
        void setUp() {
            YatzyTest.this.yatzy = new Yatzy(this.dice1, this.dice2, this.dice3, this.dice4, this.dice5);
        }

        @Nested
        @DisplayName("whe calling #chance")
        class WhenCallingChance {

            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.chance();
            }

            @Test
            @DisplayName("then it should return 10")
            void thenItShouldReturn10() {
                assertThat(this.result).isEqualTo(10);
            }
        }

        @Nested
        @DisplayName("when calling #yatzy")
        class WhenCallingYatzy {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.yatzy();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #ones")
        class WhenCallingOnes {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.ones();
            }

            @Test
            @DisplayName("then it should return 4")
            void thenItShouldReturn4() {
                assertThat(this.result).isEqualTo(4);
            }
        }

        @Nested
        @DisplayName("when calling #twos")
        class WhenCallingTwos {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.twos();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #threes")
        class WhenCallingThrees {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.threes();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fours")
        class WhenCallingFours {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.fours();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fives")
        class WhenCallingFives {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.fives();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #sixes")
        class WhenCallingSixes {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.sixes();
            }

            @Test
            @DisplayName("then it should return 6")
            void thenItShouldReturn6() {
                assertThat(this.result).isEqualTo(6);
            }
        }

        @Nested
        @DisplayName("when calling #score_pair")
        class WhenCallingScorePair {

            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.pair();
            }

            @Test
            @DisplayName("then it should return 2")
            void thenItShouldReturn2() {
                assertThat(this.result).isEqualTo(2);
            }
        }

        @Nested
        @DisplayName("when calling #two_pair")
        class WhenCallingTwoPair {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.twoPair();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #three_of_a_kind")
        class WhenCallingThreeOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.threeOfAKind();
            }

            @Test
            @DisplayName("then it should return 3")
            void thenItShouldReturn3() {
                assertThat(this.result).isEqualTo(3);
            }
        }

        @Nested
        @DisplayName("when calling #four_of_a_kind")
        class WhenCallingFourOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.fourOfAKind();
            }

            @Test
            @DisplayName("then it should return 4")
            void thenItShouldReturn4() {
                assertThat(this.result).isEqualTo(4);
            }
        }

        @Nested
        @DisplayName("when calling #smallStraight")
        class WhenCallingSmallStraight {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.smallStraight();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #largeStraight")
        class WhenCallingLargeStraight {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = Yatzy.largeStraight(GivenFourSameDices.this.dice1, GivenFourSameDices.this.dice2, GivenFourSameDices.this.dice3, GivenFourSameDices.this.dice4, GivenFourSameDices.this.dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fullHouse")
        class WhenCallingFullHouse {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = Yatzy.fullHouse(GivenFourSameDices.this.dice1, GivenFourSameDices.this.dice2, GivenFourSameDices.this.dice3, GivenFourSameDices.this.dice4, GivenFourSameDices.this.dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }
    }

    @Nested
    @DisplayName("given five same dices")
    class GivenFiveSameDices {

        private final int dice1 = 1;
        private final int dice2 = 1;
        private final int dice3 = 1;
        private final int dice4 = 1;
        private final int dice5 = 1;

        @BeforeEach
        void setUp() {
            YatzyTest.this.yatzy = new Yatzy(this.dice1, this.dice2, this.dice3, this.dice4, this.dice5);
        }

        @Nested
        @DisplayName("whe calling #chance")
        class WhenCallingChance {

            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.chance();
            }

            @Test
            @DisplayName("then it should return 5")
            void thenItShouldReturn5() {
                assertThat(this.result).isEqualTo(5);
            }
        }

        @Nested
        @DisplayName("when calling #yatzy")
        class WhenCallingYatzy {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.yatzy();
            }

            @Test
            @DisplayName("then it should return 50")
            void thenItShouldReturn50() {
                assertThat(this.result).isEqualTo(50);
            }
        }

        @Nested
        @DisplayName("when calling #ones")
        class WhenCallingOnes {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.ones();
            }

            @Test
            @DisplayName("then it should return 5")
            void thenItShouldReturn5() {
                assertThat(this.result).isEqualTo(5);
            }
        }

        @Nested
        @DisplayName("when calling #twos")
        class WhenCallingTwos {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.twos();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #threes")
        class WhenCallingThrees {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.threes();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fours")
        class WhenCallingFours {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.fours();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fives")
        class WhenCallingFives {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.fives();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #sixes")
        class WhenCallingSixes {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.sixes();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #score_pair")
        class WhenCallingScorePair {

            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.pair();
            }

            @Test
            @DisplayName("then it should return 2")
            void thenItShouldReturn2() {
                assertThat(this.result).isEqualTo(2);
            }
        }

        @Nested
        @DisplayName("when calling #two_pair")
        class WhenCallingTwoPair {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.twoPair();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #three_of_a_kind")
        class WhenCallingThreeOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.threeOfAKind();
            }

            @Test
            @DisplayName("then it should return 3")
            void thenItShouldReturn3() {
                assertThat(this.result).isEqualTo(3);
            }
        }

        @Nested
        @DisplayName("when calling #four_of_a_kind")
        class WhenCallingFourOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.fourOfAKind();
            }

            @Test
            @DisplayName("then it should return 4")
            void thenItShouldReturn4() {
                assertThat(this.result).isEqualTo(4);
            }
        }

        @Nested
        @DisplayName("when calling #smallStraight")
        class WhenCallingSmallStraight {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.smallStraight();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #largeStraight")
        class WhenCallingLargeStraight {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = Yatzy.largeStraight(GivenFiveSameDices.this.dice1, GivenFiveSameDices.this.dice2, GivenFiveSameDices.this.dice3, GivenFiveSameDices.this.dice4, GivenFiveSameDices.this.dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fullHouse")
        class WhenCallingFullHouse {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = Yatzy.fullHouse(GivenFiveSameDices.this.dice1, GivenFiveSameDices.this.dice2, GivenFiveSameDices.this.dice3, GivenFiveSameDices.this.dice4, GivenFiveSameDices.this.dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }
    }

    @Nested
    @DisplayName("given two same dices and other two same dices")
    class GivenTwoSameDicesAndOtherTwoSameDices {

        private final int dice1 = 1;
        private final int dice2 = 1;
        private final int dice3 = 2;
        private final int dice4 = 2;
        private final int dice5 = 6;

        @BeforeEach
        void setUp() {
            YatzyTest.this.yatzy = new Yatzy(this.dice1, this.dice2, this.dice3, this.dice4, this.dice5);
        }

        @Nested
        @DisplayName("whe calling #chance")
        class WhenCallingChance {

            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.chance();
            }

            @Test
            @DisplayName("then it should return 12")
            void thenItShouldReturn12() {
                assertThat(this.result).isEqualTo(12);
            }
        }

        @Nested
        @DisplayName("when calling #yatzy")
        class WhenCallingYatzy {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.yatzy();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #ones")
        class WhenCallingOnes {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.ones();
            }

            @Test
            @DisplayName("then it should return 2")
            void thenItShouldReturn2() {
                assertThat(this.result).isEqualTo(2);
            }
        }

        @Nested
        @DisplayName("when calling #twos")
        class WhenCallingTwos {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.twos();
            }

            @Test
            @DisplayName("then it should return 4")
            void thenItShouldReturn4() {
                assertThat(this.result).isEqualTo(4);
            }
        }

        @Nested
        @DisplayName("when calling #threes")
        class WhenCallingThrees {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.threes();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fours")
        class WhenCallingFours {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.fours();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fives")
        class WhenCallingFives {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.fives();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #sixes")
        class WhenCallingSixes {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.sixes();
            }

            @Test
            @DisplayName("then it should return 6")
            void thenItShouldReturn6() {
                assertThat(this.result).isEqualTo(6);
            }
        }

        @Nested
        @DisplayName("when calling #score_pair")
        class WhenCallingScorePair {

            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.pair();
            }

            @Test
            @DisplayName("then it should return 4")
            void thenItShouldReturn4() {
                assertThat(this.result).isEqualTo(4);
            }
        }

        @Nested
        @DisplayName("when calling #two_pair")
        class WhenCallingTwoPair {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.twoPair();
            }

            @Test
            @DisplayName("then it should return 6")
            void thenItShouldReturn6() {
                assertThat(this.result).isEqualTo(6);
            }
        }

        @Nested
        @DisplayName("when calling #three_of_a_kind")
        class WhenCallingThreeOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.threeOfAKind();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #four_of_a_kind")
        class WhenCallingFourOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.fourOfAKind();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #smallStraight")
        class WhenCallingSmallStraight {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.smallStraight();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #largeStraight")
        class WhenCallingLargeStraight {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = Yatzy.largeStraight(GivenTwoSameDicesAndOtherTwoSameDices.this.dice1, GivenTwoSameDicesAndOtherTwoSameDices.this.dice2, GivenTwoSameDicesAndOtherTwoSameDices.this.dice3, GivenTwoSameDicesAndOtherTwoSameDices.this.dice4, GivenTwoSameDicesAndOtherTwoSameDices.this.dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fullHouse")
        class WhenCallingFullHouse {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = Yatzy.fullHouse(GivenTwoSameDicesAndOtherTwoSameDices.this.dice1, GivenTwoSameDicesAndOtherTwoSameDices.this.dice2, GivenTwoSameDicesAndOtherTwoSameDices.this.dice3, GivenTwoSameDicesAndOtherTwoSameDices.this.dice4, GivenTwoSameDicesAndOtherTwoSameDices.this.dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }
    }

    @Nested
    @DisplayName("given three same dices and other two same dices")
    class GivenThreeSameDicesAndOtherTwoSameDices {

        private final int dice1 = 1;
        private final int dice2 = 1;
        private final int dice3 = 1;
        private final int dice4 = 2;
        private final int dice5 = 2;

        @BeforeEach
        void setUp() {
            YatzyTest.this.yatzy = new Yatzy(this.dice1, this.dice2, this.dice3, this.dice4, this.dice5);
        }

        @Nested
        @DisplayName("whe calling #chance")
        class WhenCallingChance {

            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.chance();
            }

            @Test
            @DisplayName("then it should return 7")
            void thenItShouldReturn7() {
                assertThat(this.result).isEqualTo(7);
            }
        }

        @Nested
        @DisplayName("when calling #yatzy")
        class WhenCallingYatzy {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.yatzy();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #ones")
        class WhenCallingOnes {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.ones();
            }

            @Test
            @DisplayName("then it should return 3")
            void thenItShouldReturn3() {
                assertThat(this.result).isEqualTo(3);
            }
        }

        @Nested
        @DisplayName("when calling #twos")
        class WhenCallingTwos {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.twos();
            }

            @Test
            @DisplayName("then it should return 4")
            void thenItShouldReturn4() {
                assertThat(this.result).isEqualTo(4);
            }
        }

        @Nested
        @DisplayName("when calling #threes")
        class WhenCallingThrees {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.threes();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fours")
        class WhenCallingFours {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.fours();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fives")
        class WhenCallingFives {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.fives();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #sixes")
        class WhenCallingSixes {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.sixes();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #score_pair")
        class WhenCallingScorePair {

            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.pair();
            }

            @Test
            @DisplayName("then it should return 4")
            void thenItShouldReturn4() {
                assertThat(this.result).isEqualTo(4);
            }
        }

        @Nested
        @DisplayName("when calling #two_pair")
        class WhenCallingTwoPair {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.twoPair();
            }

            @Test
            @DisplayName("then it should return 6")
            void thenItShouldReturn6() {
                assertThat(this.result).isEqualTo(6);
            }
        }

        @Nested
        @DisplayName("when calling #three_of_a_kind")
        class WhenCallingThreeOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.threeOfAKind();
            }

            @Test
            @DisplayName("then it should return 3")
            void thenItShouldReturn3() {
                assertThat(this.result).isEqualTo(3);
            }
        }

        @Nested
        @DisplayName("when calling #four_of_a_kind")
        class WhenCallingFourOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.fourOfAKind();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #smallStraight")
        class WhenCallingSmallStraight {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.smallStraight();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #largeStraight")
        class WhenCallingLargeStraight {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = Yatzy.largeStraight(GivenThreeSameDicesAndOtherTwoSameDices.this.dice1, GivenThreeSameDicesAndOtherTwoSameDices.this.dice2, GivenThreeSameDicesAndOtherTwoSameDices.this.dice3, GivenThreeSameDicesAndOtherTwoSameDices.this.dice4, GivenThreeSameDicesAndOtherTwoSameDices.this.dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fullHouse")
        class WhenCallingFullHouse {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = Yatzy.fullHouse(GivenThreeSameDicesAndOtherTwoSameDices.this.dice1, GivenThreeSameDicesAndOtherTwoSameDices.this.dice2, GivenThreeSameDicesAndOtherTwoSameDices.this.dice3, GivenThreeSameDicesAndOtherTwoSameDices.this.dice4, GivenThreeSameDicesAndOtherTwoSameDices.this.dice5);
            }

            @Test
            @DisplayName("then it should return 7")
            void thenItShouldReturn7() {
                assertThat(this.result).isEqualTo(7);
            }
        }
    }

    @Nested
    @DisplayName("given small straight")
    class GivenSmallStraight {

        private final int dice1 = 1;
        private final int dice2 = 2;
        private final int dice3 = 3;
        private final int dice4 = 4;
        private final int dice5 = 5;

        @BeforeEach
        void setUp() {
            YatzyTest.this.yatzy = new Yatzy(this.dice1, this.dice2, this.dice3, this.dice4, this.dice5);
        }

        @Nested
        @DisplayName("whe calling #chance")
        class WhenCallingChance {

            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.chance();
            }

            @Test
            @DisplayName("then it should return 15")
            void thenItShouldReturn15() {
                assertThat(this.result).isEqualTo(15);
            }
        }

        @Nested
        @DisplayName("when calling #yatzy")
        class WhenCallingYatzy {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.yatzy();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #ones")
        class WhenCallingOnes {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.ones();
            }

            @Test
            @DisplayName("then it should return 1")
            void thenItShouldReturn1() {
                assertThat(this.result).isEqualTo(1);
            }
        }

        @Nested
        @DisplayName("when calling #twos")
        class WhenCallingTwos {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.twos();
            }

            @Test
            @DisplayName("then it should return 2")
            void thenItShouldReturn2() {
                assertThat(this.result).isEqualTo(2);
            }
        }

        @Nested
        @DisplayName("when calling #threes")
        class WhenCallingThrees {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.threes();
            }

            @Test
            @DisplayName("then it should return 3")
            void thenItShouldReturn3() {
                assertThat(this.result).isEqualTo(3);
            }
        }

        @Nested
        @DisplayName("when calling #fours")
        class WhenCallingFours {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.fours();
            }

            @Test
            @DisplayName("then it should return 4")
            void thenItShouldReturn4() {
                assertThat(this.result).isEqualTo(4);
            }
        }

        @Nested
        @DisplayName("when calling #fives")
        class WhenCallingFives {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.fives();
            }

            @Test
            @DisplayName("then it should return 5")
            void thenItShouldReturn5() {
                assertThat(this.result).isEqualTo(5);
            }
        }

        @Nested
        @DisplayName("when calling #sixes")
        class WhenCallingSixes {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.sixes();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #score_pair")
        class WhenCallingScorePair {

            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.pair();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #two_pair")
        class WhenCallingTwoPair {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.twoPair();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #three_of_a_kind")
        class WhenCallingThreeOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.threeOfAKind();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #four_of_a_kind")
        class WhenCallingFourOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.fourOfAKind();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #smallStraight")
        class WhenCallingSmallStraight {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.smallStraight();
            }

            @Test
            @DisplayName("then it should return 15")
            void thenItShouldReturn15() {
                assertThat(this.result).isEqualTo(15);
            }
        }

        @Nested
        @DisplayName("when calling #largeStraight")
        class WhenCallingLargeStraight {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = Yatzy.largeStraight(GivenSmallStraight.this.dice1, GivenSmallStraight.this.dice2, GivenSmallStraight.this.dice3, GivenSmallStraight.this.dice4, GivenSmallStraight.this.dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fullHouse")
        class WhenCallingFullHouse {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = Yatzy.fullHouse(GivenSmallStraight.this.dice1, GivenSmallStraight.this.dice2, GivenSmallStraight.this.dice3, GivenSmallStraight.this.dice4, GivenSmallStraight.this.dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }
    }

    @Nested
    @DisplayName("given large straight")
    class GivenLargeStraight {

        private final int dice1 = 2;
        private final int dice2 = 3;
        private final int dice3 = 4;
        private final int dice4 = 5;
        private final int dice5 = 6;

        @BeforeEach
        void setUp() {
            YatzyTest.this.yatzy = new Yatzy(this.dice1, this.dice2, this.dice3, this.dice4, this.dice5);
        }

        @Nested
        @DisplayName("whe calling #chance")
        class WhenCallingChance {

            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.chance();
            }

            @Test
            @DisplayName("then it should return 20")
            void thenItShouldReturn20() {
                assertThat(this.result).isEqualTo(20);
            }
        }

        @Nested
        @DisplayName("when calling #yatzy")
        class WhenCallingYatzy {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.yatzy();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #ones")
        class WhenCallingOnes {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.ones();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #twos")
        class WhenCallingTwos {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.twos();
            }

            @Test
            @DisplayName("then it should return 2")
            void thenItShouldReturn2() {
                assertThat(this.result).isEqualTo(2);
            }
        }

        @Nested
        @DisplayName("when calling #threes")
        class WhenCallingThrees {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.threes();
            }

            @Test
            @DisplayName("then it should return 3")
            void thenItShouldReturn3() {
                assertThat(this.result).isEqualTo(3);
            }
        }

        @Nested
        @DisplayName("when calling #fours")
        class WhenCallingFours {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.fours();
            }

            @Test
            @DisplayName("then it should return 4")
            void thenItShouldReturn4() {
                assertThat(this.result).isEqualTo(4);
            }
        }

        @Nested
        @DisplayName("when calling #fives")
        class WhenCallingFives {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.fives();
            }

            @Test
            @DisplayName("then it should return 5")
            void thenItShouldReturn5() {
                assertThat(this.result).isEqualTo(5);
            }
        }

        @Nested
        @DisplayName("when calling #sixes")
        class WhenCallingSixes {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.sixes();
            }

            @Test
            @DisplayName("then it should return 6")
            void thenItShouldReturn6() {
                assertThat(this.result).isEqualTo(6);
            }
        }

        @Nested
        @DisplayName("when calling #score_pair")
        class WhenCallingScorePair {

            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.pair();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #two_pair")
        class WhenCallingTwoPair {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.twoPair();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #three_of_a_kind")
        class WhenCallingThreeOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.threeOfAKind();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #four_of_a_kind")
        class WhenCallingFourOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.fourOfAKind();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #smallStraight")
        class WhenCallingSmallStraight {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = YatzyTest.this.yatzy.smallStraight();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #largeStraight")
        class WhenCallingLargeStraight {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = Yatzy.largeStraight(GivenLargeStraight.this.dice1, GivenLargeStraight.this.dice2, GivenLargeStraight.this.dice3, GivenLargeStraight.this.dice4, GivenLargeStraight.this.dice5);
            }

            @Test
            @DisplayName("then it should return 20")
            void thenItShouldReturn20() {
                assertThat(this.result).isEqualTo(20);
            }
        }

        @Nested
        @DisplayName("when calling #fullHouse")
        class WhenCallingFullHouse {
            private int result;

            @BeforeEach
            void setUp() {
                this.result = Yatzy.fullHouse(GivenLargeStraight.this.dice1, GivenLargeStraight.this.dice2, GivenLargeStraight.this.dice3, GivenLargeStraight.this.dice4, GivenLargeStraight.this.dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }
    }
}