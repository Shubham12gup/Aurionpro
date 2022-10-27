package com.aurionpro.test;

import com.aurionpro.model.Player;

public class PlayerTest {

	public static void main(String[] args) {
		Player player1 = new Player("Sachin", 20);
		Player player2 = new Player("Nitin", 35);
		// Player player = new Player();

		Player elder = player1.whoIsElder(player2);
		printPlayerDetails(elder);

	}

	private static void printPlayerDetails(Player elder) {
		System.out.println("Name: " + elder.getName());
		System.out.println("Age: " + elder.getAge());
		System.out.println("ID: " + elder.getId());
	}

}
