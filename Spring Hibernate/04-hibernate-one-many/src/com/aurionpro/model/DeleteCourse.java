package com.aurionpro.model;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aurionpro.model.entity.Course;
import com.aurionpro.model.entity.Instructor;
import com.aurionpro.model.entity.InstructorDetails;


public class DeleteCourse {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		try {
			Session currentSession = factory.getCurrentSession();
			currentSession.beginTransaction();
			
			Course course = currentSession.get(Course.class, 9);
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
