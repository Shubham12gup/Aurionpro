package com.aurionpro.model;

public class Developer extends Employee{
	public double pa;
	public double oa;
		
	public Developer(int empID, String name, double basicSalary) {
		super(empID, name, basicSalary);
		this.pa = basicSalary * 0.3;
		this.oa = basicSalary * 0.2;
	}

	public double getPa() {
		return pa;
	}

	public double getOa() {
		return oa;
	}

	@Override
	public double calculateAnnualCTC(){
		return (basicSalary + pa + oa) * 12;
	}

	@Override
	public void printSalarySlip() {
		System.out.println("Emp ID: " + getEmpID());
		System.out.println("Name: " + getName());
		System.out.println("Basic Salary: " + getBasicSalary());
		System.out.println("PA: " +getPa());
		System.out.println("OA: " +getOa());
		System.out.println("Annual CTC: " +calculateAnnualCTC()/100000 + " LPA");
		System.out.println("--------------------------------------");
	}
	
}
