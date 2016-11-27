package yatzy;

import javax.swing.SwingUtilities;

import view.ViewGui;

public class YatzyMain {
	
	static String nameOfTheGame = "Lets play a game of Yatzy!";
	
	public static void main(String[] args) {
		
		displayWelcome ();
		
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new ViewGui(nameOfTheGame);
			}
			   
		});
		
	}

	public static void displayWelcome (){
		System.out.print("\n" +nameOfTheGame);
	}
}
