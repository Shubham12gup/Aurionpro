package com.aurionpro.model;

public class SalaryAccount extends Account{
	double overDraft = 50000;

	public SalaryAccount(int accNumber, String name, double balance) {
		super(accNumber, name, balance);
	}
	
	@Override
	public void withdraw(double amount) {
		if (this.getBalance() - amount > -overDraft)
			this.setBalance(this.getBalance() - amount);
		else
			System.out.println("Insufficient Balance");
	}

}
