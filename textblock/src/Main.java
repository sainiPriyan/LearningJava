public class Main {
    public static void main(String[] args)
    {
        String bulletIt = "Print a bulleted list:\n" + "\t\u2022 First point\n"
                +"\t\t\u2022 sub point";
        System.out.println(bulletIt);

        String textBlock = """
                Print a bulleted list:
                     \u2022 First Point
                        \u2022 sub point
                """;
        System.out.println(textBlock);

        int age = 19;
        System.out.printf("age = %d%n", age);

        int yearOfBirth = 2024 - age;
        System.out.printf("year of birth = %.2f",(float)yearOfBirth);

        System.out.printf("year of birth = %x",yearOfBirth); // Hexa-Decimal

        for(int i = 1; i<1000000;i*=10)
        {
            System.out.printf("Printing %d%n",i);
        }

        for(int i = 1; i<1000000;i*=10)
        {
            System.out.printf("Printing %6d%n",i); // setting number width to 6
        }

        for (int i =0 ; i<100;i+=10)
        {
            System.out.printf(" %x",i);
        }

        String formattedString = String.format("\nYour age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);






    }


}
