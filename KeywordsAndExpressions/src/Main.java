public class Main {
    public static void main(String[] args){

        double kilometers = (100 * 1.609344);
        int highscore  = 50;

        if (highscore > 25) {
            highscore = highscore + 1000; //100 bonus points
        }
        int health = 100;
        if ((health<25) && (highscore > 100 ))
        { highscore = highscore - 1000;}

    }

}
