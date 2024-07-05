public class Main {
    public static void main(String... args){

        System.out.println("Hello World!");
        System.out.println("-".repeat(20));

        String s = "Hello World Again!";
        String [] strings = s.split(" ");
        printText(strings);
        System.out.println("-".repeat(20));

        printText("hey");
        System.out.println("-".repeat(20));

        printText("how","are","you","doing");
        System.out.println("-".repeat(20));

        printText();

        String[] sArray = {"first","second","third","fourth","fifth"};
        System.out.println(String.join(", ",sArray));

    }
private static void printText(String... textList){

        for (String s : textList ){
            System.out.println(s);
        }
}
}
