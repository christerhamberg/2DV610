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
	public void testFreezeUnFreeze() {
		
		// Create a dice
		Dice dc = new Dice ();
		
		// Check that it by default is unfrozen
		assertFalse (dc.isFrozen());
		
		// Freeze the dice
		dc.freezeDice ();
		
		// Check that it is frozen
		assertTrue (dc.isFrozen());
		
		// Unfreeze the dice
		dc.unfreezeDice ();
				
		// Check that it by default is unfrozen
		assertFalse (dc.isFrozen());		

		// Freeze the dice
		dc.freezeDice ();
		
		// Check that it is frozen
		assertTrue (dc.isFrozen());
		
		// Unfreeze the dice
		dc.unfreezeDice ();
				
		// Check that it by default is unfrozen
		assertFalse (dc.isFrozen());		

	}

	@Test
	public void testGetValue() {
		
		// Create a dice
		Dice dc = new Dice ();

		// default value
		assertEquals (dc.getValue,0);
		
		int value = dc.rollDice();
		
		assertEquals (dc.getValue,value);
				
	}

	@Test
	public void testResetDice() {
		
		// Create a dice
		Dice dc = new Dice ();
		
		dc.freezeDice();
		assertTrue (dc.isFrozen());

		dc.rollDice();
		assertNotSame (dc.getValue,0);

		dc.resetDice();
		assertFalse (dc.isFrozen());
		assertEquals (dc.getValue,0);
		
	}

	
	
	@Test
	public void testRollDice (){
				
		Dice dc = new Dice ();
		
		int value = dc.rollDice ();
		validateRollDice (value);
		
	}

	
	@Test
	public void testRollDice10000 (){
		
		Dice dc = new Dice ();
		
		for (int loop=0;10000>loop;loop++){
		
			int value = dc.rollDice ();
			validateRollDice (value);
						
		}
		
	}

	@Test(expected = IllegalStateException.class) 
	public void testRollDiceException (){
		
		Dice dc = new Dice ();
		
		int value = dc.rollDice ();
		
		validateRollDice (value);
	
		// FREEZE the dice
		
		dc.freezeDice();
		
		int value2 = dc.rollDice();
		
		// we should not get to this point
		fail ("Rolling of frozen dice possible, this should cause an exception");
		
	}
	
	
	
	
	
	
	
	
	
	private void validateRollDice(int value){
		
		int DICE_LOW = 1;
		int DICE_HIGH = 6;
		
		if (value>=DICE_LOW) assertTrue(true);
		else fail ("Value of the dice is to low");
		
		if (value<=DICE_HIGH) assertTrue (true);
		else fail ("Value of the dice is to high");
	
	}
	
}
