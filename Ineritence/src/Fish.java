public class Fish extends Animal{

    private int gills;
    private int fins;

    public Fish (String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscles ()
    {
        System.out.println("Muscles moving");
    }
    private void backFin ()
    {
        System.out.println("Back fins moving");
    }


    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if (speed == "fast") backFin();
        System.out.println();

    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                ", type='" + type + '\'' +
                "} " + super.toString();
    }
}
