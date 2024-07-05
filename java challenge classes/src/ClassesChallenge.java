public class ClassesChallenge {

    public static void main(String[] args)
    {
        BankAcc bankAcc = new BankAcc();
        //BankAcc bankAcc = new BankAcc(124,10000.00,"bob","email",1242121);
        //bankAcc.setBalance(1000);

        System.out.println("Acc no - "+bankAcc.getAccountNumber());
        System.out.println("Balance = $"+ bankAcc.getBalance());
        System.out.println("name - "+bankAcc.getName());
        System.out.println("email - "+bankAcc.getEmail());
        System.out.println("phone - "+bankAcc.getPhone()+"\n");

        bankAcc.deposit(1000);

        double cash = bankAcc.withdraw(10000);
        System.out.println("Cash = $"+cash);

        BankAcc bankAcc2 = new BankAcc("joe","email",91021211);
        System.out.println(bankAcc2.getAccountNumber()+"\n"+bankAcc2.getBalance()+"\n"+bankAcc2.getName()+"\n"+bankAcc2.getEmail()
        +"\n"+bankAcc2.getPhone());

    }

}
