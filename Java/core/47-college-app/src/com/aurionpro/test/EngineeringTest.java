package com.aurionpro.test;

import com.aurionpro.model.BranchType;
import com.aurionpro.model.Professor;
import com.aurionpro.model.Student;

public class EngineeringTest {

	public static void main(String[] args) {
		
		Student student = new Student(101, "Andheri", "12/09/2000", BranchType.Science);
		Professor professor = new Professor(101, "Vikhroli", "20/09/1994", 50000);
		
		System.out.println(student);
		System.out.println(professor);
	}

}
