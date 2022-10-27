package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.InvalidDepositAmmountException;

public class AccountTest {

	public static void main(String[] args) {
		try {
			Account acc = new Account(101, "Sachin", 50000);
			acc.withdraw(60000);
			acc.deposit(-1);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		} catch (InvalidDepositAmmountException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());

		}
		
	}

}
