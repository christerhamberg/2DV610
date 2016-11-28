package model.rules;

public class RuleTwoPairs implements RuleInterface{

	private String ruleDescription = "Two pairs";
	private int result = 0;
	
	@Override
	public String getRuleDescription() {
		return ruleDescription;
	}

	@Override
	public int validateResult(int dice1, int dice2, int dice3, int dice4, int dice5) {

		int tempResult = 0;
		
		int pairs = 0;
		for (int loopMe=6;1<=loopMe;loopMe--){
			
			int cnt=0;
			if (dice1==loopMe) cnt++;
			if (dice2==loopMe) cnt++;
			if (dice3==loopMe) cnt++;
			if (dice4==loopMe) cnt++;
			if (dice5==loopMe) cnt++;
			
			if (cnt>=2){
			    pairs = pairs +1;
				tempResult = tempResult + 2*loopMe;
				
				if (cnt == 4){
					pairs = 2;
					tempResult = tempResult + 2*loopMe;
					break;
				}
				if (pairs == 2) break;

			}

		}
		
		if (pairs != 2) tempResult = 0;
		
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
