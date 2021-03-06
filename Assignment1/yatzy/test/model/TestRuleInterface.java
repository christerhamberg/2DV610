package model;

import static org.junit.Assert.*;

import org.junit.Test;

import model.rules.RuleFourOfAKind;
import model.rules.RuleInterface;
import model.rules.RuleOnePair;
import model.rules.RuleOnlyOnes;
import model.rules.RuleOnlyTwos;
import model.rules.RuleThreeOfAKind;
import model.rules.RuleTwoPairs;
import model.rules.RuleOnlyThrees;
import model.rules.RuleOnlyFours;
import model.rules.RuleOnlyFives;
import model.rules.RuleOnlySixes;
import model.rules.RuleSmallStraight;
import model.rules.RuleLargeStraight;
import model.rules.RuleFullHouse;
import model.rules.RuleChance;
import model.rules.RuleYatzy;



public class TestRuleInterface {

	@Test
	public void testRuleOnly1() {

		RuleInterface rule = new RuleOnlyOnes ();
		assertEquals (rule.getRuleDescription(),"Max number of 1s");

		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(1,2,3,4,5),1);
		assertEquals (rule.getResult(),1);

		rule.resetResult();
		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(2,1,3,4,5),1);
		assertEquals (rule.getResult(),1);
		rule.resetResult();
		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(1,1,1,1,1),5);
		assertEquals (rule.getResult(),5);
	
	}
	
	@Test
	public void testRuleOnly2() {

		RuleInterface rule = new RuleOnlyTwos ();
		assertEquals (rule.getRuleDescription(),"Max number of 2s");

		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(2,1,3,4,5),2);
		assertEquals (rule.getResult(),2);

		rule.resetResult();
		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(1,2,3,4,5),2);
		assertEquals (rule.getResult(),2);
		rule.resetResult();
		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(2,2,2,2,2),10);
		assertEquals (rule.getResult(),10);
	
	}
	
	@Test
	public void testRuleOnly3() {

		RuleInterface rule = new RuleOnlyThrees ();
		assertEquals (rule.getRuleDescription(),"Max number of 3s");

		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(3,1,2,4,5),3);
		assertEquals (rule.getResult(),3);

		rule.resetResult();
		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(1,2,3,4,5),3);
		assertEquals (rule.getResult(),3);
		rule.resetResult();
		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(3,3,3,3,3),15);
		assertEquals (rule.getResult(),15);
	
	}
	
	@Test
	public void testRuleOnly4() {

		RuleInterface rule = new RuleOnlyFours ();
		assertEquals (rule.getRuleDescription(),"Max number of 4s");

		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(3,1,2,4,5),4);
		assertEquals (rule.getResult(),4);

		rule.resetResult();
		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(4,2,3,1,5),4);
		assertEquals (rule.getResult(),4);
		rule.resetResult();
		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(4,4,4,4,4),20);
		assertEquals (rule.getResult(),20);
	
	}

	
	@Test
	public void testRuleOnly5() {

		RuleInterface rule = new RuleOnlyFives ();
		assertEquals (rule.getRuleDescription(),"Max number of 5s");

		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(3,1,2,4,5),5);
		assertEquals (rule.getResult(),5);

		rule.resetResult();
		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(5,2,3,1,6),5);
		assertEquals (rule.getResult(),5);
		rule.resetResult();
		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(5,5,5,5,5),25);
		assertEquals (rule.getResult(),25);
	
	}
	
	@Test
	public void testRuleOnly6() {

		RuleInterface rule = new RuleOnlySixes ();
		assertEquals (rule.getRuleDescription(),"Max number of 6s");

		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(3,1,2,4,6),6);
		assertEquals (rule.getResult(),6);

		rule.resetResult();
		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(6,2,3,1,2),6);
		assertEquals (rule.getResult(),6);
		rule.resetResult();
		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(6,6,6,6,6),30);
		assertEquals (rule.getResult(),30);
	
	}
	
	@Test
	public void testRuleOnePair() {

		RuleInterface rule = new RuleOnePair ();
		assertEquals (rule.getRuleDescription(),"One pair");

		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(1,1,2,4,6),2);
		assertEquals (rule.getResult(),2);

		rule.resetResult();
		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(6,2,3,6,2),12);
		assertEquals (rule.getResult(),12);
		rule.resetResult();
		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(6,6,5,5,6),12);
		assertEquals (rule.getResult(),12);
	
	}
	
	@Test
	public void testRuleTwoPairs() {

		RuleInterface rule = new RuleTwoPairs ();
		assertEquals (rule.getRuleDescription(),"Two pairs");

		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(1,1,2,4,6),0);
		assertEquals (rule.getResult(),0);

		rule.resetResult();
		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(6,2,3,6,2),16);
		assertEquals (rule.getResult(),16);
		rule.resetResult();
		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(6,6,5,6,6),24);
		assertEquals (rule.getResult(),24);
	
	}
	
	@Test
	public void testRuleThreeOfAKind() {

		RuleInterface rule = new RuleThreeOfAKind ();
		assertEquals (rule.getRuleDescription(),"Three of a kind");

		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(1,1,2,4,6),0);
		assertEquals (rule.getResult(),0);

		rule.resetResult();
		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(1,1,3,6,1),3);
		assertEquals (rule.getResult(),3);
		rule.resetResult();
		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(6,6,5,5,6),18);
		assertEquals (rule.getResult(),18);
	
	}
	
	@Test
	public void testRuleFourOfAKind() {

		RuleInterface rule = new RuleFourOfAKind ();
		assertEquals (rule.getRuleDescription(),"Four of a kind");

		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(1,1,2,4,6),0);
		assertEquals (rule.getResult(),0);

		rule.resetResult();
		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(1,1,1,6,1),4);
		assertEquals (rule.getResult(),4);
		rule.resetResult();
		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(6,6,5,6,6),24);
		assertEquals (rule.getResult(),24);
	
	}
	
	
	@Test
	public void testRuleSmallStraight() {

		RuleInterface rule = new RuleSmallStraight ();
		assertEquals (rule.getRuleDescription(),"Small Straight");

		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(1,2,3,4,5),15);
		assertEquals (rule.getResult(),15);

		rule.resetResult();
		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(1,1,1,6,1),0);
		assertEquals (rule.getResult(),0);
		rule.resetResult();
		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(5,2,3,1,4),15);
		assertEquals (rule.getResult(),15);
	
	}
	
	@Test
	public void testRuleLargeStraight() {

		RuleInterface rule = new RuleLargeStraight ();
		assertEquals (rule.getRuleDescription(),"Large Straight");

		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(6,2,3,4,5),20);
		assertEquals (rule.getResult(),20);

		rule.resetResult();
		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(1,1,1,6,1),0);
		assertEquals (rule.getResult(),0);
		rule.resetResult();
		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(5,2,3,6,4),20);
		assertEquals (rule.getResult(),20);
	
	}
	
	@Test
	public void testRuleFullHouse() {

		RuleInterface rule = new RuleFullHouse ();
		assertEquals (rule.getRuleDescription(),"Full House");

		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(1,2,2,2,1),8);
		assertEquals (rule.getResult(),8);

		rule.resetResult();
		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(1,1,1,6,1),0);
		assertEquals (rule.getResult(),0);
		rule.resetResult();
		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(5,5,5,2,2),19);
		assertEquals (rule.getResult(),19);
	
	}
	
	@Test
	public void testRuleChance() {

		RuleInterface rule = new RuleChance ();
		assertEquals (rule.getRuleDescription(),"Chance");

		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(1,2,2,2,1),8);
		assertEquals (rule.getResult(),8);

		rule.resetResult();
		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(1,1,1,6,1),10);
		assertEquals (rule.getResult(),10);
		rule.resetResult();
		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(5,5,5,2,2),19);
		assertEquals (rule.getResult(),19);
	
	}
	
	@Test
	public void testRuleYatzy() {

		RuleInterface rule = new RuleYatzy ();
		assertEquals (rule.getRuleDescription(),"Yatzy");

		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(2,2,2,2,2),50);
		assertEquals (rule.getResult(),50);

		rule.resetResult();
		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(1,1,1,6,1),0);
		assertEquals (rule.getResult(),0);
		rule.resetResult();
		assertEquals (rule.getResult(),0);
		
		assertEquals (rule.validateResult(5,5,5,5,5),50);
		assertEquals (rule.getResult(),50);
	
	}
	
	
}
