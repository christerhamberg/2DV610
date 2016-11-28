package model.rules;

public class RuleOnlyOnes implements RuleInterface{

	private String ruleDescription = "Max number of 1s";
	private int result = 0;
	
	@Override
	public String getRuleDescription() {
		return ruleDescription;
	}

	@Override
	public int validateResult(int dice1, int dice2, int dice3, int dice4, int dice5) {

		int tempResult = 0;
		if (dice1 == 1) tempResult = tempResult + 1;
		if (dice2 == 1) tempResult = tempResult + 1;
		if (dice3 == 1) tempResult = tempResult + 1;
		if (dice4 == 1) tempResult = tempResult + 1;
		if (dice5 == 1) tempResult = tempResult + 1;

		result = tempResult;
		return result;
		
	}

	@Override
	public int getResult() {
		return result;
	}

	@Override
	public void resetResult() {
		result = 0;
	}

}
