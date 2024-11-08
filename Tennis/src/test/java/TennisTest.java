import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        assertThat(tennis.startTheGameOfTennis()).isEqualTo("The game has started!");
        assertThat(tennis.getPlayerOneScore()).isZero();
        assertThat(tennis.getPlayerTwoScore()).isZero();
        tennis.getStateOfTheGame();
    }

    @Test
    public void playerOneShouldHaveAPoint_whenPlayerOneScoresAPoint() {
        tennis.playerOneGetsAPoint();
        assertThat(tennis.getPlayerOneScore()).isOne();
        tennis.getStateOfTheGame();
    }

    @Test
    public void playerTwoShouldHaveAPoint_whenPlayerTwoScoresAPoint() {
        tennis.playerTwoGetsAPoint();
        assertThat(tennis.getPlayerTwoScore()).isOne();
        tennis.getStateOfTheGame();
    }

    @Test
    public void playerOneShouldHaveAPoint_whenPlayerOneScoresASecondPoint() {
        tennis.playerOneGetsAPoint();
        tennis.playerOneGetsAPoint();
        assertThat(tennis.getPlayerOneScore()).isEqualTo(2);
        tennis.getStateOfTheGame();
    }

    @Test
    public void playerTwoShouldHaveAPoint_whenPlayerTwoScoresASecondPoint() {
        tennis.playerTwoGetsAPoint();
        tennis.playerTwoGetsAPoint();
        assertThat(tennis.getPlayerTwoScore()).isEqualTo(2);
        tennis.getStateOfTheGame();
    }

    @Test
    public void shouldBeDeuce_whenBothPlayerHaveThreePoints() {

        for(int i = 0; i < 3; i++)  {
            tennis.playerOneGetsAPoint();
            tennis.playerTwoGetsAPoint();
        }
        assertThat(tennis.isADeuce()).isEqualTo("Deuce!");
        tennis.getStateOfTheGame();
    }

    @Test
    public void shouldNotBeADeuce_whenBothPlayerHaveLessThanThreePoints() {
        for(int i = 0; i < 2; i++)  {
            tennis.playerOneGetsAPoint();
            tennis.playerTwoGetsAPoint();
        }
        assertThat(tennis.isADeuce()).isEqualTo("No Deuce!");
        tennis.getStateOfTheGame();
    }

    @Test
    public void shouldBeAdvantage_whenOnePlayerHasMorePointsAfterDeuce() {
        for(int i = 0; i < 3; i++)  {
            tennis.playerOneGetsAPoint();
            tennis.playerTwoGetsAPoint();
        }

        tennis.playerOneGetsAPoint();
        assertThat(tennis.hasAdvantage()).isEqualTo("Player one has an Advantage!");
        tennis.getStateOfTheGame();
    }

    @Test
    public void shouldBeAdvantage_whenPlayerTwoHasMorePointsAfterDeuce() {
        for(int i = 0; i < 3; i++)  {
            tennis.playerOneGetsAPoint();
            tennis.playerTwoGetsAPoint();
        }

        tennis.playerTwoGetsAPoint();
        assertThat(tennis.hasAdvantage()).isEqualTo("Player two has an Advantage!");
        tennis.getStateOfTheGame();
    }

    @Test
    public void shouldNotBeAdvantage_whenThereIsNoDeuce() {
        for(int i = 0; i < 2; i++)  {
            tennis.playerOneGetsAPoint();
            tennis.playerTwoGetsAPoint();
        }

        tennis.playerTwoGetsAPoint();
        assertThat(tennis.hasAdvantage()).isEqualTo("No Advantage.");
        tennis.getStateOfTheGame();
    }

    @Test
    public void playerTwoShouldWin() {
        for(int i = 0; i < 2; i++)  {
            tennis.playerOneGetsAPoint();
            tennis.playerTwoGetsAPoint();
        }

        tennis.playerTwoGetsAPoint();
        tennis.playerTwoGetsAPoint();
        assertThat(tennis.whoWon()).isEqualTo("Player two won!");
        tennis.getStateOfTheGame();
    }

    @Test
    public void playerOneShouldWin() {
        for(int i = 0; i < 2; i++)  {
            tennis.playerOneGetsAPoint();
            tennis.playerTwoGetsAPoint();
        }

        tennis.playerOneGetsAPoint();
        tennis.playerOneGetsAPoint();
        assertThat(tennis.whoWon()).isEqualTo("Player one won!");
        tennis.getStateOfTheGame();
    }

    @Test
    public void shouldNoOneWin_whenPointsAreBelowFour() {
        tennis.playerOneGetsAPoint();
        tennis.playerOneGetsAPoint();

        assertThat(tennis.whoWon()).isEqualTo("No win.");
        tennis.getStateOfTheGame();
    }

    @Test
    public void pointsShouldEqualLove_whenThereIsNoPoints() {
        int scoredPoints = tennis.getPlayerOneScore();
        assertThat(tennis.getTennisPoints(scoredPoints)).isEqualTo("love");
    }

    @Test
    public void pointsShouldEqualFifteen_whenThereIsOnePoint() {
        tennis.playerOneGetsAPoint();
        int scoredPoints = tennis.getPlayerOneScore();
        assertThat(tennis.getTennisPoints(scoredPoints)).isEqualTo("15");
    }

    @Test
    public void pointsShouldEqualThirty_whenThereAreTwoPoint() {
        tennis.playerOneGetsAPoint();
        tennis.playerOneGetsAPoint();
        int scoredPoints = tennis.getPlayerOneScore();
        assertThat(tennis.getTennisPoints(scoredPoints)).isEqualTo("30");
    }

    @Test
    public void pointsShouldEqualForty_whenThereAreTwoPoint() {
        tennis.playerOneGetsAPoint();
        tennis.playerOneGetsAPoint();
        tennis.playerOneGetsAPoint();
        int scoredPoints = tennis.getPlayerOneScore();
        assertThat(tennis.getTennisPoints(scoredPoints)).isEqualTo("40");
    }

}