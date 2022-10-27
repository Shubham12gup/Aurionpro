package com.aurionpro.test;

import com.aurionpro.model.*;

public abstract class EmployeeTest2 {
	public static void main(String args[]) {
		Manager manager = new Manager(101, "Shubh", 20000);
		printSalarySlip(manager);

		Developer developer = new Developer(201, "Ashish", 15000);
		printSalarySlip(developer);

		Accountant accountant = new Accountant(301, "Rahul", 10000);
		printSalarySlip(accountant);
		
		Test.Hello();
	}

	private static void printSalarySlip(Employee emp) {
		System.out.println("-------------Salary Slip-------------");
		System.out.println("Emp ID: " + emp.getEmpID());
		System.out.println("Name: " + emp.getName());
		System.out.println("Basic Salary: " + emp.getBasicSalary());
		
//		System.out.println(emp.getClass().getSimpleName());// == "Manager"); output is false

		if (emp.getClass().getSimpleName().equals("Manager")){
			System.out.println("HRA: " + ((Manager) emp).getHra());
			System.out.println("DA: " + ((Manager) emp).getDa());
			System.out.println("TA: " + ((Manager) emp).getTa());
			System.out.println("Annual CTC: " + emp.calculateAnnualCTC() / 100000 + " LPA");
		}
		
		if (emp.getClass().getSimpleName().equals("Developer")){
			System.out.println("PA: " + ((Developer) emp).getPa());
			System.out.println("OA: " + ((Developer) emp).getOa());
			System.out.println("Annual CTC: " +emp.calculateAnnualCTC()/100000 + " LPA");
		}
		
		if (emp.getClass().getSimpleName().equals("Accountant")){
			System.out.println("Perks: " +((Accountant) emp).getPerks());
			System.out.println("Annual CTC: " + emp.calculateAnnualCTC()/100000 + " LPA");
		}
		System.out.println("-------------------------------------\n");
	}
}
