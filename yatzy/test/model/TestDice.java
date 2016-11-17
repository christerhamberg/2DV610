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
		else fail ("Value of the dice is to low");
		
		if (value<=DICE_HIGH) assertTrue (true);
		else fail ("Value of the dice is to high");
		
	}

	
	@Test
	public void testRollDice10000 (){
		
		int DICE_LOW = 1;
		int DICE_HIGH = 6;
		
		Dice dc = new Dice ();
		
		for (int loop=0;10000>loop;loop++){
		
			int value = dc.rollDice ();
		
			if (value>=DICE_LOW) assertTrue(true);
			else fail ("Value of the dice is to low");
		
			if (value<=DICE_HIGH) assertTrue (true);
			else fail ("Value of the dice is to high");
					
		}
		
	}

	@Test(expected = IllegalStateException.class) 
	public void testRollDiceException (){
		
		int DICE_LOW = 1;
		int DICE_HIGH = 6;
		
		Dice dc = new Dice ();
		
		int value = dc.rollDice ();
		
		if (value>=DICE_LOW) assertTrue(true);
		else fail ("Value of the dice is to low");
		
		if (value<=DICE_HIGH) assertTrue (true);
		else fail ("Value of the dice is to high");
	
		// FREEZE the dice
		
		dc.freezeDice();
		
		int value2 = dc.rollDice();
		
		// we should not get to this point
		fail ("Rolling of frozen dice possible, this should cause an exception");
		
	}
}
