package com.aurionpro.test;

import com.aurionpro.model.EmployeeFactory;
import com.aurionpro.model.IEmployee;

public class EmployeeFactoryTest {

	public static void main(String[] args) {
		EmployeeFactory employee = new EmployeeFactory();
		
		IEmployee developer = employee.getEmployee("Developer");
		developer.performTask();
		
		IEmployee accountant = employee.getEmployee("Accountant");
		accountant.performTask();
		
		IEmployee manager = employee.getEmployee("Manager");
		manager.performTask();
		
	}

}
