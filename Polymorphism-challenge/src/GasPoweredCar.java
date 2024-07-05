public class GasPoweredCar extends Car{

    private double avgKmPerLitre;
    private int cylinders;
    public GasPoweredCar(String name) {
        super(name);
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setAvgKmPerLitre(double avgKmPerLitre) {
        this.avgKmPerLitre = avgKmPerLitre;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public GasPoweredCar(String name, double avgKmPerLitre, int cylinders) {
        super(name);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

}
