public class Main {

    public static void main(String[] args)
    {
        SalariedEmployee jim =
                new SalariedEmployee("jim","23/09/2000","12/09/2020",2000000,false);

        System.out.println("Salary = "+jim.collectPay());
        System.out.println("Age - "+jim.getAge());
        jim.terminate("15/10/2022");
        System.out.println(jim);


        System.out.println("------------------------------------------------------------------------------------------------");

        SalariedEmployee jame =
                new SalariedEmployee("jame","23/09/1990","22/09/2020",1234665,false);
        System.out.println("Age - "+jame.getAge());

        System.out.println("James paycheck = $"+(int)jame.collectPay());
        jame.retire();
        System.out.println("James pension pay = $"+(int)jame.collectPay());
        System.out.println(jame);

        System.out.println("------------------------------------------------------------------------------------------------");

        HourlyEmployee jeb = new HourlyEmployee("jeb","23/09/1999","22/09/2020",12);
        System.out.println(jeb);
        System.out.println("Jeb's daily paycheck = $"+jeb.collectPay());
        System.out.println("Jeb's Holiday pay = $"+jeb.getDoublePay());

    }
}
