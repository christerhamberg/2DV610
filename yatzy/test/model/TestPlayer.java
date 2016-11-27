package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlayer {
	
	@Test
	public void setAndGetPlayerName() {
		
		Player pl1 = new Player ("Kalle Anka");
		
		assertEquals (pl1.getName(),"Kalle Anka");
		
		pl1.setName("Farbror Joakim");
		assertEquals (pl1.getName(),"Farbror Joakim");
		
		Player pl2 = new Player ("");
		assertEquals (pl2.getName(),"");

		pl2.setName("Kalle Anka");
		assertEquals (pl1.getName(),"Kalle Anka");

	}

}
