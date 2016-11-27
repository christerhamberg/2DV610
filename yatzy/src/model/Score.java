package model;

public class Score extends Player{
	
	protected int totalScore = 0;
	
	public Score (String name){
		super (name);
	}
	
	public int getTotalScore (){
		return totalScore;
	}

}
