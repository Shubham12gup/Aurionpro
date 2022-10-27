package com.aurionpro.model;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aurionpro.model.entity.Instructor;
import com.aurionpro.model.entity.InstructorDetails;


public class ReadInstructor {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class)
				.buildSessionFactory();
		
		try {
			Session currentSession = factory.getCurrentSession();
			currentSession.beginTransaction();
			InstructorDetails tempInsdetails = currentSession.get(InstructorDetails.class, 5);
			Instructor instructor = tempInsdetails.getInstructor();
			System.out.println(instructor);
			
			
			currentSession.getTransaction().commit();
			
			
			
			
			
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
		
	}
}
