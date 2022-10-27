package com.aurionpro.test;

import com.aurionpro.model.*;
//import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		Account acc = new Account(1, "Shubh", 10000);
		printDetails(acc);
		checkWithdraw(acc.withDraw(2000), acc);
		checkDeposit(acc.deposit(4000), acc);
		
		/*Scanner sc = new Scanner(System.in);
		Account acc = new Account(1, "Shubh", 10000);
		printDetails(acc);
		System.out.println("Enter amount to withdraw");
		int amountToWithdraw = sc.nextInt();
		
		checkWithdraw(acc.withDraw(amountToWithdraw), acc);
		
		System.out.println("Enter amount to deposit");
		int amountToDeposit = sc.nextInt();
		checkDeposit(acc.deposit(amountToDeposit), acc);
		*/
	}

	private static void checkDeposit(boolean deposit, Account acc) {
		if (deposit == true) {
			System.out.println("Deposit Successful");
			printDetails(acc);
		} else {
			System.out.println("Cannot deposit");
		}
	}

	private static void checkWithdraw(boolean withDraw, Account acc) {
		if (withDraw == true) {
			System.out.println("Withdrawal Successful");
			printDetails(acc);
		} else {
			System.out.println("Cannot Withdraw");
		}
	}

	private static void printDetails(Account acc) {
		System.out.println("Account ID: " + acc.getId());
		System.out.println("Name: " + acc.getName());
		System.out.println("Balance: " + acc.getBalance());
		System.out.println("----------------------");
	}

}
