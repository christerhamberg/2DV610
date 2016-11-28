package model.rules;

public class RuleOnlyThrees implements RuleInterface{

	private String ruleDescription = "Max number of 3s";
	private int result = 0;
	
	@Override
	public String getRuleDescription() {
		return ruleDescription;
	}

	@Override
	public int validateResult(int dice1, int dice2, int dice3, int dice4, int dice5) {

		int tempResult = 0;
		if (dice1 == 3) tempResult = tempResult + 3;
		if (dice2 == 3) tempResult = tempResult + 3;
		if (dice3 == 3) tempResult = tempResult + 3;
		if (dice4 == 3) tempResult = tempResult + 3;
		if (dice5 == 3) tempResult = tempResult + 3;

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
