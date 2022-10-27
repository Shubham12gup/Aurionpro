package com.aurionpro.test;

public class ExceptionDemo {

	public static void main(String[] args) {
		int c= 0;
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			c = a/b;
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception handled");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Exception handled");
		}
		catch (NumberFormatException e) {
			System.out.println("NumberFormatException Exception handled");
		}
		catch (Exception e) {
			System.out.println("Exception handled.");
		}
		finally {
			System.out.println("Hello....This is finally block");
		}
		System.out.println("Division result : " +c);
	}

}
