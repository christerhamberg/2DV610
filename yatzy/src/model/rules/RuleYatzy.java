package model.rules;

public class RuleYatzy implements RuleInterface{
	
	private final int FIXED_SCORE = 50;
	
	private String ruleDescription = "Yatzy";
	private int result = 0;
	
	@Override
	public String getRuleDescription() {
		return ruleDescription;
	}

	@Override
	public int validateResult(int dice1, int dice2, int dice3, int dice4, int dice5) {

		int tempResult = 0;
		
		if (dice1 == dice2){
			if (dice1 == dice3){
				if (dice1 == dice4){
					if (dice1 == dice5){
						tempResult = FIXED_SCORE;
					}
				}
			}
		}

		
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
