public class Tennis {

    private int playerOneScore;
    private int playerTwoScore;

    public String playTennis() {
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

        if(playerOneScore == playerTwoScore && playerOneScore > 3) {
            return "It's a Deuce!";
        }
        return "Not a Deuce.";
    }

    public int getPlayerOneScore() {
        return playerOneScore;
    }

    public int getPlayerTwoScore() {
        return playerTwoScore;
    }

    public String hasAdvantage() {
        if(playerOneScore > playerTwoScore) {
            return "Player one has an Advantage!";
        }
        return null;
    }

}
