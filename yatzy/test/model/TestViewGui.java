package model;

import static org.junit.Assert.*;

import org.junit.Test;

import view.ViewGui;

public class TestViewGui {
	
	@Test
	public void testViewGuiTitle() {
		
		ViewGui gui = new ViewGui ("Test1");
		assertEquals (gui.getTitle(),"Test1");

		ViewGui gui2 = new ViewGui ("Lets play a game of Yatzy!");
		assertEquals (gui2.getTitle(),"Lets play a game of Yatzy!");
		
	}

}
