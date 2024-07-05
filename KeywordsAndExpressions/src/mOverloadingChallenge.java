public class mOverloadingChallenge {

    public static void main(String[] args)
    {
        System.out.println(convertToCentimeters(100));
        System.out.println(convertToCentimeters(5,10));
    }

    public static double convertToCentimeters (int height)
    {
      double heightCM = height*2.54;
        return heightCM;

    }

    public static double convertToCentimeters (int heightFeet , int heightInch)
    {
        heightInch = heightInch+ heightFeet*12;
        return convertToCentimeters(heightInch);

    }
}
