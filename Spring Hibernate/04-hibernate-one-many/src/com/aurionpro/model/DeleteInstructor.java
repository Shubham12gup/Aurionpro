package com.aurionpro.model;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aurionpro.model.entity.Course;
import com.aurionpro.model.entity.Instructor;
import com.aurionpro.model.entity.InstructorDetails;

public class DeleteInstructor {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();

		try {
			Session currentSession = factory.getCurrentSession();
			currentSession.beginTransaction();

			Instructor instructor = currentSession.get(Instructor.class, 10);
			System.out.println(instructor);

			List<Course> courses = instructor.getCourses();
			for (Course c : courses) {
				c.setInstructor(null);
			}
			currentSession.delete(instructor);

			currentSession.getTransaction().commit();

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}

	}
}
