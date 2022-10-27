package com.aurionpro.model;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ReadStudent {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.buildSessionFactory();
		
		try {
			Session currentSession = factory.getCurrentSession();
			Instructor student = new Instructor("abc", "xyz", "abc@gmail.com");
			currentSession.beginTransaction();
			currentSession.save(student);
			currentSession.getTransaction().commit();
			
			System.out.println("Student data added"+student.getId());
			
			currentSession = factory.getCurrentSession();
			currentSession.beginTransaction();
			Instructor tempStudent = currentSession.get(Instructor.class, student.getId());
			System.out.println(tempStudent);
			
			currentSession.getTransaction().commit();
			
			
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
		
	}
}
