package com.aurionpro.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Player {
	public final String name;
	public final int age;
	public String playerId;

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

	public String getId() {
		return playerId;
	}

	public String IDGenerator() {
		AtomicInteger count = new AtomicInteger(100);
		int uniqueID = count.incrementAndGet();
		return "P"+uniqueID;
	}

	public Player whoIsElder(Player player2) {
		if (age < player2.getAge())
			return player2;
		return this;
	}

//	public Player(String name, int age) {
//		this(name, age, 101);
//	}
//
//	public Player() {
//		this("Ram", 45, 103);
//	}

}
