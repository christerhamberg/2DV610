package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlayer {
	
	@Test
	public void testSetAndGetPlayerName() {
		
		Player pl1 = new Player ("Kalle Anka");
		
		assertEquals (pl1.getName(),"Kalle Anka");
		
		pl1.setName("Farbror Joakim");
		assertEquals (pl1.getName(),"Farbror Joakim");
		
		Player pl2 = new Player ("");
		assertEquals (pl2.getName(),"");

		pl2.setName("Kalle Anka");
		assertEquals (pl2.getName(),"Kalle Anka");

	}

	@Test
	public void testPlayerActive() {
		
		Player pl1 = new Player ("Kalle Anka");
		assertFalse (pl1.isPlayerActive());

		pl1.setPlayerActive();
		assertTrue (pl1.isPlayerActive());

		pl1.resetPlayerActive();
		assertFalse (pl1.isPlayerActive());

	}

	
}
