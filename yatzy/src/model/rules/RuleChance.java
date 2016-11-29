package model.rules;

public class RuleChance implements RuleInterface{
	
	private String ruleDescription = "Chance";
	private int result = 0;
	
	@Override
	public String getRuleDescription() {
		return ruleDescription;
	}

	@Override
	public int validateResult(int dice1, int dice2, int dice3, int dice4, int dice5) {

        result = dice1 + dice2 + dice3 + dice4 +dice5;

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
