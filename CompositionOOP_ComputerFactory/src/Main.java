public class Main {
    public static void main(String args[])
    {
        ComputerCase computerCase = new ComputerCase("2028","DELL",220);
        Monitor monitor = new Monitor("27 Beast","Acer",27,"2540 x 1440");
        Motherboard motherboard = new Motherboard("BJ-1213","ASUS",4,6,"v2.44");

        PersonalComputer personalComputer = new PersonalComputer("2028","DELL",computerCase,monitor,motherboard);

//        personalComputer.getMonitor().drawPixelAt(10,10,"red");
//        personalComputer.getMotherboard().loadProgram("Windows OS");
//        personalComputer.getComputerCase().pressPowerButton();

        personalComputer.powerUp();


    }
}
