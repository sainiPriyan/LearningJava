public class Main {
    public static void main(String[] args)
    {

        String string = "Hello World";
        stInfo(string);

        stInfo("");
        stInfo("     ");
        stInfo("\t\n");

        System.out.printf("%nIndex of r = %d%n",string.indexOf('r'));
        System.out.printf("Index of world = %d%n",string.indexOf("World"));
        System.out.printf("Index of l = %d%n",string.indexOf('l'));
        System.out.printf("Index of l = %d%n",string.lastIndexOf('l'));

        System.out.printf("Index of l = %d%n",string.indexOf('l',3)); // search towards the end of the string
        System.out.printf("Index of l = %d%n",string.lastIndexOf('l',3)); //search towards the beginning of the string'

        String stringToLower = string.toLowerCase();



    }

    public static void stInfo(String st)
    {
        int length = st.length();

        System.out.printf("Length of the string = %d %n",length);

        if (length == 0)
        {System.out.println("String is empty");
            return;}

        if (st.isBlank())
        {
            System.out.println("string is blank!");
            return;
        }

        char char1 = st.charAt(0);
        char charLast =  st.charAt(length-1);


        System.out.printf("First Char = %c %n",char1);
        System.out.printf("Last Char = %c %n",charLast);
    }
}
