package model;

public class StateMachine {
	
	// States 0 = New Game / Game finalized
	//        1 = Roll dice first time
	//        2 = Roll dice second time
	//        3 = Roll dice third time
	
	final int MAX_STATE = 3;
	
	private boolean active = false;
	private int state = 0;
	
	public StateMachine (){
		active = false;
		state = 0;
	}

	public void stepRollState (){
		
		active = true;
		
		if (state == MAX_STATE) state = 1;
		else state++;
		
	}
	
	public int getRollState (){
		return state;
	}

	public boolean isActive(){
		return active;
	}
	
	public void resetStates (){
		active = false;
		state = 0;
	}
	
}
