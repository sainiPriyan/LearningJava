import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] words =
                {
                        "abcdefgsfewgwgweg"
                };


        String randomWord = words[new Random().nextInt(words.length)];

        System.out.println(randomWord);

        String[] letters = randomWord.split("");

        System.out.println(Arrays.toString(letters));


    }
}