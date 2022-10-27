package com.aurionpro.model;

public class Child extends Parent{
	
	static {
		System.out.println("Inside static block of child class");
	}
	
	public Child() {
//		super();
		System.out.println("Inside child class");

	}
}
