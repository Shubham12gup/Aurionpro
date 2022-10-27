package com.aurionpro.spring_carXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/resource/applicationContext.xml");

		SedanCar sedanCar = context.getBean("sedanCar", SedanCar.class);
		SedanCar sedanCar1 = context.getBean("sedanCar", SedanCar.class);

		System.out.println(sedanCar == sedanCar1);

		System.out.println("Name: " + sedanCar.getName());
		System.out.println("Color: " + sedanCar.getCarColor());
		System.out.println("Price: " + sedanCar.getCarPrice());
		System.out.println("Engine Type: " + sedanCar.getEngine());
		System.out.println("Country: " + sedanCar.getCountry());

		System.out.println("------------------------------");

		SportsCar sportsCar = context.getBean("sportsCar", SportsCar.class);
		SportsCar sportsCar1 = context.getBean("sportsCar", SportsCar.class);
		
		System.out.println(sportsCar == sportsCar1);
		
		System.out.println("Color:" + sportsCar.getCarColor());
		System.out.println("Price: " + sportsCar.getCarPrice());
		System.out.println("Engine: " + sportsCar.getEngine());
		System.out.println("Country: " + sportsCar.getCountry());
		
		context.close();

	}
}
