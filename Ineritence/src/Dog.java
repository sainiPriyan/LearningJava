public class Dog extends Animal { // child class

    private String tailShape;
    private String earShape;
    public Dog (String type, double weight)
    {
        this(type,weight,"Perky","Curled");
    }
    public Dog()
    {
        super("doggi","big",30);
    }



    public Dog(String type, double weight, String tailShape, String earShape) {
        super(type, weight<15?"small":(weight<35?"medium":"large"), weight);
        this.tailShape = tailShape;
        this.earShape = earShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "tailShape='" + tailShape + '\'' +
                ", earShape='" + earShape + '\'' +
                "} " + super.toString();
    }

    public void noise ()
    {
        if (type == "wolf") System.out.println("Ow WOOOO!");
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) { // (dog) subclass method
        super.move(speed);
        if  (speed == "slow")
        {
            walk();
            wag();
        }

        else {
            run();
            bark();
        }
        //System.out.println("Dogs walk, run and wag their tail.");
    }

    private void bark()
    {
        System.out.println("WOOF!");
    }
    private void run()
    {
        System.out.println("Dog running!");
    }

    private void walk()
    {
        System.out.println("dog walk!");
    }

    private void wag()
    {
        System.out.println("dog wag tail!");
    }

}
