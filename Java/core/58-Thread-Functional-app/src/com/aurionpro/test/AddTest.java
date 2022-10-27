package com.aurionpro.test;

import com.aurionpro.model.IAddable;

public class AddTest {

	public static void main(String[] args) {
		IAddable a1 = new IAddable() {

			@Override
			public int addIntegers(int a, int b) {
				return a + b;
			}
		};
		System.out.println("10 + 20 = " +a1.addIntegers(10, 20));

		IAddable a2 = (a, b) -> {
			return a + b;
		};
		System.out.println(a2.addIntegers(20, 30));
		
		IAddable a3 = AddTest::execute;
		System.out.println(a3.addIntegers(30, 30));
	}

	public static int execute(int a, int b) {
		return a + b;
	}
}
