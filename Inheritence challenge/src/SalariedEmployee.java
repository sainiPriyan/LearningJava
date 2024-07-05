public class SalariedEmployee extends Employee{

    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDay, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDay, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire()
    {
        isRetired = true;
        System.out.println(name + " got retried at the age of " + getAge());

    }

    @Override
    public double collectPay() {

        return (isRetired) ? annualSalary * 0.6 / 12 : annualSalary * 0.9 / 12;

    }
}
