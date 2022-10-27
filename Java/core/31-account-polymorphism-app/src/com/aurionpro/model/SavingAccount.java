package com.aurionpro.model;

public class SavingAccount extends Account{
	double minBalance = 5000;
	
	public SavingAccount(int accNumber, String name, double balance) {
		super(accNumber, name, balance);
	}
	
	@Override
	public void withdraw(double amount) {
		if (this.getBalance() - amount > minBalance)
			this.setBalance(this.getBalance() - amount);
		else
			System.out.println("Insufficient Balance");
	}
}
