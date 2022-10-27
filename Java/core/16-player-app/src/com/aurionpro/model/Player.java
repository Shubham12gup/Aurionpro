package com.aurionpro.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Player {
	public final String name;
	public final int age;
	public final int playerId;

	public Player(String name, int age) {
		this.name = name;
		this.age = age;
		this.playerId = IDGenerator();
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return playerId;
	}
	
	public int IDGenerator() {
		AtomicInteger count = new AtomicInteger(100);
		int uniqueID = count.incrementAndGet();
		return uniqueID;
	}

	public Player whoIsElder(Player player2) {
		if (age < player2.getAge())
			return player2;
		return this;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", playerId=" + playerId + "]";
	}

}
