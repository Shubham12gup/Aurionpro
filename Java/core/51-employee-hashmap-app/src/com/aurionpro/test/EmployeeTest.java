package com.aurionpro.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.aurionpro.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		ArrayList<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee(1, "rahul"));
		employee.add(new Employee(2, "Shubh"));
		employee.add(new Employee(3, "gaurav"));
		employee.add(new Employee(4, "Amit"));
		employee.add(new Employee(4, "Amit"));

 		Map<Integer, Employee> employeeHash = new HashMap<Integer, Employee>();
 		for (Employee emp: employee)
 			employeeHash.put(emp.getId(), emp);
 		
 		 employeeHash.forEach((k,v) -> System.out.println("ID  "
                 + k + " : " + v));
 		
// 		Set<Map.Entry<Integer, Employee>> set1 = employeeHash.entrySet();
// 		for (Map.Entry emp: set1) {
// 			System.out.println("ID " +emp.getKey()+ " :" +emp.getValue());
// 		}
	}

}
