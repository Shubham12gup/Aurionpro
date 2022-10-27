package com.aurionpro.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/resource/applicationContext.xml");
    	
    	Coach cricketCoach = context.getBean("cricketCoach", Coach.class);
    	
    	System.out.println(cricketCoach.getTrainingDetails()); 
    	System.out.println(cricketCoach.getDiet()); 
    
    }
}
