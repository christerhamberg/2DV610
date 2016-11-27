package model;

public class Score extends Player{
	
	private int totalScore = 0;
	
	public Score (String name){
		super (name);
	}
	
	public int getTotalScore (){
		return totalScore;
	}

}
