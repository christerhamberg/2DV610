package model;

public interface RuleInterface {
	
	public String getRuleDescription ();
	public int validateResult (int dice1, int dice2, int dice3, int dice4, int dice5);
	public int getResult ();
	public void resetResult ();

}
