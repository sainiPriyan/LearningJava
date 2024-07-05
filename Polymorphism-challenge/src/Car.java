public class Car {
    private String description;
    private String name;

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public Car(String name) {
        this.name = name;
    }
    public void startEngine() {
        description = "Engine is on";
        System.out.println("Starting the Engine");
    }
    public void drive(){
        runEngine();
        System.out.println("The "+ this.getClass().getSimpleName()+ " is now moving");
        description = "car is moving";
    }
    protected void runEngine() {
     description = "Engine is on";
    }
    public static Car car (String type, String name){
        switch (type.toUpperCase().charAt(0)){

            case 'H' -> {return new HybridCar("off");}
            case 'E' -> {return new ElectricCar("off");}
            case 'G' -> {return new GasPoweredCar("off");}
            default -> {return new Car("off");}
     }
    }
}



