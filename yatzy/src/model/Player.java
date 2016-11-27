package model;

public class Player extends Score{
	
	protected String playerName = "";
	
	public Player (String myName) {
		
		playerName = myName;
		
	}
	
	public void setName (String myName){
		playerName = myName;
	}
	
	public String getName (){
		return playerName;
	}

}