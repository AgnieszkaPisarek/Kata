import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class TennisTest {

    Tennis tennis;

    @BeforeEach
    public void setUp() {
        tennis = new Tennis();
        tennis.startTheGameOfTennis();
    }

    @Test
    public void shouldSetUpTheTennisGame() {
        assertThat(tennis.getStateOfTheGame()).isEqualTo("State of the game: love-all");
    }

    @Test
    public void playerOneShouldHaveAPoint_whenPlayerOneScoresAPoint() {
        tennis.playerOneGetsAPoint();
        assertThat(tennis.getStateOfTheGame()).isEqualTo("State of the game: 15-love");
    }

    @Test
    public void playerTwoShouldHaveAPoint_whenPlayerTwoScoresAPoint() {
        tennis.playerTwoGetsAPoint();
        assertThat(tennis.getStateOfTheGame()).isEqualTo("State of the game: love-15");
    }

    @Test
    public void playerOneShouldHaveAPoint_whenPlayerOneScoresASecondPoint() {
        tennis.playerOneGetsAPoint();
        tennis.playerOneGetsAPoint();
        assertThat(tennis.getStateOfTheGame()).isEqualTo("State of the game: 30-love");
    }

    @Test
    public void playerTwoShouldHaveAPoint_whenPlayerTwoScoresASecondPoint() {
        tennis.playerTwoGetsAPoint();
        tennis.playerTwoGetsAPoint();
        assertThat(tennis.getStateOfTheGame()).isEqualTo("State of the game: love-30");
    }

    @Test
    public void shouldBeDeuce_whenBothPlayerHaveThreePoints() {

        for(int i = 0; i < 3; i++)  {
            tennis.playerOneGetsAPoint();
            tennis.playerTwoGetsAPoint();
        }
        assertThat(tennis.getStateOfTheGame()).isEqualTo("Deuce!");
    }

    private static Stream<Arguments> tennisGameStates() {
        return Stream.of(
                Arguments.of(1, "State of the game: 15-all"),
                Arguments.of(2, "State of the game: 30-all"),
                Arguments.of(3, "Deuce!"),
                Arguments.of(4, "Deuce!")
        );
    }

    @ParameterizedTest
    @MethodSource("tennisGameStates")
    public void shouldNotBeADeuce_whenBothPlayerHaveLessThanThreePoints(int pointsScoredByBoth, String stateOfTheGame) {
        for(int i = 0; i < pointsScoredByBoth; i++)  {
            tennis.playerOneGetsAPoint();
            tennis.playerTwoGetsAPoint();
        }
        assertThat(tennis.getStateOfTheGame()).isEqualTo(stateOfTheGame);
    }

    @Test
    public void shouldBeAdvantage_whenOnePlayerHasMorePointsAfterDeuce() {
        for(int i = 0; i < 3; i++)  {
            tennis.playerOneGetsAPoint();
            tennis.playerTwoGetsAPoint();
        }

        tennis.playerOneGetsAPoint();
        assertThat(tennis.getStateOfTheGame()).isEqualTo("Player one has an Advantage!");
    }

    @Test
    public void shouldBeAdvantage_whenPlayerTwoHasMorePointsAfterDeuce() {
        for(int i = 0; i < 3; i++)  {
            tennis.playerOneGetsAPoint();
            tennis.playerTwoGetsAPoint();
        }

        tennis.playerTwoGetsAPoint();
        assertThat(tennis.getStateOfTheGame()).isEqualTo("Player two has an Advantage!");
    }

    @Test
    public void shouldNotBeAdvantage_whenThereIsNoDeuce() {
        for(int i = 0; i < 2; i++)  {
            tennis.playerOneGetsAPoint();
            tennis.playerTwoGetsAPoint();
        }
        tennis.playerTwoGetsAPoint();
        assertThat(tennis.getStateOfTheGame()).isEqualTo("State of the game: 30-40");
    }

    @Test
    public void playerTwoShouldWin() {
        for(int i = 0; i < 2; i++)  {
            tennis.playerOneGetsAPoint();
            tennis.playerTwoGetsAPoint();
        }
        tennis.playerTwoGetsAPoint();
        tennis.playerTwoGetsAPoint();
        assertThat(tennis.getStateOfTheGame()).isEqualTo("Player two won!");
    }

    @Test
    public void playerOneShouldWin() {
        for(int i = 0; i < 2; i++)  {
            tennis.playerOneGetsAPoint();
            tennis.playerTwoGetsAPoint();
        }
        tennis.playerOneGetsAPoint();
        tennis.playerOneGetsAPoint();
        assertThat(tennis.getStateOfTheGame()).isEqualTo("Player one won!");
    }

    @Test
    public void shouldNoOneWin_whenPointsAreBelowFour() {
        tennis.playerOneGetsAPoint();
        tennis.playerOneGetsAPoint();
        assertThat(tennis.getStateOfTheGame()).isEqualTo("State of the game: 30-love");
    }
}