package model.rules;

public class RuleOnlyFives extends RuleAbstractCommon implements RuleInterface{

	public RuleOnlyFives (){
		super ("Max number of 5s");
	}
	
	@Override
	public int validateResult(int dice1, int dice2, int dice3, int dice4, int dice5) {

		int tempResult = 0;
		if (dice1 == 5) tempResult = tempResult + 5;
		if (dice2 == 5) tempResult = tempResult + 5;
		if (dice3 == 5) tempResult = tempResult + 5;
		if (dice4 == 5) tempResult = tempResult + 5;
		if (dice5 == 5) tempResult = tempResult + 5;

		result = tempResult;
		return result;
		
	}

}
