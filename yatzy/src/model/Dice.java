package model;

import java.util.Random;

public class Dice {
	
	// State of the dice
	boolean frozen = false;
	
	
    public boolean isFrozen (){
    	return frozen;
    }
    
    public void freezeDice (){
    	frozen = true;
    }
    
    public int rollDice (){
    	
    	Random rand = new Random ();
    	int randomNumber = rand.nextInt(6) +1;
    	return randomNumber;
    	
    }
}
