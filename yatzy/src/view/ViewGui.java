package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	
	final int INFO_ROW = 1;
	final int DICE_ROW = 2;
	final int DICE_FREEZE_CHECKBOX_ROW = 3;
	final int ROLL_BUTTON_ROW = 4;
	final int RULES_START_ROW = 6;
	final int RULES_SUM1_ROW= 12;
	final int RULES_BONUS_ROW= 13;
	final int RULES_START_ROW2 = 14;
	final int RULES_TOTAL_ROW = 30;

	
	final int QUIT_ROW = 30;

	protected JPanel pane;
	protected GridBagConstraints c; 
	
	
	// Data of the Dices
	protected ArrayList <Dice> dice = new ArrayList <Dice> ();
	protected ArrayList <JLabel> jlDice = new ArrayList <JLabel> ();
	protected ArrayList <JCheckBox> jcFreezeDice = new ArrayList <JCheckBox> ();
	
	// Buttons
	protected JButton jbRollButton = new JButton();
	protected JButton jbQuit = new JButton();
	
	// Players
	protected ArrayList <Player> player = new ArrayList <Player> ();
	protected JTextField jtPlayer1 = new JTextField ("Player 1");
	protected JTextField jtPlayer2 = new JTextField ("Player 2");
	
	// State machine
	protected StateMachine state;
	protected int currentPlayer = 0;
	
	// Info TextField
	protected JTextField jtInfo = new JTextField();
	protected JTextField jtFreezeUnFreeze = new JTextField("Freeze/UnFreeze Dice");

	// Info Rule TextField
	protected ArrayList <JTextField> jtDescription1 = new ArrayList <JTextField> ();
	protected ArrayList <JTextField> jtDescription2 = new ArrayList <JTextField> ();
	protected ArrayList <JTextField> jtScorePl1 = new ArrayList <JTextField> ();
	protected ArrayList <JTextField> jtScorePl2 = new ArrayList <JTextField> ();

	protected JTextField jtSum1Pl1a = new JTextField ();
	protected JTextField jtSum1Pl2a = new JTextField ();
	protected JTextField jtSum1Pl1b = new JTextField ();
	protected JTextField jtSum1Pl2b = new JTextField ();
	protected JTextField jtBonusPl1a = new JTextField ();
	protected JTextField jtBonusPl2a = new JTextField ();
	protected JTextField jtBonusPl1b = new JTextField ();
	protected JTextField jtBonusPl2b = new JTextField ();
	
	protected JTextField jtTotalSum1Pl1a = new JTextField ();
	protected JTextField jtTotalSum1Pl2a = new JTextField ();
	protected JTextField jtTotalSum1Pl1b = new JTextField ();
	protected JTextField jtTotalSum1Pl2b = new JTextField ();
	
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
		
		jtInfo.setText("Shall we play a Game of Yatzy?");
		addComponent (jtInfo,1,INFO_ROW,1,5,GridBagConstraints.FIRST_LINE_START);
		
		// add dices
		for (int loopMe=1;5>=loopMe;loopMe++) addDice (loopMe);
		
		// add info text about the row
		addComponent (jtFreezeUnFreeze,0,DICE_FREEZE_CHECKBOX_ROW,1,1,GridBagConstraints.FIRST_LINE_START);		
		jtFreezeUnFreeze.setEditable(false);
				
		// add Player 1 name field
		addComponent (jtPlayer1,1,ROLL_BUTTON_ROW,1,2,GridBagConstraints.FIRST_LINE_START);		
		addPlayer ("Player 1");
		
		
		// add Roll button
		jbRollButton.setText("New Game");
		addComponent (jbRollButton,3,ROLL_BUTTON_ROW,1,1,GridBagConstraints.CENTER);
		addRollButton ();
		
		
		// add Player 2 name field
		addComponent (jtPlayer2,4,ROLL_BUTTON_ROW,1,2,GridBagConstraints.FIRST_LINE_START);		
		addPlayer ("Player 2");
		
		// Add all the ruleComponents
		addFirstSetOfRules ();
		addFirstSetSum ();
		addBonus ();
		addTotalSum ();

        
        // Add quit button
        jbQuit.setText("Quit");
		addComponent (jbQuit,3,QUIT_ROW,1,1,GridBagConstraints.CENTER);        
        addQuitButton ();


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

	        	JCheckBox jc = (JCheckBox) e.getItem();

	        	if (state.canFreeze() == false){
	        		jc.setSelected(false);
	        	}
	        	else{
	        			        	
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
	
	private void addRollButton (){
		
		jbRollButton.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    rollButtonPressed();
			  } 
			} );
			
	}	
	
	protected void rollButtonPressed (){
				
		if (state.isActive() == false) currentPlayer = 0;
		
		int currentState = state.getRollState ();
		
		state.stepRollState();
		
		if (currentState == 0){
			
			jtInfo.setText("Turn " + (state.getTurn()+1) +" for Player " +(currentPlayer+1) +" First Roll");
			jbRollButton.setText("First Roll");
			
			// clear All freeze check boxes.
			for (int loopMe=0;jcFreezeDice.size()>loopMe;loopMe++){
				jcFreezeDice.get(loopMe).setSelected(false);
				
				Dice currentDice = dice.get(loopMe);
				currentDice.unfreezeDice();
		
			}
			
		}
		if (currentState == 1){
			
			rollDices ();
			jtInfo.setText("Turn " + (state.getTurn()+1) +" for Player " +(currentPlayer+1) +" Second Roll");
			jbRollButton.setText("Second Roll");

		}
		if (currentState == 2){
			
			rollDices ();
			jtInfo.setText("Turn " + (state.getTurn()+1) +" for Player " +(currentPlayer+1) +" Third Roll");
			jbRollButton.setText("Third Roll");

		}
		if (currentState == 3){
			
			rollDices ();
						
			player.get(currentPlayer).validateResult(state.getTurn(), dice.get(0).getValue(), dice.get(1).getValue(), dice.get(2).getValue(), dice.get(3).getValue(), dice.get(4).getValue());

			if (currentPlayer == 0){
				
				jtScorePl1.get(state.getTurn()).setText(""+player.get(currentPlayer).getResult(state.getTurn()));
				
				if (state.getTurn()<6) jtSum1Pl1b.setText(""+player.get(currentPlayer).getTotalBottomScore());
				else if (state.getTurn() == 6){
					if (player.get(currentPlayer).isBonus () == true){
						jtBonusPl1b.setText("50");
					}
					else jtBonusPl1b.setText("0");
				}

				jtTotalSum1Pl1b.setText(""+ +player.get(currentPlayer).getTotalScore());
				
				currentPlayer = 1;

			}
			else {

				jtScorePl2.get(state.getTurn()).setText(""+player.get(currentPlayer).getResult(state.getTurn()));
				
				if (state.getTurn()<6) jtSum1Pl2b.setText(""+player.get(currentPlayer).getTotalBottomScore());
				else if (state.getTurn() == 6){
					if (player.get(currentPlayer).isBonus () == true){
						jtBonusPl2b.setText("50");
					}
					else jtBonusPl2b.setText("0");
				}
				
				jtTotalSum1Pl2b.setText(""+ +player.get(currentPlayer).getTotalScore());

				
				currentPlayer = 0;
				state.stepTurn();

			}
			
			rollButtonPressed();
			
		}
		
	}
	
	private void rollDices (){
				
		for (int loopMe=0;5>loopMe;loopMe++){
			
			JCheckBox currentCheckBoxStatus = jcFreezeDice.get(loopMe);
			
			if (currentCheckBoxStatus.isSelected()==false){
				
				Dice currentDice = dice.get(loopMe);
				currentDice.rollDice();
				JLabel currentLabel = jlDice.get(loopMe);
				
				updateDice (currentLabel,currentDice);

			}
						
		}
				
	}
	
	private void addQuitButton (){
		jbQuit.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    System.exit (0);
			  } 
			} );
	}
	
	private void addFirstSetOfRules (){
		
		// 1s
		addRuleDescriptionToBoard (0);
		
		// 2s
		addRuleDescriptionToBoard (1);
		
		// 3s
		addRuleDescriptionToBoard (2);		
		
		// 4s
		addRuleDescriptionToBoard (3);
		
		// 5s
		addRuleDescriptionToBoard (4);	
		
		// 6s
		addRuleDescriptionToBoard (5);	
		
		// Sum

		// Bonus

		// One pair
		addRuleDescriptionToBoard2 (6);	

		// Two pairs
		addRuleDescriptionToBoard2 (7);			
		
		// Three of a kind
		addRuleDescriptionToBoard2 (8);	

		// Four of a kind
		addRuleDescriptionToBoard2 (9);	

		// Small Straight

		// Large Straight

		// Full House

		// Chance

		// Yatzy

		// Total

		
	}
	
	private void addFirstSetSum (){

		jtSum1Pl1a.setText("Sum");
		jtSum1Pl1a.setEditable(false);
		addComponent (jtSum1Pl1a,0,(RULES_SUM1_ROW),1,1,GridBagConstraints.FIRST_LINE_START);

		jtSum1Pl1b.setEditable(false);
		addComponent (jtSum1Pl1b,2,(RULES_SUM1_ROW),1,1,GridBagConstraints.FIRST_LINE_START);
				
		jtSum1Pl2a.setText("Sum");
		jtSum1Pl2a.setEditable(false);
		addComponent (jtSum1Pl2a,4,(RULES_SUM1_ROW),1,1,GridBagConstraints.FIRST_LINE_START);

		jtSum1Pl2b.setEditable(false);
		addComponent (jtSum1Pl2b,5,(RULES_SUM1_ROW),1,1,GridBagConstraints.FIRST_LINE_START);
		
	}
	
	private void addBonus(){
		
		jtBonusPl1a.setText("Bonus");
		jtBonusPl1a.setEditable(false);
		addComponent (jtBonusPl1a,0,(RULES_BONUS_ROW),1,1,GridBagConstraints.FIRST_LINE_START);

		jtBonusPl1b.setEditable(false);
		addComponent (jtBonusPl1b,2,(RULES_BONUS_ROW),1,1,GridBagConstraints.FIRST_LINE_START);
				
		jtBonusPl2a.setText("Bonus");
		jtBonusPl2a.setEditable(false);
		addComponent (jtBonusPl2a,4,(RULES_BONUS_ROW),1,1,GridBagConstraints.FIRST_LINE_START);

		jtBonusPl2b.setEditable(false);
		addComponent (jtBonusPl2b,5,(RULES_BONUS_ROW),1,1,GridBagConstraints.FIRST_LINE_START);
		
	}
	
	private void addTotalSum (){

		jtTotalSum1Pl1a.setText("Total Sum");
		jtTotalSum1Pl1a.setEditable(false);
		addComponent (jtTotalSum1Pl1a,0,(RULES_TOTAL_ROW),1,1,GridBagConstraints.FIRST_LINE_START);

		jtTotalSum1Pl1b.setEditable(false);
		addComponent (jtTotalSum1Pl1b,2,(RULES_TOTAL_ROW),1,1,GridBagConstraints.FIRST_LINE_START);
				
		jtTotalSum1Pl2a.setText("Total Sum");
		jtTotalSum1Pl2a.setEditable(false);
		addComponent (jtTotalSum1Pl2a,4,(RULES_TOTAL_ROW),1,1,GridBagConstraints.FIRST_LINE_START);

		jtTotalSum1Pl2b.setEditable(false);
		addComponent (jtTotalSum1Pl2b,5,(RULES_TOTAL_ROW),1,1,GridBagConstraints.FIRST_LINE_START);
		
	}
	
	private void addRuleDescriptionToBoard (int xpos){

		Player pl1 = player.get(0);
		Player pl2 = player.get(1);

		JTextField jt1 = new JTextField ();
		jt1.setText(pl1.getRuleDescription(xpos));
		jt1.setEditable(false);
		addComponent (jt1,0,(RULES_START_ROW+xpos),1,1,GridBagConstraints.FIRST_LINE_START);

		JTextField score1 = new JTextField ();
		jtScorePl1.add(score1);
		score1.setEditable(false);
		addComponent (score1,2,(RULES_START_ROW+xpos),1,1,GridBagConstraints.FIRST_LINE_START);
				
		JTextField jt2 = new JTextField ();
		jt2.setText(pl2.getRuleDescription(xpos));
		jt2.setEditable(false);
		addComponent (jt2,4,(RULES_START_ROW+xpos),1,1,GridBagConstraints.FIRST_LINE_START);

		
		JTextField score2 = new JTextField ();
		jtScorePl2.add(score2);
		score2.setEditable(false);
		addComponent (score2,5,(RULES_START_ROW+xpos),1,1,GridBagConstraints.FIRST_LINE_START);
		
	}
	
	private void addRuleDescriptionToBoard2 (int xpos){

		Player pl1 = player.get(0);
		Player pl2 = player.get(1);

		JTextField jt1 = new JTextField ();
		jt1.setText(pl1.getRuleDescription(xpos));
		jt1.setEditable(false);
		addComponent (jt1,0,(RULES_START_ROW2+xpos),1,1,GridBagConstraints.FIRST_LINE_START);

		JTextField score1 = new JTextField ();
		jtScorePl1.add(score1);
		score1.setEditable(false);
		addComponent (score1,2,(RULES_START_ROW2+xpos),1,1,GridBagConstraints.FIRST_LINE_START);
				
		JTextField jt2 = new JTextField ();
		jt2.setText(pl2.getRuleDescription(xpos));
		jt2.setEditable(false);
		addComponent (jt2,4,(RULES_START_ROW2+xpos),1,1,GridBagConstraints.FIRST_LINE_START);

		
		JTextField score2 = new JTextField ();
		jtScorePl2.add(score2);
		score2.setEditable(false);
		addComponent (score2,5,(RULES_START_ROW2+xpos),1,1,GridBagConstraints.FIRST_LINE_START);
		
	}
	

}
