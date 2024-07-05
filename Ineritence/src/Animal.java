public class Animal { // parent class

    protected String type;
    private String size;
    private double weight;

    public Animal()
    {

    }
    public Animal(String type, String size, double weight)
    {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move (String speed) // (Animal) parent class method
    {
        System.out.println(type+" moves " + speed);
    }

    public void noise ()
    {
        System.out.println(type+" makes some kind of noise ");
    }
}
