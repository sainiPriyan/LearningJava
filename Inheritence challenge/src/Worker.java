public class Worker {

     String name;
    private String birthDay;
     String endDate;

    public Worker (String name, String birthDay)
    {
        this.name = name;
        this.birthDay = birthDay;

    }

    public int getAge()
    {
        return 2024 - Integer.parseInt(birthDay.substring(6));

    }

    public double collectPay()
    {
        return 0;
    }

    public void terminate(String endDate)
    {
        this.endDate = endDate;
        System.out.println(  name +" was fired on "+endDate+" at the age of "+getAge());

    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                '}';
    }
}
