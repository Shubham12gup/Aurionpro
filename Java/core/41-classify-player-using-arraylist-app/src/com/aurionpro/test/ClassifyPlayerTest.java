package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Iterator;

import com.aurionpro.model.Player;
import com.aurionpro.model.PlayerInfo;

public class ClassifyPlayerTest {

	public static void main(String[] args) {
		ArrayList<Player> players = new ArrayList<Player>();
		players.add(new Player(101, "Sachin", 300, 10000, 80));
		players.add(new Player(102, "Dhoni", 500, 11000, 150));
		players.add(new Player(103, "Malinga", 300, 1000, 500));
		players.add(new Player(104, "Rahul", 70, 3500, 50));
		players.add(new Player(105, "Sam", 75, 2000, 100));
		players.add(new Player(106, "Ishan", 20, 500, 4));
		players.add(new Player(107, "Ram", 1, 80, 10));
		

		PlayerInfo play = new PlayerInfo(players);

		ArrayList<Player> ALister = play.getALister();
		Iterator<Player> itr = ALister.iterator();
		System.out.println("A Class Player");

		while (itr.hasNext()) {
			printDetails(itr.next());
		}
//		for (Player p : ALister) {
//			printDetails(p);
//		}
		System.out.println("------------------------");

		ArrayList<Player> BLister = play.getBLister();
		System.out.println("B Class Player");
		for (Player p : BLister) {
			printDetails(p);
		}
		System.out.println("------------------------");

		ArrayList<Player> CLister = play.getCLister();
		System.out.println("C Class Player");
		for (Player p : CLister) {
			printDetails(p);
		}
		System.out.println("------------------------");
		System.out.println("-------Max run scorer------");
		printDetails(play.maxScore());
	}

	private static void printDetails(Player player) {
		System.out.println("Name: " + player.getName());
		System.out.println("ID: " + player.getId());
		System.out.println("Matches: " + player.getMatches());
		System.out.println("Runs: " + player.getRuns());
		System.out.println("Wickets: " + player.getWickets() + "\n");
	}
}
