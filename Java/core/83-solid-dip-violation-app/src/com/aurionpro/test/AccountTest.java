package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {
		SavingAccount saving = new SavingAccount();
		Account account = new Account(saving);
		account.pay(2000);
		
//		CurrentAccount current = new CurrentAccount();
//		Account account1 = new Account(current);
//		account1.pay(2000);
	}

}
