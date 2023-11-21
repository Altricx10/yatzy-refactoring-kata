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

        @BeforeEach
        void setUp() {
            final int dice1 = 1;
            final int dice2 = 3;
            final int dice3 = 4;
            final int dice4 = 5;
            final int dice5 = 6;
            YatzyTest.this.yatzy = new Yatzy(dice1, dice2, dice3, dice4, dice5);
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
                this.result = YatzyTest.this.yatzy.largeStraight();
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
                this.result = YatzyTest.this.yatzy.fullHouse();
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

        @BeforeEach
        void setUp() {
            final int dice5 = 6;
            final int dice4 = 5;
            final int dice3 = 4;
            final int dice2 = 1;
            final int dice1 = 1;
            YatzyTest.this.yatzy = new Yatzy(dice1, dice2, dice3, dice4, dice5);
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
                this.result = YatzyTest.this.yatzy.largeStraight();
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
                this.result = YatzyTest.this.yatzy.fullHouse();
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

        @BeforeEach
        void setUp() {
            final int dice1 = 1;
            final int dice5 = 6;
            final int dice4 = 5;
            final int dice3 = 1;
            final int dice2 = 1;
            YatzyTest.this.yatzy = new Yatzy(dice1, dice2, dice3, dice4, dice5);
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
                this.result = YatzyTest.this.yatzy.largeStraight();
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
                this.result = YatzyTest.this.yatzy.fullHouse();
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

        @BeforeEach
        void setUp() {
            final int dice5 = 6;
            final int dice4 = 1;
            final int dice3 = 1;
            final int dice2 = 1;
            final int dice1 = 1;
            YatzyTest.this.yatzy = new Yatzy(dice1, dice2, dice3, dice4, dice5);
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
                this.result = YatzyTest.this.yatzy.largeStraight();
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
                this.result = YatzyTest.this.yatzy.fullHouse();
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

        @BeforeEach
        void setUp() {
            final int dice5 = 1;
            final int dice4 = 1;
            final int dice3 = 1;
            final int dice2 = 1;
            final int dice1 = 1;
            YatzyTest.this.yatzy = new Yatzy(dice1, dice2, dice3, dice4, dice5);
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
                this.result = YatzyTest.this.yatzy.largeStraight();
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
                this.result = YatzyTest.this.yatzy.fullHouse();
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

        @BeforeEach
        void setUp() {
            final int dice5 = 6;
            final int dice4 = 2;
            final int dice3 = 2;
            final int dice2 = 1;
            final int dice1 = 1;
            YatzyTest.this.yatzy = new Yatzy(dice1, dice2, dice3, dice4, dice5);
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
                this.result = YatzyTest.this.yatzy.largeStraight();
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
                this.result = YatzyTest.this.yatzy.fullHouse();
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

        @BeforeEach
        void setUp() {
            final int dice5 = 2;
            final int dice4 = 2;
            final int dice3 = 1;
            final int dice2 = 1;
            final int dice1 = 1;
            YatzyTest.this.yatzy = new Yatzy(dice1, dice2, dice3, dice4, dice5);
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
                this.result = YatzyTest.this.yatzy.largeStraight();
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
                this.result = YatzyTest.this.yatzy.fullHouse();
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

        @BeforeEach
        void setUp() {
            final int dice5 = 5;
            final int dice4 = 4;
            final int dice3 = 3;
            final int dice2 = 2;
            final int dice1 = 1;
            YatzyTest.this.yatzy = new Yatzy(dice1, dice2, dice3, dice4, dice5);
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
                this.result = YatzyTest.this.yatzy.largeStraight();
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
                this.result = YatzyTest.this.yatzy.fullHouse();
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

        @BeforeEach
        void setUp() {
            final int dice5 = 6;
            final int dice4 = 5;
            final int dice3 = 4;
            final int dice2 = 3;
            final int dice1 = 2;
            YatzyTest.this.yatzy = new Yatzy(dice1, dice2, dice3, dice4, dice5);
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
                this.result = YatzyTest.this.yatzy.largeStraight();
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
                this.result = YatzyTest.this.yatzy.fullHouse();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(this.result).isZero();
            }
        }
    }
}