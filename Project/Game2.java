/**
 * Shaun Nord
 * 10/11/2021
 */
import java.util.Scanner; 
import java.util.Random; 

public class Game2 {

Random rand;
Scanner in; 

Adventurer adventurer;
private int healthPotionDrop;
boolean running;

public static void main (String[] args){
	


    Game2 game = new Game2();
    game.run();
    System.out.println("Thanks for playing!");
    
}

public Game2(){
    // System Objects
    in = new Scanner(System.in);
    rand = new Random(); 

	System.out.println("Welcome to Ragnarok.");
	System.out.println("Ragnarok is a text based adventure game that involves fighting monsters.");	
	System.out.println(" ");
	System.out.println("You are a Sorcerer that has the unfortunate luck to be alive during Ragnarok."
			+ "\nYou have been trained in combat, and you're an expert "
			+ "with the sword, crossbow, and spell casting. ");
	System.out.println ("\nYour objective is to kill any enemy that challenges you on your path.");
	System.out.println("There is no room for mistakes.");
	System.out.println("\nMany have tried, and all have been sent to Valhalla.");
	
	 adventurer = new Adventurer();
	    healthPotionDrop = 50;
}


public void run(){
	
    running = true;
    GAME:
    while (running) {
        System.out.println("-----------------------------------------------------------------------------------------------");

        Enemies enemy = new Enemies();
        String enemyType = enemy.getType();
        System.out.println("\t##### A " + enemyType + " has appeared! #####\n");

        while(enemy.getHealth() > 0) {

            System.out.println("\tYour health: " + adventurer.getHealth());
            System.out.println("\t " + enemyType + " health: " + enemy.getHealth());
            System.out.println("\n\tWhat action would you like to take?");
            System.out.println("\t1. Attack");
            System.out.println("\t2. Health potion");
           

            String input = in.nextLine(); 
            if(input.equals("1")){

                int damageTaken = enemy.attack();
                int damageProduced = adventurer.attack();

                enemy.takeDamage(damageProduced);
                adventurer.takeDamage(damageTaken);

                System.out.println("\t> Your attack on the " + enemyType + " caused " + damageProduced + " damage."); 
                System.out.println("\t> The "+ enemyType + " caused " + damageTaken + " in a counter attack!"); 

                if(adventurer.getHealth() < 1) {

            
                    break; 
                }


            }

            else if (input.equals("2")){
                if(adventurer.getNumHealthPotions() > 0) {

                	adventurer.usePotion();
                    System.out.println("\t> The health potion as upped your health to " + adventurer.getHealthPotionHealAmount() + "."
                                        + "\n\t> You now have" + adventurer.getHealth() + "HP."
                                        + "\n\t> You have" + adventurer.getNumHealthPotions() + "health potions left.\n"); 

                }

                else {
                    System.out.println("\t> You have used all your potions!! Kill the enemy to recieve a potion. \n"); 
                    }

                }

            

            else {

                System.out.println("\tInvalid Command!");

            }

        }

        if(adventurer.getHealth() < 1) {

            System.out.println("You were killed.");
            break; 
        }


        System.out.println("---------------------------------------------");
        System.out.println(" # " + enemyType + " was killed! #"); 
        System.out.println(" # You have " + adventurer.getHealth() + " HP left. #");
        if(rand.nextInt(100) < healthPotionDrop) {

        	adventurer.getHealthPotion();
            System.out.println(" # The " + enemyType + " dropped a health potion! #");
            System.out.println(" # You now have " + adventurer.getNumHealthPotions() + "health potion(s). # ");


        }
        System.out.println("---------------------------------------------");
        System.out.println("1. Continue fighting");
        System.out.println("2. Exit game");

        String input = in.nextLine();

        while(!input.equals("1") && !input.equals("2")) {
            System.out.println("invalid Command!");
            input = in.nextLine(); 
        }

        if(input.equals("1")) {

            System.out.println("You continue on your adventure!");
        }

        else if (input.equals("2")) {
            System.out.println("You have exited the game"); 
            break;
        }
    }
}

}