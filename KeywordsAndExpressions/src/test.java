public class test {

    public static void main(String[] args) {
        toMilesPerHour(-1,2);
    }

    public static long toMilesPerHour  (double kilometersPerHour,int hourOfDay)
    {

        double mPH;


        if (hourOfDay<8 || hourOfDay >22)
        { System.out.println("yes");}
        mPH = kilometersPerHour*1.61 ;
        long rounded = Math.round(mPH);

        if (kilometersPerHour >= 0)
        {return rounded;}
        else
        {
            return -1 ;
        }
    }



}