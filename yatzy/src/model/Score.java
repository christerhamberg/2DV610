package model;

import java.util.ArrayList;

import model.rules.RuleInterface;
import model.rules.RuleOnlyFives;
import model.rules.RuleOnlyFours;
import model.rules.RuleOnlyOnes;
import model.rules.RuleOnlySixes;
import model.rules.RuleOnlyThrees;
import model.rules.RuleOnlyTwos;

public class Score{
	
	protected int totalScore = 0;
	protected int totalBottomScore = 0;
	
	protected ArrayList <RuleInterface> rule = new ArrayList <RuleInterface> ();
	
	final int BONUS = 63;
	
	public Score (){
		
		buildNewRules ();

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
	
	private void buildNewRules (){
		rule.add(new RuleOnlyOnes ());
		rule.add(new RuleOnlyTwos ());
		rule.add(new RuleOnlyThrees ());
		rule.add(new RuleOnlyFours ());
		rule.add(new RuleOnlyFives ());
		rule.add(new RuleOnlySixes ());
	}
	
	
	// consider adding 
	public String getRuleDescription (int ruleVal){
		return rule.get(ruleVal).getRuleDescription();
	}

	public int validateResult (int ruleVal,int d1, int d2, int d3, int d4, int d5){
		
		int result = rule.get(ruleVal).validateResult(d1,d2,d3,d4,d5);
		
		if (ruleVal<=6) totalBottomScore = totalBottomScore + result;
		totalScore = totalScore + result;
		
		return result;
		
	}
	
	public int getResult (int ruleVal){
		return rule.get(ruleVal).getResult();
	}

	public void resetResult (int ruleVal){
		 rule.get(ruleVal).resetResult();
	}
		
}
