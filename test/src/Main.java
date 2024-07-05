import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words =
                {
                        "break", "games"
                };
        String[] result = {};

        ArrayList<String> resultList = new java.util.ArrayList<>(Arrays.stream(result).toList());

        String randomWord = words[new Random().nextInt(1,words.length)];

        //System.out.println(randomWord);a

        String[] letters = randomWord.split("");

        for (int i = 1;i<=letters.length;i++)
        {
            resultList.add("_");
        }
        System.out.println(resultList);

        ArrayList<String> list = new java.util.ArrayList<>(Arrays.stream(letters).toList());
        ArrayList<String> original = new java.util.ArrayList<>(Arrays.stream(letters).toList());

        int randomNumber = new Random().nextInt(letters.length);

        list.remove(randomNumber);
        list.add(randomNumber, "_");

        original.remove(randomNumber);

        resultList.remove(randomNumber);
        resultList.add(randomNumber, letters[randomNumber]);

        for (int i = 0; i <= letters.length - 1; i++) {
            System.out.print(resultList.get(i));
        }

        Scanner scanner = new Scanner(System.in);
        String l;

        while (!original.isEmpty()) {
            l = scanner.next();

            if (list.contains(l)) {

                System.out.println("CORRECT!");
                int index = list.indexOf(l.toLowerCase());

                list.remove(l.toLowerCase());
                list.add(index, "_");

                original.remove(l.toLowerCase());

                resultList.remove(index);
                resultList.add(index, letters[index]);

                for (int i = 0; i <= letters.length-1; i++) {
                    System.out.print(resultList.get(i));
                }

            } else System.out.println("NOT FOUND");
        }
        System.out.println("\nCONGRATS!");
    }
}
