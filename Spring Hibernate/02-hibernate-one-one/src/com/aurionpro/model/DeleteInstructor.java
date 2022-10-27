package com.aurionpro.model;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aurionpro.model.entity.Instructor;
import com.aurionpro.model.entity.InstructorDetails;


public class DeleteInstructor {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class)
				.buildSessionFactory();
		
		try {
			Session currentSession = factory.getCurrentSession();
			currentSession.beginTransaction();
			
//			Instructor instructor = currentSession.get(Instructor.class, 6);
//			System.out.println(instructor);
//			currentSession.delete(instructor);
			
			InstructorDetails instructorDetails = currentSession.get(InstructorDetails.class, 5);
			System.out.println(instructorDetails);
			currentSession.delete(instructorDetails);
			
			
			currentSession.getTransaction().commit();

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
		
	}
}
