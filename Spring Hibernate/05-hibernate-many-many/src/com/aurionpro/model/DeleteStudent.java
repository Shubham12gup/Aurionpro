package com.aurionpro.model;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aurionpro.model.entity.Course;
import com.aurionpro.model.entity.Instructor;
import com.aurionpro.model.entity.InstructorDetails;
import com.aurionpro.model.entity.Student;
import com.aurionpro.model.entity.StudentDetails;


public class DeleteStudent {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class)
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(StudentDetails.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		try {
			Session currentSession = factory.getCurrentSession();
			currentSession.beginTransaction();
			
//			Student student = currentSession.get(Student.class, 12);
//			System.out.println(student);
//			currentSession.delete(student);
			
			Course course = currentSession.get(Course.class, 3);
			System.out.println(course);
			currentSession.delete(course);
			
			
			currentSession.getTransaction().commit();

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
		
	}
}
