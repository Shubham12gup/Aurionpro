package com.aurionpro.springClassConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppFootball 
{
    public static void main( String[] args )
    {
    	
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CricketCoachConfig.class);
    	
    	FootballCoach footballCoach = context.getBean("footballCoach", FootballCoach.class);
    	FootballCoach footballCoach1 = context.getBean("footballCoach", FootballCoach.class);
    	System.out.println(footballCoach.getTrainingDetails());
    	System.out.println(footballCoach.getDiet());
    	System.out.println(footballCoach.getCountry());
    	System.out.println(footballCoach==footballCoach1);//scope set to default singleton
    	context.close();
    
    
    
    }
}
