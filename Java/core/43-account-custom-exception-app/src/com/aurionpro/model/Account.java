package com.aurionpro.model;


public class Account {
	int accountNumber;
	String name;
	double balance;
	
	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) throws InvalidDepositAmmountException {
		if (amount < 0)
			throw new InvalidDepositAmmountException("Cannot deposit");
		else
			balance = balance + amount;
	}
	
	public void withdraw(double amount) throws InsufficientFundException {
		if (balance < amount)
			throw new InsufficientFundException("Insufficient Fund");
		else 
			balance = balance - amount;
	}
}




