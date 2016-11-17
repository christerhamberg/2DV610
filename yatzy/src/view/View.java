package view;

import java.util.Scanner;

public class View {
	
	
	public String getKbInput(){

		Scanner keyboard = new Scanner(System.in);
		System.out.print("\nSelect 'R' to roll, 'F' to freeze 'U' to unfreeze or [1-5] Dice : ");
		
		String input = keyboard.nextLine();

		keyboard.close();
		
		return input;
		
	}
	
	   
}
