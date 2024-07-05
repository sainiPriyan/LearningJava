public class Main {
    public Main() {
    }

    public static void main(String args[]) {

//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//
//        System.out.println("Remaining health: "+ player.healthRemaining());
//
//        player.loseHealth(11);
//        System.out.println("Remaining health: "+ player.healthRemaining());




        EnhancedPlayer tim = new EnhancedPlayer("Tim");
        System.out.println(tim.healthRemaining());

        EnhancedPlayer tim2 = new EnhancedPlayer("Tim",200,"Sword");
        System.out.println(tim2.healthRemaining());


    }



}
