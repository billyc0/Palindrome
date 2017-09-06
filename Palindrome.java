/**
	Palindrome.java
	@author Billy Chandler
	@version 2017-09-06
	
	Description:
	A simple program that checks for palindromes
	
	Developer websites:
	http://www.billychandler.org
	http://www.github.com/billyc0

**/

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		// Determines if the program is closed
		boolean done = false;
		// Determines if you made the correct choice of whether to quit or not
		boolean quitChoice;
		// How the user chooses whether or not to exit the program
		String quit;
		
		// Creates a scanner that reads user input
		Scanner scan = new Scanner(System.in);
		
		// The word the user inputs
		String word;
		// The string that determines if the inputted word is a palindrome
		String reversed;
		
		// Loop that runs the program
		while (!done) {
		
			// Prompts the user to input a word
			System.out.print("\nEnter a word: ");
			word = scan.nextLine();
			
			// Changes all of the word's characters to lowercase
			word = word.toLowerCase();
			
			// Resets the String for the reversed word
			reversed = "";
				
			// Reverses the word
			for (int i = word.length() - 1; i > -1; i--) {
				reversed += word.charAt(i);
			}
			
			// Checks to see if the word is a palindrome
			if (word.equals(reversed))
				System.out.println("\"" + word+ "\" is a palindrome.");
			else
				System.out.println("\n\"" + word+ "\" is NOT a palindrome.");
		
			// Resets the variables relating to closing the program
			quit = "";
			quitChoice = false;
			
			// Loop that prompts the user to either quit or continue using the program
			while (!quitChoice) {
				
				// Prompts the user to either quit or continue
				System.out.print("\nWould you like to quit? (Y/N) ");
				quit = scan.nextLine();	
				
				// Determines the outcome of the program based on user input
				if (quit.equals("Y") || quit.equals("y")) {
					System.out.println("Thank you for using this application!");
					done = true;
					quitChoice = true;
				}
				else if (quit.equals("N") || quit.equals("n")) {
					quitChoice = true;
				}
				else {
					System.out.println("Invalid input!");
				}
			}
		}
	}
}