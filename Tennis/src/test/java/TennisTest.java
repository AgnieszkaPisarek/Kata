import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class TennisTest {

    Tennis tennis;

    @BeforeEach
    public void setUp() {
        tennis = new Tennis();
        tennis.playTennis();
    }

    @Test
    public void shouldSetUpTheTennisGame() {
        assertAll(
                () -> assertThat(tennis.playTennis()).isEqualTo("The game has started!"),
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
    public void shouldBeDeuce_whenBothPlayerHaveFourPoints() {

        for(int i = 0; i < 4; i++)  {
            tennis.playerOneGetsAPoint();
            tennis.playerTwoGetsAPoint();
        }
        assertThat(tennis.isADeuce()).isEqualTo("It's a Deuce!");
    }

    @Test
    public void shouldNotBeADeuce_whenBothPlayerHaveLessThanFourPoints() {
        for(int i = 0; i < 3; i++)  {
            tennis.playerOneGetsAPoint();
            tennis.playerTwoGetsAPoint();
        }
        assertThat(tennis.isADeuce()).isEqualTo("Not a Deuce.");
    }

    @Test
    public void shouldBeAdvantage_whenOnePlayerHasMorePointsAfterDeuce() {
        for(int i = 0; i < 4; i++)  {
            tennis.playerOneGetsAPoint();
            tennis.playerTwoGetsAPoint();
        }

        tennis.playerOneGetsAPoint();
        assertThat(tennis.hasAdvantage()).isEqualTo("Player one has an Advantage!");
    }



}