package com.aurionpro.model;

public class Accountant extends Employee{

	@Override
	public void performTask() {
		System.out.println("Task performed by Accountant");
	}

	@Override
	public Employee cloneMethod() {
		System.out.println("Cloned Accountant object");
		return (Accountant) this.clone();
	}

	
	

}
