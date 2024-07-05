public class challengeMethods {

    public static void main(String[] args) {

       int rank = calculateHighScorePosition(1500);
        displayHighScorePosition("player1",rank);

       rank = calculateHighScorePosition(999);
        displayHighScorePosition("player2",rank);

        rank = calculateHighScorePosition(499);
        displayHighScorePosition("player3",rank);

       rank = calculateHighScorePosition(99);
        displayHighScorePosition("player4",rank);

        rank = calculateHighScorePosition(-1000);
        displayHighScorePosition("player5",rank);

    }
public static void displayHighScorePosition(String playerName, int rank)
    {
System.out.println(playerName+" managed to get into position "+rank+" on the high score list.");
    }

    public static int calculateHighScorePosition(int playerScore)
    {
        int rank = 4;

        if (playerScore>=1000) {
            rank = 1;
        }
        else if (playerScore>=500) {rank=2;}
        else if (playerScore>=100) {rank=3;}


        return rank;
    }

}
