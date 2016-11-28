package model.rules;

public class RuleOnlySixes implements RuleInterface{

	private String ruleDescription = "Max number of 6s";
	private int result = 0;
	
	@Override
	public String getRuleDescription() {
		return ruleDescription;
	}

	@Override
	public int validateResult(int dice1, int dice2, int dice3, int dice4, int dice5) {

		int tempResult = 0;
		if (dice1 == 6) tempResult = tempResult + 6;
		if (dice2 == 6) tempResult = tempResult + 6;
		if (dice3 == 6) tempResult = tempResult + 6;
		if (dice4 == 6) tempResult = tempResult + 6;
		if (dice5 == 6) tempResult = tempResult + 6;

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
