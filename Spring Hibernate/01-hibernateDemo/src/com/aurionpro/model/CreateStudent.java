package com.aurionpro.model;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CreateStudent {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.buildSessionFactory();
		
		try {
			Session currSession = factory.getCurrentSession();
			Instructor student = new Instructor("Rahul", "Kadam", "rahul@yahoo.com");
			currSession.beginTransaction();
			currSession.save(student);
			currSession.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
		
	}
}
