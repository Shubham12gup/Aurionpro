package com.aurionpro.model;

public class Manager extends Employee{
	double hra;
	double da;
	double ta;
	
	public Manager(int empID, String name, double basicSalary) {
		super(empID, name, basicSalary);
		this.hra = basicSalary * 0.3;
		this.da = basicSalary * 0.2;
		this.ta = basicSalary * 0.1;
	}
	public double getHra() {
		return hra;
	}
	public double getDa() {
		return da;
	}
	public double getTa() {
		return ta;
	}
	
	@Override
	public double calculateAnnualCTC(){
		return (basicSalary + hra + da + ta) * 12;
	}
	@Override
	public void printSalarySlip() {
		System.out.println("Emp ID: " + getEmpID());
		System.out.println("Name: " + getName());
		System.out.println("Basic Salary: " + getBasicSalary());
		System.out.println("HRA: " +getHra());
		System.out.println("DA: " +getDa());
		System.out.println("TA: " +getTa());
		System.out.println("Annual CTC: " +calculateAnnualCTC()/100000 + " LPA");
		System.out.println("--------------------------------------");
	}
}
