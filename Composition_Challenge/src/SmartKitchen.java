public class SmartKitchen {

    private Refrigerator iceBox;
    private DishWasher dishWasher;
    private CoffeeMaker brewMaster;

    public SmartKitchen()
    {
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
        brewMaster = new CoffeeMaker();
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public void doKitchenWork()
    {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
    public void addWater()
    {
        brewMaster.setHasWorkToDo(true);
    }

    public void pourMilk()
    {
        iceBox.setHasWorkToDo(true);
    }
    public void loadDishwasher()
    {
        dishWasher.doDishes();
    }
    public void setKitchenState(boolean refrigerator, boolean dishWasher, boolean coffee )
    {
        iceBox.setHasWorkToDo(refrigerator);
        this.dishWasher.setHasWorkToDo(dishWasher);
        brewMaster.setHasWorkToDo(coffee);
    }


}
