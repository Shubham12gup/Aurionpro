package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	
	private int accountNumber;
	private String name;
	private double balance;
	private static List<INotifier> list;
	
	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		list = new ArrayList<INotifier>();
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double amount) {
		if (amount > balance)
			System.out.println("Insufficient balance");
		else {
			balance = balance - amount;
			for (INotifier l: list) {
				l.sendNotification(this, amount, "withdraw");
			}
		}			
	}
	
	public void deposit(double amount) {
		if (amount < 0)
			System.out.println("Cant deposit");
		else{
			balance = balance + amount;
			for (INotifier l: list) {
				l.sendNotification(this, amount, "deposit");
			}
		}
	}
	
	public void registerNotifier(INotifier notifier) {
		list.add(notifier);
	}
	
	
}