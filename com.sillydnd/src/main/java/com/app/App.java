package com.app;

import java.util.Scanner;
import com.parents.*;

public class App {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean userInputCorrect = false;
		
		do {
		System.out.println("Welcome to the Silly D'n'D\n"
				+ "Would you like to play as a\n"
				+ "1. Human Wizard \n"
				+ "2. Elf Royal \n"
				+ "3. Twi'lek Jedi \n"
				+ "4. Smurf Warrior \n"
				+ "5. Turtle Ninja");
		
		String userInput = sc.nextLine();
		
		
			switch (userInput) {
			case "1":
				//call to humanWizard Methods here
				break;
			case "2":
				//call to elfRoyal methods here
				break;
			case "3":
				//call to twi'lekJedi methods here
				break;
			case "4":
				//call to smurfWarrior methods here
				break;
			case "5":
				//call to turtleNinja here
				break;
			default:
				userInputCorrect = true;
				System.out.println("You've entered an invalid choice.\n"
						+ "1, 2, 3, 4, 5 are your choices.\n");
				break;
			}
		} while (userInputCorrect);
		
	} //main method

} //App class
