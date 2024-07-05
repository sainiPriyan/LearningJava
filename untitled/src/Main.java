import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
         Car car = new Car();

         car.describeCar();

         car.make = "ferrari";
        System.out.println(car.make);

        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getDoors());

        car.setMake("porsche");
        car.setModel("new");
        car.setColor("yellow");
        car.setDoors(1);
        car.setConvertible(false);

        car.describeCar();


        Car newCar = new Car();
        newCar.setMake("goodCar");
        newCar.setModel("fire");
        newCar.setColor("red");
        newCar.setDoors(4);
        newCar.setConvertible(true);

        newCar.describeCar();

        String[]  messi = {"https://media.tenor.com/NaEXDzxTjZkAAAAd/messi-goat.gif",
                "https://media.tenor.com/EA8GpdFBZfgAAAAC/messi-goat-messi.gif",
                "https://media.tenor.com/NXAZH6Xmp00AAAAC/messi-goat.gif",
                "https://media.tenor.com/vDGS7Y7FQDcAAAAC/goat-messi.gif",
                "https://media.tenor.com/VhFmRTHDglQAAAAd/messi-ronaldo.gif",
                "https://media.tenor.com/VGERko9PqWgAAAAC/%D9%85%D9%8A%D8%B3%D9%8A-rkh16.gif",
                "https://media.tenor.com/GEUH-QIjlesAAAAd/haot.gif",
                "https://media.tenor.com/Rd9u9Bz7TdUAAAAC/lionelmessi-kingmessi.gif",
                "https://media.tenor.com/WWuKr0zRdGYAAAAC/messi.gif",
                "https://media.tenor.com/ZJthpZuIHo8AAAAC/cristiano-ronaldo-messi.gif",

        };
        System.out.println(messi[new Random().nextInt(messi.length)]);
    }
}
