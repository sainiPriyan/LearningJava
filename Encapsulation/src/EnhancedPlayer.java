public class EnhancedPlayer {
    private String fullName;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String fullName) {
        this(fullName,100,"Sword");
    }

    public EnhancedPlayer(String fullName, int healthPercentage, String weapon) {
        this.fullName = fullName;

        if(healthPercentage <= 0)
        { this.healthPercentage = 1;}
        else if (healthPercentage >=100)
        {this.healthPercentage =100;}
        else {this.healthPercentage = healthPercentage;}

        this.weapon = weapon;
    }

    public EnhancedPlayer(String fullName, String weapon) {
        this.fullName = fullName;
        this.weapon = weapon;
    }

    public void loseHealth(int damage)
    {
        healthPercentage -= damage;
        if (healthPercentage <= 0){
            System.out.println("player died");
        }
    }
    public void restoreHealth (int extraHealth) {
        healthPercentage += extraHealth;
        if (healthPercentage >100)
        {
            healthPercentage = 100;
            System.out.println("player has been restored to full health");
        }
    }

    public int healthRemaining()
    {
        return healthPercentage;
    }

//    @Override
//    public String toString() {
//        return "EnhancedPlayer{" +
//                "name='" + name + '\'' +
//                ", health=" + health +
//                ", weapon='" + weapon + '\'' +
//                '}';
//    }
}
