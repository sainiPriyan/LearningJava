public class Main {
    public static void main(String[] args)
    {
        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getBrewMaster().setHasWorkToDo(true);

//        kitchen.getBrewMaster().brewCoffee();
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().orderFood();

        kitchen.setKitchenState(false,true,true);
        kitchen.doKitchenWork();
    }


}
