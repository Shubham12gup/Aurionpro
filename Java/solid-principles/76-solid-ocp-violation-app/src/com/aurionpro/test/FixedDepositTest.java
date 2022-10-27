package com.aurionpro.test;

import com.aurionpro.model.FestivalType;
import com.aurionpro.model.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit fd1 = new FixedDeposit("Shubh", 1000, 2, FestivalType.Diwali);
		System.out.println(fd1);
		System.out.println("Interest: " + fd1.calculateSimpleInterest());
		
		FixedDeposit fd2 = new FixedDeposit("Ashish", 2000, 1, FestivalType.Eid);
		System.out.println(fd2);
		System.out.println("Interest: " + fd2.calculateSimpleInterest());
		
		FixedDeposit fd3 = new FixedDeposit("Reena", 3000, 3, FestivalType.Other);
		System.out.println(fd3);
		System.out.println("Interest: " + fd3.calculateSimpleInterest());
		
	}

}
