package com.aurionpro.model;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class UpdateStudent {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.buildSessionFactory();
		
		try {
			Session currentSession = factory.getCurrentSession();
			currentSession.beginTransaction();
			
			//Update using setters
//			Student student = currentSession.get(Student.class, 4);
//			student.setFirstName("Laxman");
			
//			currentSession.createQuery("update Student s set s.email='laxman@gmail.com' where id=4").executeUpdate();
			
			//Update using prepared statement
			Query sql = currentSession.createQuery("update Student s set s.lastName=:param1 where id=:param2");
			sql.setParameter("param1", "Gaikwad");
			sql.setParameter("param2", 2);
			sql.executeUpdate();
			currentSession.getTransaction().commit();
			
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
		
	}
}
