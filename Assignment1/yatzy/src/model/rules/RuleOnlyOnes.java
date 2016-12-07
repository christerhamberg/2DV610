package model.rules;

public class RuleOnlyOnes extends RuleAbstractCommon implements RuleInterface{
	
	public RuleOnlyOnes (){
		super ("Max number of 1s");
	}

	@Override
	public int validateResult(int dice1, int dice2, int dice3, int dice4, int dice5) {

		int tempResult = 0;
		if (dice1 == 1) tempResult = tempResult + 1;
		if (dice2 == 1) tempResult = tempResult + 1;
		if (dice3 == 1) tempResult = tempResult + 1;
		if (dice4 == 1) tempResult = tempResult + 1;
		if (dice5 == 1) tempResult = tempResult + 1;

		result = tempResult;
		return result;
		
	}

}
