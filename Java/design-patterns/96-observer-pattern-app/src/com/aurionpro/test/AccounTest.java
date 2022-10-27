package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.EmailNotifier;
import com.aurionpro.model.SmsNotifier;

public class AccounTest {

	public static void main(String[] args) {
		Account acc = new Account(101, "Shubh", 1000);
		acc.registerNotifier(new SmsNotifier());
		acc.deposit(1000);
		
		acc.registerNotifier(new EmailNotifier());
		acc.withdraw(2001);
		
		System.out.println("---------------------------------------------");
		Account acc1 = new Account(102, "Ashish", 5000);
		acc1.registerNotifier(new SmsNotifier());
		acc1.deposit(1000);
		
		System.out.println("---------------------------------------------");
		Account acc2 = new Account(102, "Ashish", 5000);
//		acc.registerNotifier(new SmsNotifier());
		acc2.deposit(1000);
		
	}

}
