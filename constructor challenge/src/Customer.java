public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    public String getName()
    {
        return name;
    }
    public double getCreditLimit()
    {
        return creditLimit;
    }

    public String getEmail()
    {
        return email;
    }

    public Customer(String name, double creditLimit, String email)
    {
        System.out.println("const with 3 para called");
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer(String name)
    {
        this(name,0,"no email");
        System.out.println("const with name para called");
    }

    public Customer()
    {
        this("no name",0,"no email");
        System.out.println("const with no para called");
    }






    }
