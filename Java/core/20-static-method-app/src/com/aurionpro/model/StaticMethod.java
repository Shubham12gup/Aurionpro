package com.aurionpro.model;

public class StaticMethod {
	private int id;
	private String name;
	private double salary;
	
	public StaticMethod(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

//	***static Method cannot access object members
//	public static void printEmployeeDetails() {
//		System.out.println(id);
//		System.out.println(name);
//		System.out.println(salary);
//	}
	
	public void printEmployeeDetail() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
}
