package view;

import static org.junit.Assert.*;

import java.awt.GridBagConstraints;

import javax.swing.JLabel;

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

		JLabel jl1 = new JLabel();
		addComponent (jl1,0,0,1,1,GridBagConstraints.CENTER);
		
		JLabel jl2 = new JLabel();
		addComponent (jl2,1,0,1,1,GridBagConstraints.CENTER);
		
		JLabel jl3 = new JLabel();
		addComponent (jl3,0,1,1,1,GridBagConstraints.CENTER);
		
	}

	@Test
	public void testAddDice (){
				
		
	}
	
	@Test
	public void testUpdateDice (){
			
		
	}

}

