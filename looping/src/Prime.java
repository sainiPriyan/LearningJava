public class Prime {

    public static void main(String[] args) {

        int j = 0;

        for (int i=1000; i<=10000; i++) {


            if (isPrime(i)){
                j++;
                System.out.println(i+" is a Prime number");
                if (j>=3)
                {
                    System.out.println("3 prime numbers found");
                    break;
                    }
            }
        }
    }

    public static boolean isPrime (int wholeNumber)
    {


        if (wholeNumber<2)
        {return false;}

       for (int i = 2; i <wholeNumber; i++ )
       {
           if (wholeNumber%i == 0)
           {
              return false;

           }
       }


return true;
    }
}
