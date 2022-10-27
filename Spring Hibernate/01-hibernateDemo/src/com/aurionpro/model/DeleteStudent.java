package com.aurionpro.model;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class DeleteStudent {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.buildSessionFactory();
		
		try {
			Session currentSession = factory.getCurrentSession();
			currentSession.beginTransaction();
			Instructor student = currentSession.get(Instructor.class, 1);
			System.out.println(student);
			currentSession.delete(student);
			
			
//			Query sql = currentSession.createQuery("delete Student s where s.id=:param1");
//			sql.setParameter("param1", 6);
//			sql.executeUpdate();
//			
			currentSession.getTransaction().commit();

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
		
	}
}
