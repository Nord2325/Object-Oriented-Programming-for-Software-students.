
public class Enemies extends Characters{

private String[] enemies = {"Troll", "Draugar", "Dark Elf", "Dwarf"}; 
private String type;
private int maxHealth; 
private int health;
private int attackDamage; 

public Enemies(){
    super(100,25);
    maxHealth = 75;
    attackDamage = 25;
    type = enemies[rand.nextInt(enemies.length)]; //Set random enemy from array
    health = rand.nextInt(maxHealth);

}

public String getType(){
    return type;
}

}