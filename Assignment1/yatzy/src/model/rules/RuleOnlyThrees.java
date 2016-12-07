package model.rules;

public class RuleOnlyThrees extends RuleAbstractCommon implements RuleInterface{
	
	public RuleOnlyThrees (){
		super ("Max number of 3s");
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

}
