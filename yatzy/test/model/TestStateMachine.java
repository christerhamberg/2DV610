package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStateMachine {

	@Test
	public void testIsActive() {

		StateMachine mc = new StateMachine();
		assertFalse (mc.isActive());
		
	}
	
	@Test
	public void testGetStepRollState() {
		
		StateMachine mc = new StateMachine();
		assertFalse (mc.isActive());
		assertEquals (mc.getRollState(),0);
		mc.stepRollState();
		assertTrue (mc.isActive());
		assertEquals (mc.getRollState(),1);
		mc.stepRollState();
		assertEquals (mc.getRollState(),2);
		mc.stepRollState();
		assertEquals (mc.getRollState(),3);
		mc.stepRollState();
		assertEquals (mc.getRollState(),0);
		mc.stepRollState();
		assertEquals (mc.getRollState(),1);

	}
	
	@Test
	public void testResetStates() {

		StateMachine mc = new StateMachine();
		assertFalse (mc.isActive());
		mc.stepRollState();
		assertTrue (mc.isActive());
		assertEquals (mc.getRollState(),1);

		mc.resetStates();
		assertFalse (mc.isActive());
		assertEquals (mc.getRollState(),0);

	}
	
	@Test
	public void testCanFreeze() {

		StateMachine mc = new StateMachine();
		assertFalse (mc.isActive());
		assertFalse (mc.canFreeze());

		mc.stepRollState();
		assertTrue (mc.isActive());
		assertEquals (mc.getRollState(),1);
		assertFalse (mc.canFreeze());

		mc.stepRollState();
		assertTrue (mc.canFreeze());

		mc.stepRollState();
		assertTrue (mc.canFreeze());
		
		mc.stepRollState();
		assertFalse (mc.canFreeze());
		
		mc.stepRollState();
		assertFalse (mc.canFreeze());

		mc.resetStates();
		assertFalse (mc.isActive());
		assertEquals (mc.getRollState(),0);
		assertFalse (mc.canFreeze());

	}
	
	
}
