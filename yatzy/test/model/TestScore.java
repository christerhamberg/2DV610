package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestScore {

	@Test
	public void testGetTotalScore() {
		
		// START OF THE GAME Score = 0
		Score sc = new Score ();		
		assertEquals (sc.getTotalScore(),0);
		
		FakeScore fake1 = new FakeScore ();
		fake1.setTotalScore (4);
		assertEquals (fake1.getTotalScore(),4);
		
		fake1.setTotalScore (12);
		assertEquals (fake1.getTotalScore(),12);
		
	}
	
	@Test
	public void testGetBottomTotalScore() {
		
		// START OF THE GAME Score = 0
		Score sc = new Score ();		
		assertEquals (sc.getTotalBottomScore(),0);
		
		FakeScore fake1 = new FakeScore ();
		fake1.setBottomTotalScore (4);
		assertEquals (fake1.getTotalBottomScore(),4);
		
		fake1.setBottomTotalScore (12);
		assertEquals (fake1.getTotalBottomScore(),12);
		
	}


}

class FakeScore extends Score{

	public FakeScore() {

	}
	
	public void setTotalScore (int value){
		totalScore = value;
	}
	
	public void setBottomTotalScore (int value){
		totalBottomScore = value;
	}
	
}
