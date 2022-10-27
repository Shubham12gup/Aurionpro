package com.aurionpro.model;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aurionpro.model.entity.Course;
import com.aurionpro.model.entity.Instructor;
import com.aurionpro.model.entity.InstructorDetails;


public class CreateInstructor {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		try {
			Session currentSession = factory.getCurrentSession();
			Instructor instructor = new Instructor("Sahil", "Kadam", "sahil@yahoo.com");
			InstructorDetails instructorDetails = new InstructorDetails("sahil@Linkedin", "sahil@github");
			instructor.setInstructorDetails(instructorDetails);
			
			currentSession.beginTransaction();
			currentSession.save(instructor);
			currentSession.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
		
	}
}
