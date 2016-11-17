package model;

public class Dice {
	
	// State of the dice
	boolean frozen = false;
	
	
    public boolean isFrozen (){
    	return frozen;
    }
    
    public void freezeDice (){
    	frozen = true;
    }
    
}
