package model.rules;

public class RuleOnlyFours extends RuleAbstractCommon implements RuleInterface{

	public RuleOnlyFours (){
		super ("Max number of 4s");
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

}
