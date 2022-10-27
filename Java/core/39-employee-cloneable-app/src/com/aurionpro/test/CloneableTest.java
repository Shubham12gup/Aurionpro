package com.aurionpro.test;

import com.aurionpro.model.Employee;

public class CloneableTest {

	public static void main(String[] args) {
		
		try {
			Employee employee = new Employee(101, "Shubh", 100000);
			System.out.println(employee);
			Employee clonedEmployee = (Employee) employee.clone();
			
			System.out.println(clonedEmployee);
			System.out.println(employee.hashCode());
			System.out.println(clonedEmployee.hashCode());			
			System.out.println(clonedEmployee.equals(employee));			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
