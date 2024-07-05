public class fourthClass {
    public static void main(String[] args)
    {
        int topScore = 80;
        if (topScore > 100)
        { System.out.println("You got the highest score!"); }

        int secondTopScore = 79;
        //if (topScore > secondTopScore && topScore<100)
        //{System.out.print("Greater than second top score!");}

        if (topScore > secondTopScore || topScore>1)
        {System.out.println("Greater than second top score!");}

        int newvalue = 50;
        if (newvalue == 50)
        {
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if(isCar == true)
        {
            System.out.println("This is not supposed to happen");
        }
String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar=="Volkswagen" ? false:true;
        if(isDomestic){
            System.out.println("This car is  domestic to our country");
        }
    }
}
