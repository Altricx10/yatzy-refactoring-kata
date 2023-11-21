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
          yatzy = new Yatzy(dice1, dice2, dice3, dice4, dice5);
        }

        @Nested
        @DisplayName("whe calling #chance")
        class WhenCallingChance {

            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.chance(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 19")
            void thenItShouldReturn19() {
                assertThat(result).isEqualTo(19);
            }
        }

        @Nested
        @DisplayName("when calling #yatzy")
        class WhenCallingYatzy {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.yatzy(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #ones")
        class WhenCallingOnes {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.ones(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 1")
            void thenItShouldReturn1() {
                assertThat(result).isEqualTo(1);
            }
        }

        @Nested
        @DisplayName("when calling #twos")
        class WhenCallingTwos {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.twos(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #threes")
        class WhenCallingThrees {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.threes();
            }

            @Test
            @DisplayName("then it should return 3")
            void thenItShouldReturn3() {
                assertThat(result).isEqualTo(3);
            }
        }

        @Nested
        @DisplayName("when calling #fours")
        class WhenCallingFours {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.fours();
            }

            @Test
            @DisplayName("then it should return 4")
            void thenItShouldReturn4() {
                assertThat(result).isEqualTo(4);
            }
        }

        @Nested
        @DisplayName("when calling #fives")
        class WhenCallingFives {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.fives();
            }

            @Test
            @DisplayName("then it should return 5")
            void thenItShouldReturn5() {
                assertThat(result).isEqualTo(5);
            }
        }

        @Nested
        @DisplayName("when calling #sixes")
        class WhenCallingSixes {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.sixes();
            }

            @Test
            @DisplayName("then it should return 6")
            void thenItShouldReturn6() {
                assertThat(result).isEqualTo(6);
            }
        }

        @Nested
        @DisplayName("when calling #score_pair")
        class WhenCallingScorePair {

            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.score_pair(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #two_pair")
        class WhenCallingTwoPair {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.two_pair(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #thre_of_a_kind")
        class WhenCallingThreeOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.three_of_a_kind(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #four_of_a_kind")
        class WhenCallingFourOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.four_of_a_kind(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #smallStraight")
        class WhenCallingSmallStraight {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.smallStraight(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #largeStraight")
        class WhenCallingLargeStraight {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.largeStraight(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fullHouse")
        class WhenCallingFullHouse {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.fullHouse(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
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
          yatzy = new Yatzy(dice1, dice2, dice3, dice4, dice5);
        }

        @Nested
        @DisplayName("whe calling #chance")
        class WhenCallingChance {

            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.chance(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 17")
            void thenItShouldReturn17() {
                assertThat(result).isEqualTo(17);
            }
        }

        @Nested
        @DisplayName("when calling #yatzy")
        class WhenCallingYatzy {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.yatzy(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #ones")
        class WhenCallingOnes {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.ones(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 2")
            void thenItShouldReturn2() {
                assertThat(result).isEqualTo(2);
            }
        }

        @Nested
        @DisplayName("when calling #twos")
        class WhenCallingTwos {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.twos(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #threes")
        class WhenCallingThrees {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.threes();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fours")
        class WhenCallingFours {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.fours();
            }

            @Test
            @DisplayName("then it should return 4")
            void thenItShouldReturn4() {
                assertThat(result).isEqualTo(4);
            }
        }

        @Nested
        @DisplayName("when calling #fives")
        class WhenCallingFives {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.fives();
            }

            @Test
            @DisplayName("then it should return 5")
            void thenItShouldReturn5() {
                assertThat(result).isEqualTo(5);
            }
        }

        @Nested
        @DisplayName("when calling #sixes")
        class WhenCallingSixes {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.sixes();
            }

            @Test
            @DisplayName("then it should return 6")
            void thenItShouldReturn6() {
                assertThat(result).isEqualTo(6);
            }
        }

        @Nested
        @DisplayName("when calling #score_pair")
        class WhenCallingScorePair {

            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.score_pair(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 2")
            void thenItShouldReturn2() {
                assertThat(result).isEqualTo(2);
            }
        }

        @Nested
        @DisplayName("when calling #two_pair")
        class WhenCallingTwoPair {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.two_pair(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #thre_of_a_kind")
        class WhenCallingThreeOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.three_of_a_kind(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #four_of_a_kind")
        class WhenCallingFourOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.four_of_a_kind(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #smallStraight")
        class WhenCallingSmallStraight {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.smallStraight(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #largeStraight")
        class WhenCallingLargeStraight {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.largeStraight(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fullHouse")
        class WhenCallingFullHouse {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.fullHouse(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
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
          yatzy = new Yatzy(dice1, dice2, dice3, dice4, dice5);
        }

        @Nested
        @DisplayName("whe calling #chance")
        class WhenCallingChance {

            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.chance(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 14")
            void thenItShouldReturn14() {
                assertThat(result).isEqualTo(14);
            }
        }

        @Nested
        @DisplayName("when calling #yatzy")
        class WhenCallingYatzy {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.yatzy(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #ones")
        class WhenCallingOnes {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.ones(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 3")
            void thenItShouldReturn3() {
                assertThat(result).isEqualTo(3);
            }
        }

        @Nested
        @DisplayName("when calling #twos")
        class WhenCallingTwos {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.twos(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #threes")
        class WhenCallingThrees {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.threes();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fours")
        class WhenCallingFours {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.fours();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fives")
        class WhenCallingFives {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.fives();
            }

            @Test
            @DisplayName("then it should return 5")
            void thenItShouldReturn5() {
                assertThat(result).isEqualTo(5);
            }
        }

        @Nested
        @DisplayName("when calling #sixes")
        class WhenCallingSixes {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.sixes();
            }

            @Test
            @DisplayName("then it should return 6")
            void thenItShouldReturn6() {
                assertThat(result).isEqualTo(6);
            }
        }

        @Nested
        @DisplayName("when calling #score_pair")
        class WhenCallingScorePair {

            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.score_pair(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 2")
            void thenItShouldReturn2() {
                assertThat(result).isEqualTo(2);
            }
        }

        @Nested
        @DisplayName("when calling #two_pair")
        class WhenCallingTwoPair {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.two_pair(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #three_of_a_kind")
        class WhenCallingThreeOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.three_of_a_kind(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 3")
            void thenItShouldReturn3() {
                assertThat(result).isEqualTo(3);
            }
        }

        @Nested
        @DisplayName("when calling #four_of_a_kind")
        class WhenCallingFourOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.four_of_a_kind(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #smallStraight")
        class WhenCallingSmallStraight {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.smallStraight(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #largeStraight")
        class WhenCallingLargeStraight {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.largeStraight(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fullHouse")
        class WhenCallingFullHouse {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.fullHouse(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
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
          yatzy = new Yatzy(dice1, dice2, dice3, dice4, dice5);
        }

        @Nested
        @DisplayName("whe calling #chance")
        class WhenCallingChance {

            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.chance(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 10")
            void thenItShouldReturn10() {
                assertThat(result).isEqualTo(10);
            }
        }

        @Nested
        @DisplayName("when calling #yatzy")
        class WhenCallingYatzy {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.yatzy(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #ones")
        class WhenCallingOnes {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.ones(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 4")
            void thenItShouldReturn4() {
                assertThat(result).isEqualTo(4);
            }
        }

        @Nested
        @DisplayName("when calling #twos")
        class WhenCallingTwos {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.twos(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #threes")
        class WhenCallingThrees {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.threes();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fours")
        class WhenCallingFours {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.fours();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fives")
        class WhenCallingFives {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.fives();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #sixes")
        class WhenCallingSixes {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.sixes();
            }

            @Test
            @DisplayName("then it should return 6")
            void thenItShouldReturn6() {
                assertThat(result).isEqualTo(6);
            }
        }

        @Nested
        @DisplayName("when calling #score_pair")
        class WhenCallingScorePair {

            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.score_pair(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 2")
            void thenItShouldReturn2() {
                assertThat(result).isEqualTo(2);
            }
        }

        @Nested
        @DisplayName("when calling #two_pair")
        class WhenCallingTwoPair {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.two_pair(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #three_of_a_kind")
        class WhenCallingThreeOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.three_of_a_kind(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 3")
            void thenItShouldReturn3() {
                assertThat(result).isEqualTo(3);
            }
        }

        @Nested
        @DisplayName("when calling #four_of_a_kind")
        class WhenCallingFourOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.four_of_a_kind(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 4")
            void thenItShouldReturn4() {
                assertThat(result).isEqualTo(4);
            }
        }

        @Nested
        @DisplayName("when calling #smallStraight")
        class WhenCallingSmallStraight {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.smallStraight(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #largeStraight")
        class WhenCallingLargeStraight {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.largeStraight(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fullHouse")
        class WhenCallingFullHouse {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.fullHouse(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
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
          yatzy = new Yatzy(dice1, dice2, dice3, dice4, dice5);
        }

        @Nested
        @DisplayName("whe calling #chance")
        class WhenCallingChance {

            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.chance(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 5")
            void thenItShouldReturn5() {
                assertThat(result).isEqualTo(5);
            }
        }

        @Nested
        @DisplayName("when calling #yatzy")
        class WhenCallingYatzy {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.yatzy(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 50")
            void thenItShouldReturn50() {
                assertThat(result).isEqualTo(50);
            }
        }

        @Nested
        @DisplayName("when calling #ones")
        class WhenCallingOnes {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.ones(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 5")
            void thenItShouldReturn5() {
                assertThat(result).isEqualTo(5);
            }
        }

        @Nested
        @DisplayName("when calling #twos")
        class WhenCallingTwos {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.twos(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #threes")
        class WhenCallingThrees {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.threes();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fours")
        class WhenCallingFours {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.fours();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fives")
        class WhenCallingFives {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.fives();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #sixes")
        class WhenCallingSixes {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.sixes();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #score_pair")
        class WhenCallingScorePair {

            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.score_pair(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 2")
            void thenItShouldReturn2() {
                assertThat(result).isEqualTo(2);
            }
        }

        @Nested
        @DisplayName("when calling #two_pair")
        class WhenCallingTwoPair {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.two_pair(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #three_of_a_kind")
        class WhenCallingThreeOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.three_of_a_kind(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 3")
            void thenItShouldReturn3() {
                assertThat(result).isEqualTo(3);
            }
        }

        @Nested
        @DisplayName("when calling #four_of_a_kind")
        class WhenCallingFourOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.four_of_a_kind(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 4")
            void thenItShouldReturn4() {
                assertThat(result).isEqualTo(4);
            }
        }

        @Nested
        @DisplayName("when calling #smallStraight")
        class WhenCallingSmallStraight {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.smallStraight(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #largeStraight")
        class WhenCallingLargeStraight {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.largeStraight(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fullHouse")
        class WhenCallingFullHouse {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.fullHouse(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
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
          yatzy = new Yatzy(dice1, dice2, dice3, dice4, dice5);
        }

        @Nested
        @DisplayName("whe calling #chance")
        class WhenCallingChance {

            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.chance(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 12")
            void thenItShouldReturn12() {
                assertThat(result).isEqualTo(12);
            }
        }

        @Nested
        @DisplayName("when calling #yatzy")
        class WhenCallingYatzy {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.yatzy(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #ones")
        class WhenCallingOnes {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.ones(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 2")
            void thenItShouldReturn2() {
                assertThat(result).isEqualTo(2);
            }
        }

        @Nested
        @DisplayName("when calling #twos")
        class WhenCallingTwos {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.twos(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 4")
            void thenItShouldReturn4() {
                assertThat(result).isEqualTo(4);
            }
        }

        @Nested
        @DisplayName("when calling #threes")
        class WhenCallingThrees {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.threes();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fours")
        class WhenCallingFours {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.fours();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fives")
        class WhenCallingFives {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.fives();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #sixes")
        class WhenCallingSixes {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.sixes();
            }

            @Test
            @DisplayName("then it should return 6")
            void thenItShouldReturn6() {
                assertThat(result).isEqualTo(6);
            }
        }

        @Nested
        @DisplayName("when calling #score_pair")
        class WhenCallingScorePair {

            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.score_pair(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 4")
            void thenItShouldReturn4() {
                assertThat(result).isEqualTo(4);
            }
        }

        @Nested
        @DisplayName("when calling #two_pair")
        class WhenCallingTwoPair {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.two_pair(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 6")
            void thenItShouldReturn6() {
                assertThat(result).isEqualTo(6);
            }
        }

        @Nested
        @DisplayName("when calling #three_of_a_kind")
        class WhenCallingThreeOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.three_of_a_kind(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #four_of_a_kind")
        class WhenCallingFourOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.four_of_a_kind(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #smallStraight")
        class WhenCallingSmallStraight {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.smallStraight(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #largeStraight")
        class WhenCallingLargeStraight {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.largeStraight(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fullHouse")
        class WhenCallingFullHouse {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.fullHouse(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
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
          yatzy = new Yatzy(dice1, dice2, dice3, dice4, dice5);
        }

        @Nested
        @DisplayName("whe calling #chance")
        class WhenCallingChance {

            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.chance(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 7")
            void thenItShouldReturn7() {
                assertThat(result).isEqualTo(7);
            }
        }

        @Nested
        @DisplayName("when calling #yatzy")
        class WhenCallingYatzy {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.yatzy(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #ones")
        class WhenCallingOnes {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.ones(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 3")
            void thenItShouldReturn3() {
                assertThat(result).isEqualTo(3);
            }
        }

        @Nested
        @DisplayName("when calling #twos")
        class WhenCallingTwos {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.twos(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 4")
            void thenItShouldReturn4() {
                assertThat(result).isEqualTo(4);
            }
        }

        @Nested
        @DisplayName("when calling #threes")
        class WhenCallingThrees {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.threes();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fours")
        class WhenCallingFours {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.fours();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fives")
        class WhenCallingFives {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.fives();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #sixes")
        class WhenCallingSixes {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.sixes();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #score_pair")
        class WhenCallingScorePair {

            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.score_pair(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 4")
            void thenItShouldReturn4() {
                assertThat(result).isEqualTo(4);
            }
        }

        @Nested
        @DisplayName("when calling #two_pair")
        class WhenCallingTwoPair {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.two_pair(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 6")
            void thenItShouldReturn6() {
                assertThat(result).isEqualTo(6);
            }
        }

        @Nested
        @DisplayName("when calling #three_of_a_kind")
        class WhenCallingThreeOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.three_of_a_kind(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 3")
            void thenItShouldReturn3() {
                assertThat(result).isEqualTo(3);
            }
        }

        @Nested
        @DisplayName("when calling #four_of_a_kind")
        class WhenCallingFourOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.four_of_a_kind(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #smallStraight")
        class WhenCallingSmallStraight {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.smallStraight(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #largeStraight")
        class WhenCallingLargeStraight {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.largeStraight(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fullHouse")
        class WhenCallingFullHouse {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.fullHouse(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 7")
            void thenItShouldReturn7() {
                assertThat(result).isEqualTo(7);
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
          yatzy = new Yatzy(dice1, dice2, dice3, dice4, dice5);
        }

        @Nested
        @DisplayName("whe calling #chance")
        class WhenCallingChance {

            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.chance(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 15")
            void thenItShouldReturn15() {
                assertThat(result).isEqualTo(15);
            }
        }

        @Nested
        @DisplayName("when calling #yatzy")
        class WhenCallingYatzy {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.yatzy(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #ones")
        class WhenCallingOnes {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.ones(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 1")
            void thenItShouldReturn1() {
                assertThat(result).isEqualTo(1);
            }
        }

        @Nested
        @DisplayName("when calling #twos")
        class WhenCallingTwos {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.twos(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 2")
            void thenItShouldReturn2() {
                assertThat(result).isEqualTo(2);
            }
        }

        @Nested
        @DisplayName("when calling #threes")
        class WhenCallingThrees {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.threes();
            }

            @Test
            @DisplayName("then it should return 3")
            void thenItShouldReturn3() {
                assertThat(result).isEqualTo(3);
            }
        }

        @Nested
        @DisplayName("when calling #fours")
        class WhenCallingFours {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.fours();
            }

            @Test
            @DisplayName("then it should return 4")
            void thenItShouldReturn4() {
                assertThat(result).isEqualTo(4);
            }
        }

        @Nested
        @DisplayName("when calling #fives")
        class WhenCallingFives {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.fives();
            }

            @Test
            @DisplayName("then it should return 5")
            void thenItShouldReturn5() {
                assertThat(result).isEqualTo(5);
            }
        }

        @Nested
        @DisplayName("when calling #sixes")
        class WhenCallingSixes {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.sixes();
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #score_pair")
        class WhenCallingScorePair {

            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.score_pair(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #two_pair")
        class WhenCallingTwoPair {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.two_pair(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #three_of_a_kind")
        class WhenCallingThreeOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.three_of_a_kind(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #four_of_a_kind")
        class WhenCallingFourOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.four_of_a_kind(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #smallStraight")
        class WhenCallingSmallStraight {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.smallStraight(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 15")
            void thenItShouldReturn15() {
                assertThat(result).isEqualTo(15);
            }
        }

        @Nested
        @DisplayName("when calling #largeStraight")
        class WhenCallingLargeStraight {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.largeStraight(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #fullHouse")
        class WhenCallingFullHouse {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.fullHouse(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
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
          yatzy = new Yatzy(dice1, dice2, dice3, dice4, dice5);
        }

        @Nested
        @DisplayName("whe calling #chance")
        class WhenCallingChance {

            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.chance(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 20")
            void thenItShouldReturn20() {
                assertThat(result).isEqualTo(20);
            }
        }

        @Nested
        @DisplayName("when calling #yatzy")
        class WhenCallingYatzy {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.yatzy(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #ones")
        class WhenCallingOnes {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.ones(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #twos")
        class WhenCallingTwos {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.twos(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 2")
            void thenItShouldReturn2() {
                assertThat(result).isEqualTo(2);
            }
        }

        @Nested
        @DisplayName("when calling #threes")
        class WhenCallingThrees {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.threes();
            }

            @Test
            @DisplayName("then it should return 3")
            void thenItShouldReturn3() {
                assertThat(result).isEqualTo(3);
            }
        }

        @Nested
        @DisplayName("when calling #fours")
        class WhenCallingFours {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.fours();
            }

            @Test
            @DisplayName("then it should return 4")
            void thenItShouldReturn4() {
                assertThat(result).isEqualTo(4);
            }
        }

        @Nested
        @DisplayName("when calling #fives")
        class WhenCallingFives {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.fives();
            }

            @Test
            @DisplayName("then it should return 5")
            void thenItShouldReturn5() {
                assertThat(result).isEqualTo(5);
            }
        }

        @Nested
        @DisplayName("when calling #sixes")
        class WhenCallingSixes {
            private int result;

            @BeforeEach
            void setUp() {
              result = yatzy.sixes();
            }

            @Test
            @DisplayName("then it should return 6")
            void thenItShouldReturn6() {
                assertThat(result).isEqualTo(6);
            }
        }

        @Nested
        @DisplayName("when calling #score_pair")
        class WhenCallingScorePair {

            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.score_pair(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #two_pair")
        class WhenCallingTwoPair {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.two_pair(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #three_of_a_kind")
        class WhenCallingThreeOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.three_of_a_kind(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #four_of_a_kind")
        class WhenCallingFourOfAKind {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.four_of_a_kind(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #smallStraight")
        class WhenCallingSmallStraight {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.smallStraight(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }

        @Nested
        @DisplayName("when calling #largeStraight")
        class WhenCallingLargeStraight {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.largeStraight(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 20")
            void thenItShouldReturn20() {
                assertThat(result).isEqualTo(20);
            }
        }

        @Nested
        @DisplayName("when calling #fullHouse")
        class WhenCallingFullHouse {
            private int result;

            @BeforeEach
            void setUp() {
              result = Yatzy.fullHouse(dice1, dice2, dice3, dice4, dice5);
            }

            @Test
            @DisplayName("then it should return 0")
            void thenItShouldReturn0() {
                assertThat(result).isZero();
            }
        }
    }
}