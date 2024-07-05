public class main {
    public static void main(String[] args)
    {
        int number = 5;
        int evenNumber=0;
        int oddNumber=0;

        while (true)
        {
            if (isEven(number)) {
                System.out.println(number+" is even.");
                evenNumber++;
            }
            else {oddNumber++;}
             number++;
            if(number>20 || evenNumber == 5){break;}
        }
        System.out.println(evenNumber+" even numbers found.");
        System.out.println(oddNumber+" odd numbers found.");

    }
    public static boolean isEven (int number)
    {
        return (number % 2 == 0);
    }
}
