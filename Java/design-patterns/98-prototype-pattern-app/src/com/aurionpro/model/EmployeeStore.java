package com.aurionpro.model;

import java.util.HashMap;
import java.util.Map;

public class EmployeeStore {
	
	public static Map<String, Employee> emplist = new HashMap<String, Employee>();

	static {
		emplist.put("Accountant", new Accountant());
		emplist.put("Developer", new Developer());
		emplist.put("Manager", new Manager());

	}

	public static Employee getEmployee(String empType) {
		return (Employee) emplist.get(empType).cloneMethod();
	}

}
