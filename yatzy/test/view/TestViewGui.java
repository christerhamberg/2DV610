package view;

import static org.junit.Assert.*;

import java.awt.GridBagConstraints;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.junit.Test;

import model.Dice;
import view.ViewGui;

public class TestViewGui {
	
	@Test
	// TEST CASE SHOULD BE REMOVED NOW
	public void testViewGuiTitle() {
		
		ViewGui gui = new ViewGui ("Test1");
		assertEquals (gui.getTitle(),"Test1");
		assertNotNull (gui.pane);
		assertNotNull (gui.c);

		ViewGui gui2 = new ViewGui ("Lets play a game of Yatzy!");
		assertEquals (gui2.getTitle(),"Lets play a game of Yatzy!");
		assertNotNull (gui2.pane);
		assertNotNull (gui2.c);

	}
	
	@Test
	// TEST CASE SHOULD BE REMOVED NOW
	public void testSetupBoard (){
		
		ViewGui gui = new ViewGui ("Test1");
		assertNotNull (gui.pane);
		assertNotNull (gui.c);
		gui.setupBoard();
		assertNotNull (gui.pane);
		assertNotNull (gui.c);

	}
	
	
	@Test
	public void testAddComponent (){
		
		// format should be object, xpos, ypos, height, width, and anchor
		
		ViewGui gui = new ViewGui ("Test1");

		// Labels
		JLabel jl1 = new JLabel();
		gui.addComponent (jl1,0,0,1,1,GridBagConstraints.CENTER);
		
		JLabel jl2 = new JLabel();
		gui.addComponent (jl2,1,0,1,1,GridBagConstraints.CENTER);
		
		JLabel jl3 = new JLabel();
		gui.addComponent (jl3,2,0,1,1,GridBagConstraints.CENTER);
		
		// Buttons
		JButton jb1 = new JButton();
		gui.addComponent (jb1,0,1,1,1,GridBagConstraints.CENTER);
		
		JButton jb2 = new JButton();
		gui.addComponent (jb2,1,1,1,1,GridBagConstraints.CENTER);
		
		JButton jb3 = new JButton();
		gui.addComponent (jb3,2,1,1,1,GridBagConstraints.CENTER);
		
		// TextFields
		JTextField jt1 = new JTextField();
		gui.addComponent (jt1,0,2,1,1,GridBagConstraints.CENTER);
		
		JTextField jt2 = new JTextField();
		gui.addComponent (jt2,1,2,1,1,GridBagConstraints.CENTER);
		
		JTextField jt3 = new JTextField();
		gui.addComponent (jt3,2,2,1,1,GridBagConstraints.CENTER);
		
		
		// CheckBoxes
		JCheckBox jc1 = new JCheckBox();
		gui.addComponent (jc1,0,3,1,1,GridBagConstraints.CENTER);
		
		JCheckBox jc2 = new JCheckBox();
		gui.addComponent (jc2,1,3,1,1,GridBagConstraints.CENTER);
		
		JCheckBox jc3 = new JCheckBox();
		gui.addComponent (jc3,2,3,1,1,GridBagConstraints.CENTER);
		
	}

	@Test
	public void testAddDice (){
		
		ViewGui gui = new ViewGui ("Test1");

		for (int loopMe = 0;5>loopMe;loopMe++ ){
			assertNotNull (gui.jlDice.get(loopMe));
		}
		
		// add a dice
		gui.addDice (0);
		assertNotNull (gui.jlDice.get(5));

		// add 4 more dices
		for (int loopMe = 1;5>=loopMe;loopMe++ ){
			gui.addDice(loopMe);
			assertNotNull (gui.jlDice.get(5+loopMe));
		}
		
	}
	
	@Test
	public void testUpdateDice (){
		
		ViewGui gui = new ViewGui ("Test1");
				
		gui.addDice (0);
		assertNotNull (gui.jlDice.get(0));		
		
		JLabel jl = gui.jlDice.get(0);
		Dice dc = gui.dice.get(0);	
		
		int value = dc.rollDice();
		String iconPath = "source\\dice_" +value +".png";
		
		gui.updateDice (jl,dc);
		assertEquals (""+jl.getIcon(),iconPath);
		
		for (int loopMe=0;100>loopMe;loopMe++){
		    value = dc.rollDice();
		    iconPath = "source\\dice_" +value +".png";
		    
			gui.updateDice (jl,dc);
			assertEquals (""+jl.getIcon(),iconPath);
		}

	}
	
	@Test
	public void testCheckBoxUpdate (){
				
		ViewGui gui = new ViewGui ("Test1");
		for (int loopMe = 0;5>loopMe;loopMe++ ){
			assertNotNull (gui.jcFreezeDice.get(loopMe));
		}
		
	}

	@Test
	public void testRollButton (){
		
		ViewGui gui = new ViewGui ("Test1");
		assertNotNull (gui.jbRollButton);	
		
		assertEquals (gui.jbRollButton.getText(),"New Game");
		
	}
	
	@Test
	public void testPlayerTextField (){
		
		ViewGui gui = new ViewGui ("Test1");
		assertNotNull (gui.jtPlayer1);	
		assertNotNull (gui.jtPlayer2);	
		
		assertEquals (gui.jtPlayer1.getTextField(),"Player1");
		assertEquals (gui.jtPlayer2.getTextField(),"Player2");

	}
	
}



