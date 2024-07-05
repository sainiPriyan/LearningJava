public class anotherChallenge {
    public static void main(String[] args) {

        System.out.println("My method = "+sumDigits(3434));

        System.out.println("Alt method = "+sumDigitsAnotherWay(3434));


    }
 public static int sumDigits (int number)
 {
     if (number>=0) {
         int sum = 0;

         for (int i = 10; i < 1000000000; i = i * 10) {
             int num = (Integer) number / i;

             int numb = (Integer) (number - (num * i)) / (i / 10);

             sum += numb;


             if (num == 0) {
                 break;
             }
         }

         return sum;
     }
     else return -1;
 }

    public static int sumDigitsAnotherWay (int number)
    {
        if (number>=0) {
            int sum = 0;

            while (number>9)
            {
                sum += (number%10);
                number = number/10;
            }

            sum += number;

            return sum;
        }
        else return -1;
    }

}
