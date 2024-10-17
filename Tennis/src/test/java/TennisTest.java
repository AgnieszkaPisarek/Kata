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
        assertAll(
                () -> assertThat(tennis.startTheGameOfTennis()).isEqualTo("The game has started!"),
                () -> assertThat(tennis.getPlayerOneScore()).isEqualTo(0),
                ()  -> assertThat(tennis.getPlayerTwoScore()).isEqualTo(0));
    }

    @Test
    public void playerOneShouldHaveAPoint_whenPlayerOneScoresAPoint() {
        tennis.playerOneGetsAPoint();
        assertThat(tennis.getPlayerOneScore()).isEqualTo(1);
    }

    @Test
    public void playerTwoShouldHaveAPoint_whenPlayerTwoScoresAPoint() {
        tennis.playerTwoGetsAPoint();
        assertThat(tennis.getPlayerTwoScore()).isEqualTo(1);
    }

    @Test
    public void playerOneShouldHaveAPoint_whenPlayerOneScoreASecondPoint() {
        tennis.playerOneGetsAPoint();
        tennis.playerOneGetsAPoint();
        assertThat(tennis.getPlayerOneScore()).isEqualTo(2);
    }

    @Test
    public void playerTwoShouldHaveAPoint_whenPlayerTwoScoreASecondPoint() {
        tennis.playerTwoGetsAPoint();
        tennis.playerTwoGetsAPoint();
        assertThat(tennis.getPlayerTwoScore()).isEqualTo(2);
    }

    @Test
    public void shouldBeDeuce_whenBothPlayerHaveThreePoints() {

        for(int i = 0; i < 3; i++)  {
            tennis.playerOneGetsAPoint();
            tennis.playerTwoGetsAPoint();
        }
        assertThat(tennis.isADeuce()).isEqualTo(true);
    }

    @Test
    public void shouldNotBeADeuce_whenBothPlayerHaveLessThanThreePoints() {
        for(int i = 0; i < 2; i++)  {
            tennis.playerOneGetsAPoint();
            tennis.playerTwoGetsAPoint();
        }
        assertThat(tennis.isADeuce()).isEqualTo(false);
    }

    @Test
    public void shouldBeAdvantage_whenOnePlayerHasMorePointsAfterDeuce() {
        for(int i = 0; i < 3; i++)  {
            tennis.playerOneGetsAPoint();
            tennis.playerTwoGetsAPoint();
        }

        tennis.playerOneGetsAPoint();
        assertThat(tennis.hasAdvantage()).isEqualTo("Player one has an Advantage!");
    }

    @Test
    public void shouldBeAdvantage_whenPlayerTwoHasMorePointsAfterDeuce() {
        for(int i = 0; i < 3; i++)  {
            tennis.playerOneGetsAPoint();
            tennis.playerTwoGetsAPoint();
        }

        tennis.playerTwoGetsAPoint();
        assertThat(tennis.hasAdvantage()).isEqualTo("Player two has an Advantage!");
    }

    @Test
    public void shouldNotBeAdvantage_whenThereIsNoDeuce() {
        for(int i = 0; i < 2; i++)  {
            tennis.playerOneGetsAPoint();
            tennis.playerTwoGetsAPoint();
        }

        tennis.playerTwoGetsAPoint();
        assertThat(tennis.hasAdvantage()).isEqualTo("No Advantage.");
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
    }

    @Test
    public void shouldNoOneWin_whenPointsAreBelowFour() {
        tennis.playerOneGetsAPoint();
        tennis.playerOneGetsAPoint();

        assertThat(tennis.whoWon()).isEqualTo("No win.");

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