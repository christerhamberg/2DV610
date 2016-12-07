package model.rules;

public class RuleOnlySixes extends RuleAbstractCommon implements RuleInterface{

	public RuleOnlySixes (){
		super("Max number of 6s");
	}
	
	@Override
	public int validateResult(int dice1, int dice2, int dice3, int dice4, int dice5) {

		int tempResult = 0;
		if (dice1 == 6) tempResult = tempResult + 6;
		if (dice2 == 6) tempResult = tempResult + 6;
		if (dice3 == 6) tempResult = tempResult + 6;
		if (dice4 == 6) tempResult = tempResult + 6;
		if (dice5 == 6) tempResult = tempResult + 6;

		result = tempResult;
		return result;
		
	}

}
