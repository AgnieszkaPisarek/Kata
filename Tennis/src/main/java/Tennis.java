public class Tennis {

    private int playerOneScore;
    private int playerTwoScore;

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

    public boolean isADeuce()    {
        return playerOneScore == playerTwoScore && playerOneScore >= 3;
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
        return "No Advantage.";
    }

    public String whoWon()  {
        if(playerTwoScore - playerOneScore >= 2 && playerTwoScore >= 4) {
            return "Player two won!";
        }
        if(playerOneScore - playerTwoScore >= 2 && playerOneScore >= 4) {
            return "Player one won!";
        }
        return "No win.";
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

}
