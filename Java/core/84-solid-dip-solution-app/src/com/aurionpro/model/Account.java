package com.aurionpro.model;

public class Account {

	private IAccountType account;

	public Account(IAccountType account) {
		super();
		this.account = account;
	}

	public void pay(int amount) {
		account.doTransaction(amount);
	}

}
