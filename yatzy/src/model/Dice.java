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
    
    
	// Get a Random value between 1 and 6

    public int rollDice (){
    	    	
    	Random rand = new Random ();    	
    	int randomNumber = rand.nextInt(6) +1;
    	return randomNumber;
    	
    }
}
