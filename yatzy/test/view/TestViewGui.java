package view;

import static org.junit.Assert.*;

import java.awt.GridBagConstraints;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.junit.Test;

import view.ViewGui;

public class TestViewGui {
	
	@Test
	public void testViewGuiTitle() {
		
		ViewGui gui = new ViewGui ("Test1");
		assertEquals (gui.getTitle(),"Test1");
		assertNull (gui.pane);
		assertNull (gui.c);

		ViewGui gui2 = new ViewGui ("Lets play a game of Yatzy!");
		assertEquals (gui2.getTitle(),"Lets play a game of Yatzy!");
		assertNull (gui2.pane);
		assertNull (gui2.c);

	}
	
	@Test
	public void testSetupBoard (){
		
		ViewGui gui = new ViewGui ("Test1");
		assertNull (gui.pane);
		assertNull (gui.c);
		gui.setupBoard();
		assertNotNull (gui.pane);
		assertNotNull (gui.c);

	}
	
	
	@Test
	public void testAddComponent (){
		
		// format should be object, xpos, ypos, height, width, and anchor
		
		ViewGui gui = new ViewGui ("Test1");
		gui.setupBoard();

		// Labels
		JLabel jl1 = new JLabel();
		addComponent (jl1,0,0,1,1,GridBagConstraints.CENTER);
		
		JLabel jl2 = new JLabel();
		addComponent (jl2,1,0,1,1,GridBagConstraints.CENTER);
		
		JLabel jl3 = new JLabel();
		addComponent (jl3,2,0,1,1,GridBagConstraints.CENTER);
		
		// Buttons
		JButton jb1 = new JButton();
		addComponent (jb1,0,1,1,1,GridBagConstraints.CENTER);
		
		JButton jb2 = new JButton();
		addComponent (jb2,1,1,1,1,GridBagConstraints.CENTER);
		
		JButton jb3 = new JButton();
		addComponent (jb3,2,1,1,1,GridBagConstraints.CENTER);
		
		// TextFields
		JTextFields jt1 = new JTextFields();
		addComponent (jt1,0,2,1,1,GridBagConstraints.CENTER);
		
		JTextFields jt2 = new JTextFields();
		addComponent (jt2,1,2,1,1,GridBagConstraints.CENTER);
		
		JTextFields jt3 = new JTextField();
		addComponent (jt3,2,2,1,1,GridBagConstraints.CENTER);
		
		
		// CheckBoxes
		JCheckBox jc1 = new JCheckBox();
		addComponent (jc1,0,3,1,1,GridBagConstraints.CENTER);
		
		JCheckBox jc2 = new JCheckBox();
		addComponent (jc2,1,3,1,1,GridBagConstraints.CENTER);
		
		JCheckBox jc3 = new JCheckBox();
		addComponent (jc3,2,3,1,1,GridBagConstraints.CENTER);
		
	}

	@Test
	public void testAddDice (){
				
		
	}
	
	@Test
	public void testUpdateDice (){
			
		
	}

}

