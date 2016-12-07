package model.rules;

public class RuleOnlyTwos extends RuleAbstractCommon implements RuleInterface{

	public RuleOnlyTwos (){
		super ("Max number of 2s");
	}
	
	@Override
	public int validateResult(int dice1, int dice2, int dice3, int dice4, int dice5) {

		int tempResult = 0;
		if (dice1 == 2) tempResult = tempResult + 2;
		if (dice2 == 2) tempResult = tempResult + 2;
		if (dice3 == 2) tempResult = tempResult + 2;
		if (dice4 == 2) tempResult = tempResult + 2;
		if (dice5 == 2) tempResult = tempResult + 2;

		result = tempResult;
		return result;
		
	}
	
}
