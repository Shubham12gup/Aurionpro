package com.aurionpro.model;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aurionpro.model.entity.Student;
import com.aurionpro.model.entity.StudentDetails;

public class ReadStudent {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.addAnnotatedClass(StudentDetails.class).buildSessionFactory();

		try {
			Session currentSession = factory.getCurrentSession();
			currentSession.beginTransaction();
			Student student = currentSession.get(Student.class, 2);
			StudentDetails studentDetails = student.getStudentDetails();

			System.out.println(studentDetails);

			currentSession.getTransaction().commit();

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}

	}
}
