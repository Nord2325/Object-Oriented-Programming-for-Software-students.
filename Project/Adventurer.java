public class Adventurer extends Characters {

private int numHealthPotions;   
private int healthPotionHealAmount; 


public Adventurer(){
    super(100,50);
    numHealthPotions = 3;
    healthPotionHealAmount = 30; 
}

public void usePotion(){
    health += healthPotionHealAmount;
    numHealthPotions--;
}

public void getHealthPotion(){
    numHealthPotions++;
}

public int getNumHealthPotions(){
    return numHealthPotions;
}

public int getHealthPotionHealAmount(){
    return healthPotionHealAmount;
}
}