public class main {

    public static void main(String[] args) {

        int x=0;
        int y=0;

        for (int i=1;i<1000;i++)
        {
            if (i%15 == 0)
            {
                System.out.println("found a number");
                y++;
                x=x+i;

                if(y==5)
                {
                    System.out.println("successfully 5 numbers");
                    System.out.println("sum of the numbers is "+x);
                    break;

                }
            }
        }
    }
}
