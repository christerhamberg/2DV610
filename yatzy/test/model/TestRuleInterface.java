package model;

import static org.junit.Assert.*;

import org.junit.Test;

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

}
