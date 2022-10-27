package com.aurionpro.model;

public class Student extends Person{
	
	public BranchType branch; 

	public Student(int id, String address, String dob, BranchType branch) {
		super(id, address, dob);
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", address=" + address + ", dob=" + dob + ", branch=" + branch +"]";
	}
	
	
	
}
