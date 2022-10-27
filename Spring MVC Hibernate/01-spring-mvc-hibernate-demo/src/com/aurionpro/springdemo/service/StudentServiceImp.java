package com.aurionpro.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aurionpro.springdemo.dao.StudentDao;
import com.aurionpro.springdemo.entity.Student;

@Service
public class StudentServiceImp implements StudentService{

	@Autowired
	private StudentDao studentDao;
	
	@Transactional
	@Override
	public List<Student> getStudents() {
		
		List<Student> students = studentDao.getStudents();
		return students;
	}

	@Transactional
	@Override
	public void addStudent(Student student) {
		studentDao.addStudent(student);
	}
	
	@Transactional
	@Override
	public Student getStudentById(int id) {
		return studentDao.getStudentById(id);
	}

	@Transactional
	@Override
	public void deleteStudent(Student student) {
		studentDao.deleteStudent(student);
	}
	
	
}
