public class challenge {

    public static void main(String[] args) {
        double x = 20.00;
        double y = 80.00;
        double addition = (x + y) * 100;
        double remainder = addition % 40.00;
        boolean remainderValue = remainder == 0.00;

        System.out.println("Remainder: "+remainder);

        if(!remainderValue)
        {
System.out.println("got some remainder");
        }


    }
}