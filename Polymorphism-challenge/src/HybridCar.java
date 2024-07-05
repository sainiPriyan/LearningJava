public class HybridCar extends Car{

    private double avgKmPerLitre;
    private int batterySize;
    private int cylinder;
    public HybridCar(String name) {
        super(name);
    }

    public void setAvgKmPerLitre(double avgKmPerLitre) {
        this.avgKmPerLitre = avgKmPerLitre;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinder() {
        return cylinder;
    }

    public HybridCar(String name, double avgKmPerLitre, int batterySize, int cylinder) {
        super(name);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinder = cylinder;
    }
}
