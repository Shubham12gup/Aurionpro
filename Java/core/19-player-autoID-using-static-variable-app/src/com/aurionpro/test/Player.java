package com.aurionpro.test;

public class Player {
	private final String name;
	private String id;

	public static int idCount = 100;

	public Player(String name) {
		this.name = name;
		this.id = idGen();
	}

	public String idGen() {
		idCount++;
		return "P" + idCount;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", id=" + id + "]";
	}
}
