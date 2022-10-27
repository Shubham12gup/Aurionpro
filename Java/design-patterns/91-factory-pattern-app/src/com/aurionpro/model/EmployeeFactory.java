package com.aurionpro.model;

public class EmployeeFactory {
	
	public IEmployee getEmployee(String employeeType) {
		
		if (employeeType == null)
			return null;
		
		else if (employeeType.equalsIgnoreCase("Manager"))
			return new Manager();
		
		else if (employeeType.equalsIgnoreCase("Developer"))
			return new Developer();
		
		else if (employeeType.equalsIgnoreCase("Accountant"))
			return new Accountant();
		
		return null;
	}
}
