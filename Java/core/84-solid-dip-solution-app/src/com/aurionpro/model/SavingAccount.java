package com.aurionpro.model;

public class SavingAccount implements IAccountType {

	public void doTransaction(int amount) {
		System.out.println("Transaction of " + amount + " done from saving account");
	}
}
