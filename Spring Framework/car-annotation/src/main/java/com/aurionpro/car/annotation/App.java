package com.aurionpro.car.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/resource/applicationContext.xml");
    	
    	SedanCar sedanCar = context.getBean("sedanCar", SedanCar.class);
    	System.out.println(sedanCar.getCarColor());
    	System.out.println(sedanCar.getCarPrice());
    	System.out.println(sedanCar.getEngine());
    	System.out.println(sedanCar.getCountry());
    	
    	context.close();
    	
    
    }
}
