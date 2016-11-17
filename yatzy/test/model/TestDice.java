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
	


}
