class Refrigerator
{    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood()
    {
        if (hasWorkToDo) {
            System.out.println("Ordering Food");
            hasWorkToDo = false;
        }
    }
}

class DishWasher
{    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes()
    {
        if (hasWorkToDo) {
            System.out.println("Washing Dishes");
            hasWorkToDo = false;
        }
    }
}

class CoffeeMaker
{    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee()
    {

        if (hasWorkToDo) {
            System.out.println("Coffee is getting brewed!");
        hasWorkToDo = false;
        }
    }
}
