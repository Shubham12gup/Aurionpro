package com.aurionpro.case2;

public class A {
	int foo;
	public A(int foo) {
		this.foo = foo;
		System.out.println("Value is " +foo);
	}
	
	public A() {
		this.foo = 200;
		System.out.println("Value is " +foo);
	}
	
	public int getfoo() {
		return foo;
	}
}