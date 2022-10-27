package com.aurionpro.test;

import java.time.LocalDateTime;

import com.aurionpro.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee(101, "Shubh", 100000, "16/07/2022");
		System.out.println(employee);

		Employee employee2 = new Employee(102, "Ashish", 140000, "10/04/2000");
		System.out.println(employee2);
		
	}

}
