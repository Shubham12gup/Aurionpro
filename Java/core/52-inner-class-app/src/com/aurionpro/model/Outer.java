package com.aurionpro.model;

public class Outer {
	private String text = "I am outer class";
	
	class Inner {

		void msg() {
			System.out.println(text+ "\nI am inner class");
		}
	}

	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		in.msg();

	}

}
