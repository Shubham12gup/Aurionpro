package com.aurionpro.test;

import com.aurionpro.model.Diwali;
import com.aurionpro.model.Eid;
import com.aurionpro.model.FixedDeposit;
import com.aurionpro.model.NewYear;
import com.aurionpro.model.Other;


public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit fd1 = new FixedDeposit("Shubh", 4000, 2, new Diwali());
		System.out.println(fd1);
		System.out.println("Interest: " + fd1.calculateSimpleInterest());
		System.out.println("---------------------------------------------------");
		
		FixedDeposit fd2 = new FixedDeposit("Ashish", 2000, 4, new Eid());
		System.out.println(fd2);
		System.out.println("Interest: " + fd2.calculateSimpleInterest());
		System.out.println("---------------------------------------------------");

		FixedDeposit fd4 = new FixedDeposit("Ashish", 1000, 1, new NewYear());
		System.out.println(fd4);
		System.out.println("Interest: " + fd4.calculateSimpleInterest());
		System.out.println("---------------------------------------------------");

		FixedDeposit fd3 = new FixedDeposit("Reena", 3000, 3, new Other());
		System.out.println(fd3);
		System.out.println("Interest: " + fd3.calculateSimpleInterest());
		System.out.println("---------------------------------------------------");

		
	}

}
