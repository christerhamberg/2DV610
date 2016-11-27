package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestScore {

	@Test
	public void testGetTotalScore() {
		
		// START OF THE GAME Score = 0
		Score sc = new Score ("Kalle");		
		assertEquals (sc.getTotalScore(),0);
		
		FakeScore fake1 = new FakeScore ("Kalle");
		fake1.setTotalScore (4);
		assertEquals (fake1.getTotalScore(),4);
		
	}

}

class FakeScore extends Score{

	public FakeScore(String name) {
		super(name);
	}
	
	public void setTotalScore (int value){
		totalScore = value;
	}
	
	
	
}
