public class Tennis {

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
        playerOneScore += 1;
    }

    public void playerTwoGetsAPoint() {
        playerTwoScore += 1;
    }

    public String isADeuce()    {
        if(playerOneScore == playerTwoScore && playerOneScore >= 3) {
            return "Deuce!";
        }
        return "No Deuce!";
    }

    public int getPlayerOneScore() {
        return playerOneScore;
    }

    public int getPlayerTwoScore() {
        return playerTwoScore;
    }

    public String hasAdvantage() {
        if(playerOneScore > playerTwoScore && (playerOneScore + playerTwoScore) > 6) {
            return "Player one has an Advantage!";
        }

        if(playerTwoScore > playerOneScore && (playerOneScore + playerTwoScore) > 6) {
            return "Player two has an Advantage!";
        }
        return NO_ADVANTAGE;
    }

    public String whoWon()  {
        if(playerTwoScore - playerOneScore >= 2 && playerTwoScore >= 4) {
            return "Player two won!";
        }
        if(playerOneScore - playerTwoScore >= 2 && playerOneScore >= 4) {
            return "Player one won!";
        }
        return NO_WIN;
    }

    public String getTennisPoints(int points)   {
        return switch (points) {
            case 0 -> "love";
            case 1 -> "15";
            case 2 -> "30";
            case 3 -> "40";
            default -> null;
        };
    }

    public void getStateOfTheGame() {
        String winner = whoWon();
        if(winner.equals(NO_WIN)) {
           informAboutDeuce();
        }   else {
            System.out.println(winner);
        }
    }

    public void informAboutDeuce()  {
        String deuceState = isADeuce();
        if(deuceState.equals(DEUCE)) {
            System.out.println(deuceState);
        }   else {
            informAboutAdvantage();
        }
    }

    public void informAboutAdvantage()  {
        String playerWithAdvantage = hasAdvantage();
        if(playerWithAdvantage.equals(NO_ADVANTAGE)) {
            displayPoints();
        } else {
            System.out.println(playerWithAdvantage);
        }
    }

    private void displayPoints() {
        System.out.println("State of the game: " +
                                getTennisPoints(getPlayerOneScore())
                                    + "-" + getTennisPoints(getPlayerTwoScore()));
    }

}
