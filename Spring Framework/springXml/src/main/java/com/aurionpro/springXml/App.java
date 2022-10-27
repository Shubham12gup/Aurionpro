package com.aurionpro.springXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/resource/applicationContext.xml");
    	
    	CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);
        System.out.println(cricketCoach.getTrainingDetails());
        System.out.println(cricketCoach.getDiet());
        System.out.println(cricketCoach.getName());
        System.out.println(cricketCoach.getCountry());
        
//    	Coach cricketCoach2 = context.getBean("cricketCoach", Coach.class);
//    	System.out.println(cricketCoach1 == cricketCoach2);
    	
        System.out.println("--------------------------------------------------");
        Coach footballCoach = context.getBean("footballCoach", Coach.class);
        System.out.println(footballCoach.getTrainingDetails());
        System.out.println(footballCoach.getDiet());
        
        context.close();
    }
}
