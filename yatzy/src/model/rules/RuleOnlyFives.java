package model.rules;

public class RuleOnlyFives implements RuleInterface{

	private String ruleDescription = "Max number of 5s";
	private int result = 0;
	
	@Override
	public String getRuleDescription() {
		return ruleDescription;
	}

	@Override
	public int validateResult(int dice1, int dice2, int dice3, int dice4, int dice5) {

		int tempResult = 0;
		if (dice1 == 5) tempResult = tempResult + 5;
		if (dice2 == 5) tempResult = tempResult + 5;
		if (dice3 == 5) tempResult = tempResult + 5;
		if (dice4 == 5) tempResult = tempResult + 5;
		if (dice5 == 5) tempResult = tempResult + 5;

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
