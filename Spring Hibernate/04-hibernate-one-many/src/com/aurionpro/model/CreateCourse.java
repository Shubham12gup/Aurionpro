package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aurionpro.model.entity.Course;
import com.aurionpro.model.entity.Instructor;
import com.aurionpro.model.entity.InstructorDetails;


public class CreateCourse {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		Session currentSession = factory.getCurrentSession();
		try {
			currentSession.beginTransaction();
			Instructor instructor = currentSession.get(Instructor.class, 10);
//			Instructor instructor2 = currentSession.get(Instructor.class, 2);
			
			Course course1 = new Course("SSS");
			Course course2 = new Course("SAS");
			
			instructor.addCourse(course1);
			instructor.addCourse(course2);
			
			currentSession.save(course1);
			currentSession.save(course2);
			
//			Instructor inst = new Instructor("xyz", "Ash", "abc@gmail.com");
//			InstructorDetails instructorDetails = new InstructorDetails("abc", "abc");
//			inst.setInstructorDetails(instructorDetails);
//			
//			List<Course> courses = new ArrayList<Course>();
//			
//			Course course3 = new Course("C#");
//			Course course4 = new Course("PHP");
//			
//			courses.add(course3);
//			courses.add(course4);
//			
//			inst.setCourses(courses);
//			
//			currentSession.save(courses);
//			currentSession.save(inst);
			
			currentSession.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			currentSession.close();
			factory.close();
		}
		
	}
}
