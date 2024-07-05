public class Employee extends Worker{

    long employeeId;
    String hireDate;

    protected static int employeeNumber = 1;

    public Employee(String name,String birthDay,String hireDate)
    {
        super(name,birthDay);
        this.employeeId = Employee.employeeNumber++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }
}
