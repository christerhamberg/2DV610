package model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;


import view.View;

public class TestMockito {
	
	// just a quick and dirty to add a when to return something when 
	// mockito is called
	
	@Test
	public void testMockito() {
		
		View myView = Mockito.mock(View.class);
		
		// state that an 'S' should be returned when the method is called
		when (myView.getKbInput()).thenReturn("S");
		
	    assertEquals(myView.getKbInput(), "S");
	
	}

	
	// just a quick and dirty to show that a method has been called
	@SuppressWarnings("deprecation")
	@Test
	public void testMockito2() {
		
        Player pl = Mockito.mock(Player.class);
	
        // check that method has never been called
        verify (pl,never()).setName("Kalle Anka");                                                                                                                                                                                                                                           
        
        // call the method
        pl.setName("Kalle Anka");
        
        // verify that the method was called with indicated parameter
        verify (pl).setName(Matchers.eq("Kalle Anka"));
        
        // verify that the method was called option 1
        
        verify(pl,times(1)).setName("");

        // verify that the method was called option 2
        
        verify(pl,atLeastOnce()).setName("");
        
        // verify that the method was called option 3
        
        verify(pl,atLeast(1)).setName("");
        
        pl.setName("Kalle Anka 2");
        pl.setName("Kalle Anka 3");
        pl.setName("Kalle Anka 4");

        verify(pl,atLeast(1)).setName("");        
                    
	}
	
	
	
}
