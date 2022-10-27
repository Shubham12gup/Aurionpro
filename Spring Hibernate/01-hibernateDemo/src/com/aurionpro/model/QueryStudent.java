package com.aurionpro.model;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class QueryStudent {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.buildSessionFactory();
		
		Session currentSession = factory.getCurrentSession();
		try {
			currentSession.beginTransaction(); 
			List<Instructor> studentList =  currentSession.createQuery("from Student").getResultList();
			currentSession.getTransaction().commit();
			
			for(Instructor stud: studentList) {
				System.out.println(stud);
			}
			
			System.out.println("-------------------------------------------------------");
			currentSession = factory.getCurrentSession();
			currentSession.beginTransaction();
			List<Instructor> studentList2 = currentSession.createQuery("from Student f where f.firstName ='Ram'").getResultList();
			currentSession.getTransaction().commit();
			
			for(Instructor stud: studentList2) {
				System.out.println(stud);
			}
			System.out.println("-------------------------------------------------------");
			currentSession = factory.getCurrentSession();
			currentSession.beginTransaction();
//			List<Student> studentList3 = currentSession.createQuery("from Student s where s.email like '%@yahoo.com'").getResultList();
			List<Instructor> studentList3 = currentSession.createQuery("from Student s where s.email like '%@gmail.com'").getResultList();
			currentSession.getTransaction().commit();
			
//			System.out.println(studentList3);
			
			for(Instructor stud: studentList3) {
				System.out.println(stud);
			}
			
			System.out.println("-------------------------------------------------------");

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
		
	}
}
