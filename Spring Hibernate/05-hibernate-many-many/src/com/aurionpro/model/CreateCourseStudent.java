package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aurionpro.model.entity.Course;
import com.aurionpro.model.entity.Instructor;
import com.aurionpro.model.entity.InstructorDetails;
import com.aurionpro.model.entity.Student;
import com.aurionpro.model.entity.StudentDetails;


public class CreateCourseStudent {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class)
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(StudentDetails.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		Session currentSession = factory.getCurrentSession();
		try {
			currentSession.beginTransaction();
			
			Student student1  = new Student("xyz", "xyz", "xyz@gmail.com");
//			Student student2  = new Student("aaa", "aaa", "aaa@gmail.com");
			
			
			Course course1 = new Course("SSS");
			Course course2 = new Course("SAS");

			currentSession.save(course1);
			currentSession.save(course2);
			
			course1.addStudent(student1);
			course2.addStudent(student1);
			
			currentSession.save(student1);
//			currentSession.save(student2);
			
			
//			Student student = currentSession.get(Student.class, 10);
//			Course course1 = currentSession.get(Course.class, 1);
//			Course course2 = currentSession.get(Course.class, 2);
//			Course course3 = currentSession.get(Course.class, 3);
//			
//			course1.addStudent(student);
//			course2.addStudent(student);
//			course3.addStudent(student);
//			currentSession.save(student);
			
			currentSession.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			currentSession.close();
			factory.close();
		}
		
	}
}
