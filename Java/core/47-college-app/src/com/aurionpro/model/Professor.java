package com.aurionpro.model;

public class Professor extends Person implements ISalary{

	public double basicSalary;
	
	public Professor(int id, String address, String dob, double basicSalary) {
		super(id, address, dob);
		this.basicSalary = basicSalary;
	}


	@Override
	public double calculateSalary() {
		double hra = basicSalary * 0.5;
		double oa = basicSalary * 0.2;
		double salary = (basicSalary + hra + oa)*12;
		return salary;
		
	}
	
	@Override
	public String toString() {
		return "Professor [id=" + id + ", address=" + address + ", dob=" + dob + ", Salary=" + calculateSalary() +"]";
	}
	
	

}
