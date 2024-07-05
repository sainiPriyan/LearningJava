public class BankAcc {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private int phone;

    public BankAcc()
    {
        this(99,0,"no name","no email",0);
        System.out.println("Empty constructor called");
    }

    public BankAcc(String name, String email, int phone) {

        this(0,0,name,email,phone);

        //this.name = name;
        // this.email = email;
        //this.phone = phone;
    }

    public BankAcc(int accountNumber, double balance, String name, String email, int phone)
    {
        System.out.println("Constructor with parameters called");

        setAccountNumber(accountNumber); //calling setter so assign value to accountNumber field
        this.balance = balance;          // better to assign value directly
        this.name = name;
        this.email = email;
        this.phone = phone;




    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance()
    {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void deposit(double money)
    {

        balance += money;
        System.out.println(money+" was deposited into you bank acc");
    }

    public double withdraw(double money)
    {
        if (money<=balance)
        {
            balance-=money;
            System.out.println(money+" was withdrawn from your bank acc");
            System.out.println(balance+" money left");
            return money;
        }

        else {
            System.out.println("Insufficient Balance");
            return 0;
        }
    }

}
