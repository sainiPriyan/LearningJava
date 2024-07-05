public class ElectricCar extends Car{

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name) {
        super(name);
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setAvgKmPerCharge(double avgKmPerCharge) {
        this.avgKmPerCharge = avgKmPerCharge;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public ElectricCar(String name, double avgKmPerCharge, int batterySize) {
        super(name);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }
}
