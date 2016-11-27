package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Dice;

public class ViewGui extends JFrame{
	
	final int DICE_ROW = 2;
	
	protected JPanel pane;
	protected GridBagConstraints c; 
	
	
	// Data of the Dices
	protected ArrayList <Dice> dice = new ArrayList <Dice> ();
	protected ArrayList <JLabel> jlDice = new ArrayList <JLabel> ();
	
	public ViewGui (String title){
		
		// Set title
				
		this.setTitle(title);
		
		// Default close option
	
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	    
	    // setup the board
	    
	    setupBoard ();
	    
	    // Repack all the components
	    	    
	    this.pack();
	    
	    // Show the frame
	    
	    this.setVisible(true);
		
	}
	
	public void setupBoard (){;
		
		pane = new JPanel(new GridBagLayout());
		c = new GridBagConstraints();
		
		for (int loopMe=1;5>=loopMe;loopMe++) addDice (loopMe);

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
	
	public void addDice (int currentDice) {
		
		// Create a Dice Object
		Dice d = new Dice ();
		dice.add(d);
		
		// Create a Jabel to store the icon
		Icon icon = new ImageIcon("source\\dice_6.png");
	    JLabel label = new JLabel(icon);
		jlDice.add(label);
	    addComponent (label,currentDice,DICE_ROW,1,1,GridBagConstraints.FIRST_LINE_START);		
		
	}
	
	public void updateDice (JLabel currentLabel, Dice currentDice){
		
		int value = currentDice.getValue();
		
		String iconPath = "";
		if (value == 1) iconPath = "source\\dice_1.png";
		else if (value == 2) iconPath = "source\\dice_2.png";
		else if (value == 3) iconPath = "source\\dice_3.png";
		else if (value == 4) iconPath = "source\\dice_4.png";
		else if (value == 5) iconPath = "source\\dice_5.png";
		else if (value == 6) iconPath = "source\\dice_6.png";
		
		Icon icon = new ImageIcon(iconPath);
		currentLabel.setIcon(icon);
		
	}
	
	

}
