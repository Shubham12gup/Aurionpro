package com.aurionpro.test;

import com.aurionpro.model.PigDiceGame;

public class PigDiceTest {

	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";

	public static void main(String[] args) {
		System.out.println("PIG DICE GAME");
		System.out.println("* See how many turns it takes you to get to 20");
		System.out.println("* Turn ends when you hold or roll a 1");
		System.out.println("* If you roll a 1, you lose all points for the turn");
		System.out.println("* If you hold, you save all points for the turn\n");
		PigDiceGame pg = new PigDiceGame();
		System.out.println(ANSI_RED_BACKGROUND + "TURN " + pg.getTurns() + ANSI_RESET);
		while ((pg.getScore() + pg.getTurnScore()) < 20) {
			pg.runGame();
		}
		pg.updateTotalScore();
		System.out.println(ANSI_GREEN_BACKGROUND + "\n Congratulations!!! You Won " + ANSI_RESET);
		System.out.println("\nTotal Score : " + pg.getScore());
		System.out.println("You finished in " + pg.getTurns()+ " turns.");

	}

	

}
