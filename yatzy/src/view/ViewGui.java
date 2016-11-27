package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
	
	public void addComponent (Object object, int x, int y,int height, int width, int anchor){
		
		c.gridx = x;   
		c.gridy = y;
		c.gridheight = height;
		c.gridwidth = width;
		c.fill = GridBagConstraints.BOTH;
		c.ipadx = 0;
		c.ipady = 0;
		
		c.insets = new Insets(2, 5, 5, 2); // insets BOTTOM, LEFT, RIGHT, TOP	
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		
		// c.weightx
		// c.weighty
		
		// Object = JLabel
		if (object.getClass().equals(JLabel.class) == true){
			pane.add((JLabel) object, c);
		}
		// Object = JButton
		else if (object.getClass().equals(JButton.class) == true){
			pane.add((JButton) object, c);
		}	
		// Object = JTextField
		else if (object.getClass().equals(JTextField.class) == true){
			pane.add((JTextField) object, c);
		}	
		// Object = JCheckBox
		else if (object.getClass().equals(JTextField.class) == true){
			pane.add((JTextField) object, c);
		}	
			
	}
	
	

}
