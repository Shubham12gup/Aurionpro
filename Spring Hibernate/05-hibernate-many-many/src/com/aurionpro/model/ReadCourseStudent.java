package com.aurionpro.model;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aurionpro.model.entity.Course;
import com.aurionpro.model.entity.Instructor;
import com.aurionpro.model.entity.InstructorDetails;
import com.aurionpro.model.entity.Student;
import com.aurionpro.model.entity.StudentDetails;

public class ReadCourseStudent {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class).addAnnotatedClass(Student.class)
				.addAnnotatedClass(StudentDetails.class).addAnnotatedClass(Course.class).buildSessionFactory();

		try {
			Session currentSession = factory.getCurrentSession();
			currentSession.beginTransaction();
			Course course = currentSession.get(Course.class, 1);
			List<Student> students = course.getStudents();

			System.out.println("Course Name: " + course.getCourseName());
			for (Student student : students) {
				System.out.println(student);
			}
			
			
			System.out.println("--------------------------------------------------------------------------------------");
			
			Student student = currentSession.get(Student.class, 12);
			List<Course> courses = student.getCourses();
			
			System.out.println("Student Name: " + student.getFirstName());
			for (Course c: courses) {
				System.out.println(c);
			}
			
			currentSession.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}

	}
}
