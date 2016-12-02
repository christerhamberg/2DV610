package model.rules;

public class RuleThreeOfAKind extends RuleAbstractCommon implements RuleInterface{

	public RuleThreeOfAKind (){
		super ("Three of a kind");
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
			
			if (cnt>=3){
				tempResult = 3*loopMe;
				break;
			}

		}
		
		result = tempResult;
		return result;
		
	}

}
