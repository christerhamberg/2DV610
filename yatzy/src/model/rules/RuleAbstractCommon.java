package model.rules;

public abstract class RuleAbstractCommon {
	
	private String ruleDescription;
	protected int result = 0;
	
	RuleAbstractCommon (String desc){
		ruleDescription = desc;
	}
	
	public String getRuleDescription() {
		return ruleDescription;
	}

	public abstract int validateResult(int dice1, int dice2, int dice3, int dice4, int dice5);

	public int getResult() {
		return result;
	}

	public void resetResult() {
		result = 0;
	}

}
