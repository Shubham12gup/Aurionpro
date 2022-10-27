package com.aurionpro.model;

public class Varargs {
	
	public int calculateSum(int ... numbers) {
		System.out.println("Number of elements: " + numbers.length);
		int sum = 0;
		for(int x:numbers)
			sum = sum + x;
		return sum;
	}
	
	public void test(boolean flag, String...strings) {
		System.out.println(flag);
		System.out.println("Number of elements: " + strings.length);
		for (String str: strings)
			System.out.println(str);
	}
	
//	Cannot have more than one varargs in one method.
//	public void test(boolean flag, String...strings, int ... numbers) {
//	
//	}
	
	public static void main(String args[]) {
		Varargs ex = new Varargs();
		int sum1 = ex.calculateSum(1, 2, 3);
		System.out.println("Sum: " +sum1);
		System.out.println("--------------------------");
		ex.test(true, "Hello", "Good", "Morning");
	}

}
