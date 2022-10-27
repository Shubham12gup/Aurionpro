package com.aurionpro.springClassConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppCricket 
{
    public static void main( String[] args )
    {
    	
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CricketCoachConfig.class);
    	
    	Coach cricketCoach = context.getBean("cricketCoach", Coach.class);
    	System.out.println(cricketCoach.getTrainingDetails());
    	System.out.println(cricketCoach.getDiet());
    	
    	context.close();
    
    
    
    }
}
