public class Main {

    public static void main(String[] args)
    {
            for (int counter = 1; counter<=5;counter++)
            {
                System.out.println(counter+". I love cats");
            }

            for(double rate = 1; rate<=20; rate++)
            {
                System.out.println("$10,000 at "+rate+"% rate of interest = $"+calculateInterest(10000,rate));
            }

            for (double rateN=7.5;rateN<=10;rateN+=0.25){

                if (rateN>8.5){break;}
                System.out.println("$100 at "+rateN+"% interest = $"+calculateInterest(100,rateN));
            }

    }

        public static double calculateInterest (double amount, double interestRate){

        return amount*(interestRate/100);

        }
}
