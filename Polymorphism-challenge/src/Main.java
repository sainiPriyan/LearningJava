public class Main {
    public static void main(String[] args) {

        Car tesla = Car.car("electric","tesla");
        runRace(tesla);

        Car ferrari = new GasPoweredCar("Ferrari",10,6);
        runRace(ferrari);

        Car lambo = new HybridCar("Lamborghini",12,60,10);
        runRace(lambo);
    }
    public static void runRace(Car car){
        car.startEngine();
        car.drive();
        System.out.println();
    }

}
