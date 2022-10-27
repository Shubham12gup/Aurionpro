package com.aurionpro.model;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_RESET = "\u001B[0m";

	Scanner sc = new Scanner(System.in);
	int turns;
	int guessingNumber = numberGenerator();
	int userGuess;

	public int getTurns() {
		return turns;
	}

	public int getGuessingNumber() {
		return guessingNumber;
	}

	public int getUserGuess() {
		return userGuess;
	}

	public int numberGenerator() {
		Random random = new Random();
		int number = 1 + random.nextInt(100);
		return number;
	}

	public void updateTurns() {
		turns++;
	}
	
	public void enterGuess() {
		System.out.print("\nEnter your guess : ");
		userGuess = sc.nextInt();
		while (userGuess < 1 || userGuess > 100) {
			System.out.println("Enter number between 1-100 only");
			System.out.print("\nEnter your guess : ");
			userGuess = sc.nextInt();
		}
	}

	public void checkGuessIsLowOrHigh() {
		if (userGuess == guessingNumber)
			return;
		else if (userGuess > guessingNumber)
			System.out.println("Sorry, Your guess is too high.");
		else
			System.out.println("Sorry, Your guess is too low.");
	}

	public void printWinOrLossDetail() {
		if (userGuess == guessingNumber) {
			System.out.println("\nYour guessed number " + userGuess + " is right.");
			System.out.println("You guessed in " + turns + " turns.");
			System.out.println(ANSI_GREEN_BACKGROUND + "You won :)\n" + ANSI_RESET);
		} else {
			System.out.println("\nYour " + turns + " turns are over");
			System.out.println("Number to be guessed is " + getGuessingNumber());
			System.out.println(ANSI_RED_BACKGROUND + "You loose :(\n" + ANSI_RESET);
		}
	}
	
}
