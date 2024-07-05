public class Main {
    public static void main(String[] args)
    {
        Customer customer = new Customer();

        System.out.println("Name- "+customer.getName()+"\n"+"Credit limit - "
                +customer.getCreditLimit()+"\n"+"Email - "+customer.getEmail()+"\n");

        Customer customer1 = new Customer("jim");
        System.out.println("Name- "+customer1.getName()+"\n"+"Credit limit - "
                +customer1.getCreditLimit()+"\n"+"Email - "+customer1.getEmail()+"\n");

        Customer customer2 = new Customer("tim",100000,"124@email.com");
        System.out.println("Name- "+customer2.getName()+"\n"+"Credit limit - "
                +customer2.getCreditLimit()+"\n"+"Email - "+customer2.getEmail()+"\n");
    }
}
