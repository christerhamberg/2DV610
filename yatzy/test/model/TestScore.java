package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestScore {

	@Test
	public void testGetTotalScore() {
		
		// START OF THE GAME Score = 0
		Score sc = new Score ("Kalle");		
		assertEquals (sc.getTotalScore(),0);

	}

}
