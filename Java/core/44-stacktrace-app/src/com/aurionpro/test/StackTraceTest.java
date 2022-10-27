package com.aurionpro.test;

public class StackTraceTest {

	public static void main(String[] args) throws Exception {

		method1();
		System.out.println("Main Method");
	}

	private static void method1() throws Exception {
		method2();
		System.out.println("End of method1");
	}

	private static void method2() throws Exception {
		method3();
		System.out.println("End of method2");
	}

	private static void method3() throws Exception {
		throw new Exception("Error in method3");
	}

}
