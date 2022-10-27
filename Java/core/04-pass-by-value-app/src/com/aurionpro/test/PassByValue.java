package com.aurionpro.test;

public class PassByValue {

	public static void main(StringCheck[] args) {
		int num = 10;
		System.out.println("Value before increment is " +num);
		increment(num);
	}
	
	public static void increment(int num){
		num++;
		System.out.println("Value after increment is " +num);
		
	}

}

