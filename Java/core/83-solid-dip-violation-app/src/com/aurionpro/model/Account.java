package com.aurionpro.model;

public class Account {
	
	private SavingAccount saving;
	
	public Account(SavingAccount saving) {
		super();
		this.saving = saving;
	}
	
	public void pay(int amount) {
		saving.doTransaction(amount);
	}
		
}
