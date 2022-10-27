package com.aurionpro.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aurionpro.springdemo.entity.Student;

@Repository
public class StudentDaoImp implements StudentDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<Student> getStudents() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		List<Student> resultList = currentSession.createQuery("from Student", Student.class).getResultList();
//		System.out.println(resultList);
		return resultList;
	}

	@Override
	public void addStudent(Student student) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(student);
	}

	@Override
	public Student getStudentById(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession.get(Student.class, id);
	}

	@Override
	public void deleteStudent(Student student) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.delete(student);
		
	}

}
