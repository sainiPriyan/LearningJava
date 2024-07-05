public class test {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(10));

    }


        public static int sumFirstAndLastDigit (int number)
        {

            if (number<0)
            {return -1;}

            else if (number<10){return number*2;}

            else {

                int lastDigit = number%10;



                int last=9;
                int i = 0;
               while (last>0){
                    i=last;
                    last = number%10;
                    number/=10;


                }

                return (i+lastDigit);

            }


        }

}

