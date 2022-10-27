package com.aurionpro.test;

import com.aurionpro.model.Employee;
import com.aurionpro.model.EmployeeFactory;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = EmployeeFactory.getEmployee("Developer");
		e1.assignSkill("JAVA, C");
		e1.task();

		Employee e4 = EmployeeFactory.getEmployee("Tester");
		e4.assignSkill("JAVA, C");
		e4.task();

		Employee e2 = EmployeeFactory.getEmployee("Developer");
		e2.assignSkill("JAVA");
		e2.task();
		Employee e3 = EmployeeFactory.getEmployee("Developer");
		e3.assignSkill("PYTHON");
		e3.task();

		Employee e5 = EmployeeFactory.getEmployee("Tester");
		e5.assignSkill("JAVA, PYTHON");
		e5.task();
		
	}

}
