package model.rules;

public class RuleFullHouse extends RuleAbstractCommon implements RuleInterface{
	
	public RuleFullHouse(){
		super("Full House");
	}

	@Override
	public int validateResult(int dice1, int dice2, int dice3, int dice4, int dice5) {

		int diceFound[] = {0,0,0,0,0,0};
		boolean pairFound = false;
		int pairValue = 0;
		boolean trissFound = false;
		int trissValue = 0;
		
		int tempResult = 0;
		
		for (int loopMe=1;6>=loopMe;loopMe++){
			
			if (dice1 == loopMe) diceFound[loopMe-1] = diceFound[loopMe-1] +1;
			if (dice2 == loopMe) diceFound[loopMe-1] = diceFound[loopMe-1] +1;;
			if (dice3 == loopMe) diceFound[loopMe-1] = diceFound[loopMe-1] +1;;
			if (dice4 == loopMe) diceFound[loopMe-1] = diceFound[loopMe-1] +1;;
			if (dice5 == loopMe) diceFound[loopMe-1] = diceFound[loopMe-1] +1;;

		}
		
		for (int loopMe=0; diceFound.length>loopMe;loopMe++){
			
			if (diceFound[loopMe] == 2) {
				pairFound = true;
				pairValue = loopMe+1;
			}
			
			if (diceFound[loopMe] == 3) {
				trissFound = true;
				trissValue = loopMe+1;
			}
			
		}
		
		if (pairFound == true){
			if (trissFound == true){
				tempResult = pairValue *2 + trissValue*3;
			}
		}
		
		result = tempResult;
		return result;
		
	}

}
