package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDice {

	@Test
	public void testFreezeDiceIsFrozen() {
		
		Dice dc = new Dice ();
		
		assertFalse (dc.isFrozen());
		
		dc.freezeDice ();
		
		assertTrue (dc.isFrozen());
		
	}
	


}
