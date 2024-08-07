public class HourlyEmployee extends Employee{

    private double hourlyPayRate;
    public HourlyEmployee(String name,String birthDay,String hireDate,double hourlyPayRate)
    {
        super(name, birthDay,hireDate);
        this.hourlyPayRate = hourlyPayRate;

    }

    @Override
    public double collectPay() {
        return hourlyPayRate*12;
    }

    public double getDoublePay ()
    {
        return collectPay()*2;
    }
}
