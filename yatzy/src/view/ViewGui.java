package view;

import javax.swing.JFrame;

public class ViewGui extends JFrame{
	
	public ViewGui (String title){
		
		// Set title
				
		this.setTitle(title);
		
		// Default close option
	
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	    
	    // Repack all the components
	    
	    this.pack();
	    
	    // Show the frame
	    
	    this.setVisible(true);
		
	}

}
