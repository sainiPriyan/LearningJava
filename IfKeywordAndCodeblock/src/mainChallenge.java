public class mainChallenge {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800,5,100);
        System.out.println("High Score is "+highScore);

        System.out.println("The second high score is "+
        calculateScore(true,10000,8,200));
    }
    public static int calculateScore(boolean gameOver, int score, int levelComplete, int bonus) {

            int finalScore = score;

            if (gameOver) {
            finalScore += bonus * levelComplete;
            finalScore += 1000;

        }

            return finalScore;

    }
}

