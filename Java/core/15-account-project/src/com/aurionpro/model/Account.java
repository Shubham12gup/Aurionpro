package com.aurionpro.model;
public class Account {
	public int id;
	public String name;
	public double balance;

	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public boolean withDraw(int amount) {
		int minimumBalance = 1000;
		if (balance - amount >= minimumBalance) {
			balance = balance - amount;
			return true;
		}
		return false;
	}

	public boolean deposit(int amount) {
		if (amount > 0) {
			balance = balance + amount;
			return true;
		}
		return false;
	}

}
