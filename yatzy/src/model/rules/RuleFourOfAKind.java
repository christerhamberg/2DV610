package model.rules;

public class RuleFourOfAKind implements RuleInterface{

	private String ruleDescription = "Four of a kind";
	private int result = 0;
	
	@Override
	public String getRuleDescription() {
		return ruleDescription;
	}

	@Override
	public int validateResult(int dice1, int dice2, int dice3, int dice4, int dice5) {

		int tempResult = 0;
		
		for (int loopMe=6;1<=loopMe;loopMe--){
			
			int cnt=0;
			if (dice1==loopMe) cnt++;
			if (dice2==loopMe) cnt++;
			if (dice3==loopMe) cnt++;
			if (dice4==loopMe) cnt++;
			if (dice5==loopMe) cnt++;
			
			if (cnt>=4){
				tempResult = 4*loopMe;
				break;
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
