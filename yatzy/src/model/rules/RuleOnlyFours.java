package model.rules;

public class RuleOnlyFours implements RuleInterface{

	private String ruleDescription = "Max number of 4s";
	private int result = 0;
	
	@Override
	public String getRuleDescription() {
		return ruleDescription;
	}

	@Override
	public int validateResult(int dice1, int dice2, int dice3, int dice4, int dice5) {

		int tempResult = 0;
		if (dice1 == 4) tempResult = tempResult + 4;
		if (dice2 == 4) tempResult = tempResult + 4;
		if (dice3 == 4) tempResult = tempResult + 4;
		if (dice4 == 4) tempResult = tempResult + 4;
		if (dice5 == 4) tempResult = tempResult + 4;

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
