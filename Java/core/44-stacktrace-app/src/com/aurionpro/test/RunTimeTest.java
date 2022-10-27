package com.aurionpro.test;

public class RunTimeTest {

	public static void main(String[] args) {
		method1();
		System.out.println("End of Main Method");
	}

	private static void method1() {
		// Error Handled using try catch
		try {
			method2();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("End of method1");
	}

	private static void method2() {
		method3();
		System.out.println("End of method2");
	}

	private static void method3() {
		throw new RuntimeException("Error in method3");

	}
}
