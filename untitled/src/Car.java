public class Car {

    public String make = "tata";
    private String model = "nexon";
    private String color = "gray";
    private int doors= 4;
    private boolean isConvertible = true;

    public void describeCar()
    {
        System.out.println(doors+"-Door "+ color+ " color "+ make+" make "+ model+" model "+(isConvertible?"convertible":"") );
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public String  getModel()
    {
        return model;
    }

    public void setColor( String setColor)
    {
        color = setColor;
    }

     public void setMake(String make)
     {
         this.make = make;
     }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }
}
