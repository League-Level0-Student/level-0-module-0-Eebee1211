package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
	public static void main(String[] args) {
			
		
	
		Random ran = new Random();
		int number = ran.nextInt(4); 
		System.out.println(number); 
		String question = JOptionPane.showInputDialog("What do you think is awesome?");
		if(number==0) {
			JOptionPane.showMessageDialog(null,"What you entered is awesome!"); 
		
		}
		else if(number==1) {
			JOptionPane.showMessageDialog(null,"What you entered is okay");
		}
		
		else if(number==2) {
			JOptionPane.showMessageDialog(null, "What you entered is boring");
		}
		else if(number==3) {
			JOptionPane.showMessageDialog(null, "What you entered is not true");
		}
		//This will b used below to make a random number. 
		
		
		// 2. Make a variable that will hold a random whole number
		
	
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
	
		// 3. Print your variable to the console
	
		// 4. Get the user to enter something that they think is awesome
		
	
		// 5. If your variable is  0
	
			// -- tell the user whatever they entered is awesome!
	
		// 6. If your variable is  1
	
			// -- tell the user whatever they entered is ok.
	
		// 7. If your variable is  2
	
			// -- tell the user whatever they entered is boring.
	
		// 8. If your variable is  3
	
			// -- invent your own message to give to the user (be nice).

}
}
