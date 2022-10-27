package com.aurionpro.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aurionpro.model.entity.Student;
import com.aurionpro.model.entity.StudentDetails;


public class CreateStudent {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(StudentDetails.class)
				.buildSessionFactory();
		
		Session currentSession = factory.getCurrentSession();
		try {
			currentSession.beginTransaction();
			StudentDetails studentDetails = new StudentDetails("github", "linkedin");
			Student student = new Student("abc", "abc", "abc@gmail.com");
			studentDetails.setStudent(student);
			currentSession.save(studentDetails);
			
//			student.setStudentDetails(studentDetails);
//			currentSession.save(student);
			
			currentSession.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			factory.close();
		}
		
	}
}
