public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage)
    {
        health-= damage;
        if (health <= 0){
            System.out.println("player died");
        }
    }
    public void restoreHealth (int extraHealth) {
            health += extraHealth;
            if (health>100)
            {
                health = 100;
                System.out.println("player has been restored to full health");
            }
    }

    public int healthRemaining()
    {
        return health;
    }


}
