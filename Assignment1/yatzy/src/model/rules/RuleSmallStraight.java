package model.rules;

public class RuleSmallStraight extends RuleAbstractCommon implements RuleInterface{

	private final int FIXED_SCORE = 15;
	
	public RuleSmallStraight (){
		super ("Small Straight");
	}

	@Override
	public int validateResult(int dice1, int dice2, int dice3, int dice4, int dice5) {

		boolean diceFound[] = {false,false,false,false,false,false};
		
		int tempResult = 0;
		
		for (int loopMe=1;6>=loopMe;loopMe++){
			
			if (dice1 == loopMe) diceFound[loopMe-1] = true;
			if (dice2 == loopMe) diceFound[loopMe-1] = true;
			if (dice3 == loopMe) diceFound[loopMe-1] = true;
			if (dice4 == loopMe) diceFound[loopMe-1] = true;
			if (dice5 == loopMe) diceFound[loopMe-1] = true;

		}
		
		if (diceFound[0] == true){
			if (diceFound[1] == true){
				if (diceFound[2] == true){
					if (diceFound[3] == true){
						if (diceFound[4] == true){
							tempResult = FIXED_SCORE;
						}
					}
				}
			}

		}
		
		result = tempResult;
		return result;
		
	}
	
}
