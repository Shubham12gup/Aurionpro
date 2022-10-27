package com.aurionpro.model;
public class PlayerInfo {
	public Player[] player;
	
	public PlayerInfo(Player[] player) {
		this.player = player;
	}

	public Player[] getALister() {
		Player AList[] = new Player[player.length];
		for(int i=0; i<player.length; i++) {
			if (player[i].getMatches() > 100 && (player[i].getRuns()>5000 || player[i].getWickets()>150))
				AList[i] = player[i];
		}
		return AList;
	}

	public Player[] getBLister() {
		Player[] BList =  new Player[player.length];
		for(int i=0; i<player.length; i++) {
			if ((player[i].getMatches() > 50 && player[i].getMatches() <=100) && 
					((player[i].getRuns()> 3000 && player[i].getRuns() <= 5000)|| 
					(player[i].getWickets() > 75 && player[i].getWickets() <= 150)))
				BList[i] = player[i];
		}
		return BList;
	}

	public Player[] getCLister() {
		Player[] CList =  new Player[player.length];
		for(int i=0; i<player.length; i++) {
			if (player[i].getMatches() < 50 && (player[i].getRuns() < 3000 || player[i].getWickets() < 75))
				CList[i] = player[i];
		}
		return CList;
	}
	public Player maxScore() {
		Player maxPlayer = player[0];
		for(int i=0; i<player.length; i++) {	
			if (player[i].getRuns() > maxPlayer.getRuns())
				maxPlayer = player[i];
		}
		return maxPlayer;
	}
}
