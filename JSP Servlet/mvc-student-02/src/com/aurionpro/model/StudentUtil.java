package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class StudentUtil {
	
	public List<Student> getStudentList() {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student(101, "Shubham", "shubham@gmail.com"));
		students.add(new Student(102, "Immanuel", "immanuel@gmail.com"));
		students.add(new Student(103, "Ashish", "ashish@gmail.com"));
		students.add(new Student(104, "Reena", "reena@gmail.com"));
		
		return students;
	}
}
