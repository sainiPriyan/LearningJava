public class Main {

    public static void main(String[] args) {

     /*  for (int i = 1; i<=5; i++)
        {
            System.out.println(i);
        }
        int j = 1;
        boolean isReady = false;

        do
        {
            System.out.println("j= "+j);
            j++;
            if (j>5)
            {break;}
            isReady = (j>0);
        }
        while (isReady);

      */

        for (int i = 0; i<50; i+=5)
        {
            if (i%25 == 0)
            {continue;}
            System.out.print(i+"_");

        }


    }
}
