package com.aurionpro.model;

import java.util.Random;
import java.util.Scanner;

public class PigDiceGame {
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	
	public int turns = 1;
	public int score;
	public int turnScore;
	
	public int getTurns() {
		return turns;
	}
	public int getScore() {
		return score;
	}
	public int getTurnScore() {
		return turnScore;
	}

	public int numberGenerator() {
		Random random = new Random();
		int die = 1 + random.nextInt(6);
		return die;
	}
	
	public void updateTurnScore(int die) {
		turnScore = turnScore + die;
	}
	
	public void updateTurns() {
		turns++;
	}
	
	public void updateTotalScore() {
		score = score + turnScore;
	}
	
	public void runGame() {
		System.out.print("Roll or hold? (r/h): ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if (s.equalsIgnoreCase("r")) {
			roll();
		}
		else if (s.equalsIgnoreCase("h"))
			hold();
		else
			runGame();
	}

	private void roll() {
		int die = numberGenerator();
		System.out.println(die);
		if (die == 1) {
			turnScore = 0;
			printDetails();
			updateTurns();
			System.out.println("Turn Over, No Score.\n");
			System.out.println(ANSI_RED_BACKGROUND + "TURN " + turns + ANSI_RESET);
		}
		else
			updateTurnScore(die);
	}

	private void hold() {
		updateTotalScore();
		printDetails();
		updateTurns();
		turnScore = 0;
		System.out.println(ANSI_RED_BACKGROUND + "TURN " + turns + ANSI_RESET);
		
	}
	
	public void printDetails() {
//		System.out.println("Turns : " +pg.getTurns());
		System.out.println("\nTurn Score : " + turnScore);
		System.out.println("Total Score : " + score + "\n");
	}
}
