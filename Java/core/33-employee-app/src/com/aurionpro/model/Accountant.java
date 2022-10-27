package com.aurionpro.model;

public class Accountant extends Employee{
	public double perks;

	public Accountant(int empID, String name, double basicSalary) {
		super(empID, name, basicSalary);
		this.perks = basicSalary * 0.5; 
	}
	
	public double getPerks() {
		return perks;
	}

	@Override
	public double calculateAnnualCTC() {
		return (basicSalary + perks) * 12;
	}

	@Override
	public void printSalarySlip() {
		System.out.println("Emp ID: " + getEmpID());
		System.out.println("Name: " + getName());
		System.out.println("Basic Salary: " + getBasicSalary());
		System.out.println("Perks: " +getPerks());
		System.out.println("Annual CTC: " +calculateAnnualCTC()/100000 + " LPA");
		System.out.println("--------------------------------------");
	}

}
