package com.aurionpro.model;

public abstract class Employee {
	public int empID;
	public String name;
	public double basicSalary;
	
	public Employee(int empID, String name, double basicSalary) {
		super();
		this.empID = empID;
		this.name = name;
		this.basicSalary = basicSalary;
	}

	public int getEmpID() {
		return empID;
	}

	public String getName() {
		return name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}
	
	public abstract double calculateAnnualCTC();
	
	public abstract void printSalarySlip();
	
}
