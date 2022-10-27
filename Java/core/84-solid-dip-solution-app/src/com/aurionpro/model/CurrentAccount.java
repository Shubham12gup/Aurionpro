package com.aurionpro.model;

public class CurrentAccount implements IAccountType {

	public void doTransaction(int amount) {
		System.out.println("Transaction of " + amount + " done from current account");
	}
	
}
