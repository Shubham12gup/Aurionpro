package com.aurionpro.model;

public class Manager extends Employee{

	@Override
	public void performTask() {
		System.out.println("Task performed by Manager");
	}

	@Override
	public Employee cloneMethod() {
		System.out.println("Cloned Manager object");
		return (Manager) this.clone();
	}
	

}
