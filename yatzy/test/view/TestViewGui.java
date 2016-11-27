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
		
	}

	@Test
	public void testAddDice (){
		
	}
	
	@Test
	public void testUpdateDice (){
			
		
	}

}

