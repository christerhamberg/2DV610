package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDice {

	@Test
	public void testFreezeDiceIsFrozen() {
		
		// Create a dice
		Dice dc = new Dice ();
		
		// Check that it by default is unfrozen
		assertFalse (dc.isFrozen());
		
		// Freeze the dice
		dc.freezeDice ();
		
		// Check that it is frozen
		assertTrue (dc.isFrozen());
		
	}
	
	@Test
	public void testRollDice (){
		
		int DICE_LOW = 1;
		int DICE_HIGH = 6;
		
		Dice dc = new Dice ();
		
		int value = dc.rollDice ();
		
		if (value>=DICE_LOW) assertTrue(true);
		else fail ("Value of dice to low");
		
		if (value<=DICE_HIGH) assertTrue (true);
		else fail ("Value of dice to high");
		
	}


}
