public class Tennis {

    public static final int DEUCE_THRESHOLD = 3;
    public static final String NO_DEUCE = "No Deuce!";
    public static final String PLAYER_ONE_HAS_AN_ADVANTAGE = "Player one has an Advantage!";
    public static final String PLAYER_TWO_HAS_AN_ADVANTAGE = "Player two has an Advantage!";
    public static final int BOTH_PLAYERS_DEUCE_THRESHOLD = 6;
    public static final String PLAYER_TWO_WON = "Player two won!";
    public static final String PLAYER_ONE_WON = "Player one won!";
    public static final int ADVANTAGE_OF_ONE_PLAYER_OVER_ANOTHER = 2;
    public static final int MINIMUM_SCORE_REQUIRED_TO_WIN = 4;
    public static final String LOVE = "love";
    public static final String FIRST_POINT = "15";
    public static final String SECOND_POINT = "30";
    public static final String THIRD_POINT = "40";
    public static final String STATE_OF_THE_GAME = "State of the game: ";
    public static final String SCORE_FOR_BOTH_PLAYERS = "-all";
    private int playerOneScore;
    private int playerTwoScore;
    final private static String NO_ADVANTAGE = "No Advantage.";
    public static final String NO_WIN = "No win.";
    public static final String DEUCE = "Deuce!";

    public String startTheGameOfTennis() {
        playerOneScore = 0;
        playerTwoScore = 0;
        return "The game has started!";
    }

    public void playerOneGetsAPoint() {
        playerOneScore++;
    }

    public void playerTwoGetsAPoint() {
        playerTwoScore++;
    }

    public String isADeuce()    {
        if(playerOneScore == playerTwoScore && playerOneScore >= DEUCE_THRESHOLD) {
            return DEUCE;
        }
        return NO_DEUCE;
    }

    public int getPlayerOneScore() {
        return playerOneScore;
    }

    public int getPlayerTwoScore() {
        return playerTwoScore;
    }

    public String hasAdvantage() {
        if(playerOneScore > playerTwoScore && (playerOneScore + playerTwoScore) > BOTH_PLAYERS_DEUCE_THRESHOLD) {
            return PLAYER_ONE_HAS_AN_ADVANTAGE;
        }

        if(playerTwoScore > playerOneScore && (playerOneScore + playerTwoScore) > BOTH_PLAYERS_DEUCE_THRESHOLD) {
            return PLAYER_TWO_HAS_AN_ADVANTAGE;
        }
        return NO_ADVANTAGE;
    }

    public String whoWon()  {
        if(playerTwoScore - playerOneScore >= ADVANTAGE_OF_ONE_PLAYER_OVER_ANOTHER && playerTwoScore >= MINIMUM_SCORE_REQUIRED_TO_WIN) {
            return PLAYER_TWO_WON;
        }
        if(playerOneScore - playerTwoScore >= ADVANTAGE_OF_ONE_PLAYER_OVER_ANOTHER && playerOneScore >= MINIMUM_SCORE_REQUIRED_TO_WIN) {
            return PLAYER_ONE_WON;
        }
        return NO_WIN;
    }

    public String getTennisPoints(int points)   {
        return switch (points) {
            case 0 -> LOVE;
            case 1 -> FIRST_POINT;
            case 2 -> SECOND_POINT;
            case 3 -> THIRD_POINT;
            default -> null;
        };
    }

    public String getStateOfTheGame() {
        String winner = whoWon();
        if(winner.equals(NO_WIN)) {
           return informAboutDeuce();
        }
        return winner;
    }

    public String informAboutDeuce()  {
        String deuceState = isADeuce();
        if(!deuceState.equals(DEUCE)) {
            return informAboutAdvantage();
        }
        return deuceState;
    }

    public String informAboutAdvantage()  {
        String playerWithAdvantage = hasAdvantage();
        if(playerWithAdvantage.equals(NO_ADVANTAGE)) {
            return displayPoints();
        }
        return playerWithAdvantage;
    }

    private String displayPoints() {
        if(playerOneScore == playerTwoScore) {
            return STATE_OF_THE_GAME + getTennisPoints(getPlayerOneScore()) + SCORE_FOR_BOTH_PLAYERS;
        }
        return STATE_OF_THE_GAME +
                                getTennisPoints(getPlayerOneScore())
                                    + "-" + getTennisPoints(getPlayerTwoScore());
    }

}
