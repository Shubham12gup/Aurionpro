package com.aurionpro.model;

import java.util.ArrayList;

public class PlayerInfo {
	public ArrayList<Player> players;

	public PlayerInfo(ArrayList<Player> player) {
		this.players = player;
	}

	public ArrayList<Player> getALister() {
		ArrayList<Player> AList = new ArrayList<>();
		for (Player p : players) {
			if (p.getMatches() > 100 && (p.getRuns() > 5000 || p.getWickets() > 150))
				AList.add(p);
		}
		return AList;
	}

	public ArrayList<Player> getBLister() {
		ArrayList<Player> BList = new ArrayList<>();
		for (Player p : players) {
			if ((p.getMatches() > 50 && p.getMatches() <= 100)
					&& ((p.getRuns() > 3000 && p.getRuns() <= 5000) || (p.getWickets() > 75 && p.getWickets() <= 150)))
				BList.add(p);
		}
		return BList;
	}

	public ArrayList<Player> getCLister() {
		ArrayList<Player> CList = new ArrayList<>();
		for (Player p : players) {
			if (p.getMatches() < 50 && (p.getRuns() < 3000 || p.getWickets() < 75))
				CList.add(p);
		}
		return CList;
	}

	public Player maxScore() {
		Player maxPlayer = players.get(0);
		for (Player p : players) {
			if (p.getRuns() > maxPlayer.getRuns())
				maxPlayer = p;
		}
		return maxPlayer;
	}
}
