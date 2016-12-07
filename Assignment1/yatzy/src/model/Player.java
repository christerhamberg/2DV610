package model;

public class Player extends Score{
	
	protected String playerName = "";
	protected boolean playerActive = false;
	
	public Player (String myName) {
		
		playerName = myName;
		playerActive = false;
		
	}
	
	public void setName (String myName){
		playerName = myName;
	}
	
	public String getName (){
		return playerName;
	}
	
	public boolean isPlayerActive (){
		return playerActive;
	}
	
	public void setPlayerActive (){
		playerActive = true;
	}

	public void resetPlayerActive (){
		playerActive = false;
	}
	
}