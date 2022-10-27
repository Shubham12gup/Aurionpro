package com.aurionpro.test;

import com.aurionpro.model.BMI;
import com.aurionpro.model.Gender;
import com.aurionpro.model.Person;

public class PersonTest {

	public static void main(String[] args) {

		Person[] person = { 
				new Person("Rammy", 30, 150, 50, Gender.MALE),
				new Person("Isha", 23, 100, 60, Gender.FEMALE) };
		// Person person1 = new Person("Rammy", 30, 150, 50, Gender.MALE);

		for (Person p : person) {
			printPersonBodyTypeDetails(p);
			System.out.println("-------------------------------");
		}

		// Person person2 = new Person("Isha", 23, 100, 60, Gender.FEMALE);
		// printPersonBodyTypeDetails(person2);
	}

	private static void printPersonBodyTypeDetails(Person person) {
		System.out.println(person);
		BMI bmi = new BMI(person);
		System.out.format("BMI Index: %.2f", bmi.getBmi());
		System.out.println("\nBody Type: " + bmi.getBodyType());

	}

}
