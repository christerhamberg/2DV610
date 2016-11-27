package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ViewGui extends JFrame{
	
	protected JPanel pane;
	protected GridBagConstraints c; 
	
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
	
	public void setupBoard (){;
		
		pane = new JPanel(new GridBagLayout());
		c = new GridBagConstraints();
		

		this.add(pane);
		
	}
	
	

}
