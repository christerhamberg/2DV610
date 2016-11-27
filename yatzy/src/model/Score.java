package model;

public class Score{
	
	protected int totalScore = 0;
	protected int totalBottomScore = 0;
	
	final int BONUS = 63;
	
	public Score (){

	}
	
	public int getTotalScore (){
		return totalScore;
	}
	
	public int getTotalBottomScore (){
		return totalBottomScore;
	}
	
	public boolean isBonus (){
		
		if (totalBottomScore>=BONUS) return true;
		else return false;
		
	}

}
