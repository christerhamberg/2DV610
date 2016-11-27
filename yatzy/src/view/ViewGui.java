package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Dice;
import model.Player;
import model.StateMachine;

public class ViewGui extends JFrame{
	
	final int DICE_ROW = 2;
	final int DICE_FREEZE_CHECKBOX_ROW = 3;
	final int ROLL_BUTTON_ROW = 4;
	
	protected JPanel pane;
	protected GridBagConstraints c; 
	
	
	// Data of the Dices
	protected ArrayList <Dice> dice = new ArrayList <Dice> ();
	protected ArrayList <JLabel> jlDice = new ArrayList <JLabel> ();
	protected ArrayList <JCheckBox> jcFreezeDice = new ArrayList <JCheckBox> ();
	
	// Buttons
	protected JButton jbRollButton = new JButton();
	
	// Players
	protected ArrayList <Player> player = new ArrayList <Player> ();
	protected JTextField jtPlayer1 = new JTextField ("Player 1");
	protected JTextField jtPlayer2 = new JTextField ("Player 2");
	
	// State machine
	StateMachine state;

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
	
	    state = new StateMachine ();
		
		pane = new JPanel(new GridBagLayout());
		c = new GridBagConstraints();
		
		// add dices
		for (int loopMe=1;5>=loopMe;loopMe++) addDice (loopMe);

		// add Player 1 name field
		addComponent (jtPlayer1,1,ROLL_BUTTON_ROW,1,2,GridBagConstraints.FIRST_LINE_START);		
		addPlayer ("Player 1");
		
		
		// add Roll button
		jbRollButton.setText("New Game");
		addComponent (jbRollButton,3,ROLL_BUTTON_ROW,1,1,GridBagConstraints.CENTER);
		
		// add Player 2 name field
		addComponent (jtPlayer2,4,ROLL_BUTTON_ROW,1,2,GridBagConstraints.FIRST_LINE_START);		
		addPlayer ("Player 2");

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
		c.anchor = anchor;
		
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
		else if (object.getClass().equals(JCheckBox.class) == true){
			pane.add((JCheckBox) object, c);
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
	    
	    JCheckBox jcFreeze = new JCheckBox ();
	    jcFreezeDice.add(jcFreeze);
	    jcFreeze.setToolTipText("Freeze/Unfreeze Dice");
	    addComponent (jcFreeze,currentDice,DICE_FREEZE_CHECKBOX_ROW,1,1,GridBagConstraints.CENTER);
	    jcFreeze.addItemListener(new ItemListener() {
	        public void itemStateChanged(ItemEvent e) {
	        	
	        	if (state.canFreeze() == false);
	        	
	        	else{
	        		
	        	
	        		JCheckBox jc = (JCheckBox) e.getItem();
	        	
	        		// Check which dice it is
	        	
	        		for (int loopMe=0;jcFreezeDice.size()>loopMe;loopMe++){
	        			        		
	        			if (jcFreezeDice.get(loopMe).equals(jc) == true){
	        			
	        				Dice currentDice = dice.get(loopMe);
	        	
	        				if (jc.isSelected() == true) currentDice.freezeDice();
	        				else currentDice.unfreezeDice();
	        		
	        				break;
	        			}
	        			
	        		}
	        		
		        }
	   
	        }
	      });
		
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
	
	private void addPlayer (String playerName){
		
		Player pl = new Player ("");
		
		player.add (pl);
		pl.setName(playerName);
		
	}

}
