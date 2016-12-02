package model.rules;

public class RuleChance extends RuleAbstractCommon implements RuleInterface{
	
	public RuleChance(){
		super ("Chance");
	}

	@Override
	public int validateResult(int dice1, int dice2, int dice3, int dice4, int dice5) {

        result = dice1 + dice2 + dice3 + dice4 +dice5;

		return result;
		
	}

}
