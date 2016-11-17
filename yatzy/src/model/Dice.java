package model;

import java.util.Random;

public class Dice {
	
	// State of the dice
	private boolean frozen = false;
	private int value = 0;
	
    public boolean isFrozen (){
    	return frozen;
    }
    
    public void freezeDice (){
    	frozen = true;
    }
    
    public void unfreezeDice (){
    	frozen = false;
    }
    
    public int getValue (){
    	return value;
    }

    public void resetDice (){
    	frozen = false;
    	value = 0;
    }
    
	// Get a Random value between 1 and 6

    public int rollDice (){

        if (frozen == true) throw new IllegalStateException ("Dice is frozen");
    	
    	Random rand = new Random ();    	
    	value = rand.nextInt(6) +1;
    	return value;
    	
    }
}
