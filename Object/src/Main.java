public class Main extends Object{

    public static void main (String[] args)
    {

        Student max = new Student("max",18);
        System.out.println(max);

        PrimarySchoolStudent jim = new PrimarySchoolStudent("jim",9,"max");
        System.out.println(jim);
    }
}

class Student
{
    private String name;
    private int age;

     Student (String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String toString()
    {
        return  name+" is "+ age+" years old";
    }

}

class PrimarySchoolStudent extends Student
{
    String parent;
    PrimarySchoolStudent (String name, int age, String parent)
    {
        super(name,age);
        this.parent = parent;
    }

   @Override
   public String toString() {
      return super.toString() + " and is child of "+parent;
    }
}

