package com.aurionpro.model;

class Developer extends Employee {

	@Override
	public void performTask() {
		System.out.println("Task performed by Developer");
	}

	@Override
	public Employee cloneMethod() {
		System.out.println("Cloned Developer object");
		return (Developer) this.clone();
	}

}
