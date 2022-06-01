package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		String question = JOptionPane.showInputDialog("Are Dinosaurs Extinct?");
		int score = 0;
		if (question.equalsIgnoreCase("Yes")) {
			score++;
		JOptionPane.showMessageDialog(null,"You got the question correct! +1 point");
		}
		String crocodile = JOptionPane.showInputDialog("Are crocodiles dinosaurs?");
		if (crocodile.equalsIgnoreCase("No")) {
			score++;
		JOptionPane.showMessageDialog(null,"You got the question correct! +1 point");
		}
		String fly = JOptionPane.showInputDialog("Could some dinosaurs fly?");
		if(fly.equalsIgnoreCase("Yes")) {
		score++;
		JOptionPane.showMessageDialog(null, "You got the question correct! +1 point");
				
		}
		JOptionPane.showMessageDialog(null, "Score: "+score);		
				
				
		

		// Create a variable to hold the user's score. Set it equal to zero.

		// ASK A QUESTION AND CHECK THE ANSWER

		// 2. Ask the user a question

		// 3. Use an if statement to check if their answer is correct

		// 4. if the user's answer was correct, add one to their score

		// MAKE MORE QUESTIONS. Ask more questions by repeating the above
		// Option: Subtract a point from their score for a wrong answer

		// After all the questions have been asked, tell the user their final score

	}
}
