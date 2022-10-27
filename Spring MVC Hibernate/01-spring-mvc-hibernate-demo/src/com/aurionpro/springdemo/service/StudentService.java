package com.aurionpro.springdemo.service;

import java.util.List;

import com.aurionpro.springdemo.entity.Student;

public interface StudentService {
	
	public List<Student> getStudents();
	public void addStudent(Student student);
	public Student getStudentById(int id);
	public void deleteStudent(Student student);
	
}
