package com.aurionpro.test;

import com.aurionpro.model.*;

public abstract class EmployeeTest {
	public static void main(String args[]) {
		Manager manager = new Manager(101, "Shubh", 20000);
		manager.printSalarySlip();

		Developer developer = new Developer(201, "Ashish", 15000);
		developer.printSalarySlip();

		Accountant accountant = new Accountant(301, "Rahul", 10000);
		accountant.printSalarySlip();
	}
}
