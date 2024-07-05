public class Main { // Main
    public static void main(String[] args)
    {

        Animal animal = new Animal("Generic Animal", "Huge",400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog,"fast");

        Animal newAnimal = new Animal();
        doAnimalStuff(newAnimal,"fast");

        Dog yorkie = new Dog("Yorkie",15);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog ("retriever", 50,"Floppy","Swimmer");
        doAnimalStuff(retriever,"slow");

        Dog wolf = new Dog("wolf",40);
        doAnimalStuff(wolf,"fast");

        Fish goldfish = new Fish("gold fish",0.25,2,3);
        doAnimalStuff(goldfish,"fast"); 

    }

    public static void doAnimalStuff(Animal animal, String speed)
    {

        animal.noise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("________________________________________");

    }
}





