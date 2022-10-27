package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.SalaryAccount;
import com.aurionpro.model.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {
		System.out.println("Saving Account");
		SavingAccount saving = new SavingAccount(101, "Rahul", 5000);
		printAccountDetails(saving);
		saving.deposit(10000);
		printAccountDetails(saving);
		saving.withdraw(15000);
		printAccountDetails(saving);
		System.out.println("-----------------------------");

		System.out.println("Salary Account");
		SalaryAccount salary = new SalaryAccount(101, "Shivam", 5000);
		printAccountDetails(salary);
		salary.deposit(10000);
		printAccountDetails(salary);
		salary.withdraw(15000);
		printAccountDetails(salary);
		salary.withdraw(40000);
		printAccountDetails(salary);
		salary.withdraw(20000);
	}

	private static void printAccountDetails(Account account) {
		System.out.println("Account Number: " +account.getAccountNumber());
		System.out.println("Name: " +account.getName());
		System.out.println("Balance: " +account.getBalance()+"\n");

	}
	
}
