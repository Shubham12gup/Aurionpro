package com.aurionpro.test;

import com.aurionpro.model.Consultant;
import com.aurionpro.model.Employee;
import com.aurionpro.model.ServiceConsultant;

public class EmployeeStrategyTest {

	public static void main(String[] args) {
		Employee employee = new Employee(101, "Shubh", new Consultant());
		System.out.println(employee);
		System.out.println("Role: "+employee.getDescription());
		System.out.println("Responsibility: "+employee.getResponsibility());
		System.out.println("----------------------------------------");
		
		employee.promote(new ServiceConsultant());
		System.out.println(employee);
		System.out.println("Role: "+employee.getDescription());
		System.out.println("Responsibility: "+employee.getResponsibility());
		
	}

}
