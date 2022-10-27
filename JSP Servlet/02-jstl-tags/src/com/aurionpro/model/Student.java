package com.aurionpro.model;

public class Student {
	
	private String name;
	private int rollno;
	private boolean merit;
	
	public Student(String name, int rollno, boolean merit) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.merit = merit;
	}

	public String getName() {
		return name;
	}

	public int getRollno() {
		return rollno;
	}

	public boolean isMerit() {
		return merit;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", merit=" + merit + "]";
	}
}
