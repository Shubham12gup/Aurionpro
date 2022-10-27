package com.aurionpro.test;

import com.aurionpro.model.Player;
import com.aurionpro.model.PlayerInfo;

public class ClassifyPlayerTest {

	public static void main(String[] args) {
		Player[] players = {
				new Player(101, "Sachin", 300, 10000, 80),
				new Player(102, "Dhoni", 500, 11000, 150),
				new Player(103, "Malinga", 300, 1000, 500),
				new Player(104, "Rahul", 70, 3500, 50),
				new Player(105, "Sam", 75, 2000, 100),
				new Player(106, "Ishan", 20, 500, 4) 
				};
		
		PlayerInfo play = new PlayerInfo(players);
		
		Player[] ALister = play.getALister();
		System.out.println("A Class Player");
		for(Player p:ALister) {
			if (p != null)
				printDetails(p);
		}
		System.out.println("------------------------");
		
		Player[] BLister = play.getBLister();
		System.out.println("B Class Player");
		for(Player p:BLister) {
			if (p != null)
				printDetails(p);
		}
		System.out.println("------------------------");

		Player[] CLister = play.getCLister();
		System.out.println("C Class Player");
		for(Player p:CLister) {
			if (p != null)
				printDetails(p);
		}
		System.out.println("------------------------");
		System.out.println("-------Max run scorer------");
		printDetails(play.maxScore());
	}

	private static void printDetails(Player player) {
		System.out.println("Name: " + player.getName());
		System.out.println("ID: "+ player.getId());
		System.out.println("Matches: " +player.getMatches());
		System.out.println("Runs: " +player.getRuns());
		System.out.println("Wickets: " +player.getWickets()+"\n");
	}
}
