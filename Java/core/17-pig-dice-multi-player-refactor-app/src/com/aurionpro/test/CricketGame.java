package com.aurionpro.test;

import java.util.*;

public class CricketGame {

	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int start;
		System.out.print("Enter 1 to start the game and 0 for exit : ");
		start = sc.nextInt();

		while (start == 1) {
			System.out.print("Enter Player 1 Name : ");
			String player1 = sc.next();

			System.out.print("Enter Player 2 Name : ");
			String player2 = sc.next();

			//player1(player1, player2);
			player2(player1, player2, player1(player1, player2));
			
			System.out.print("Enter 1 to start the game and 0 for exit : ");
			start = sc.nextInt();

		}

	}

	private static void player2(String player1, String player2, int score1) {
		Scanner sc = new Scanner(System.in);
		int score2 = 0;
		int turns = 0;
		while (turns <= 12) {
			int point = 1;
			System.out.print("Enter 1 to Open Book : ");
			int open = sc.nextInt();
			if (open == 1) {
				Random random = new Random();
				int number = random.nextInt(301);
				point = number % 7;

				if (point != 0) {
					turns += 1;
					score2 += point;
					System.out.println("Page Number : " + number + "\t Point : " + point + "\t Score : " + score2
							+ "\t Rounds Left : " + (12 - turns));

					if (score2 > score1) {
						System.out.println("\n" + ANSI_GREEN_BACKGROUND + player2 + " Win Match !!!" + ANSI_RESET);
						break;
					}
					if (turns == 12 && score2 < score1) {
						System.out.println("\n" + ANSI_GREEN_BACKGROUND + player1 + " Win Match !!!" + ANSI_RESET);
						break;
					}
					if (turns == 12 && score2 > score1) {
						System.out.println("\n" + ANSI_GREEN_BACKGROUND + player2 + " Win Match !!!" + ANSI_RESET);
						break;
					}
					if (turns == 12 && score2 == score1) {
						System.out.println("\n" + ANSI_GREEN_BACKGROUND + " Match Ties !!!" + ANSI_RESET);
						break;
					}

				} else {
					turns += 1;
					System.out.println("Page Number : " + number + "\t Point : " + point + "\t Score : " + score2
							+ "\t Rounds Left : " + (12 - turns));
					System.out.println(ANSI_RED_BACKGROUND + "!!!\t\t OOPS \t\t !!!" + ANSI_RESET);
					System.out.println("\n" + ANSI_GREEN_BACKGROUND + player1 + " Win Match !!!" + ANSI_RESET);
					break;
				}

			}

		}
		
	}

	private static int player1(String player1, String player2) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player : " + player1);
		int point = 1, score1 = 0, turns = 1;
		while (point != 0 && turns <= 12) {
			System.out.print("Enter 1 to Open Book : ");
			int open = sc.nextInt();

			if (open == 1) {
				Random random = new Random();
				int number = random.nextInt(301);
				point = number % 7;
				if (point != 0 && turns != 12) {
					turns += 1;
					score1 += point;
					System.out.println("Page Number : " + number + "\t Point : " + point + "\t Score : " + score1);
				} else {
					System.out.println("Page Number : " + number + "\t Point : " + point + "\t Score : " + score1);
					System.out.println(ANSI_RED_BACKGROUND + "!!!\t\t OOPS \t\t !!!" + ANSI_RESET);
					System.out.println(player1 + " Total Score : " + score1);
					System.out.println(player1 + " Takes " + turns + " Rounds");
				}
			}
		}
		System.out.println(player2 + " needs " + (score1 + 1) + " score in 12 rounds to win match.\n");
		System.out.println("Player : " + player2);
		return score1;
	}
}
