package model;

public class StateMachine {
	
	// States 0 = New Game / Game finalized
	//        1 = Start Roll dice first time
	//        2 = Rolled dice first time
	//        3 = Rolled dice second time
	//        4 = Rolled dice third time

	final int MAX_STATE = 4;
	
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
	
	public boolean canFreeze (){
		if (active == false) return false;
		if (state == 0) return false;
		else if (state == 1) return false;
		else if (state == 2) return true;
		else if (state == 3) return true;
		else if (state == 4) return false;
		else return false;
	}
	
}
