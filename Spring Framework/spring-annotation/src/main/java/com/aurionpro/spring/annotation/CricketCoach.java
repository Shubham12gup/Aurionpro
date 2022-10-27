package com.aurionpro.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	@Autowired
	@Qualifier("weightGainDiet")//Field injection
	private DietService dietService;

//	@Autowired
//	
//	public CricketCoach(@Qualifier("weightLossDiet") DietService dietService) {//Constructor Injection
//		super();
//		this.dietService = dietService;
//	}

	public CricketCoach() {
		super();
	}

//	@Autowired 
//	@Qualifier("weightGainDiet")//Method injection
//	public void setDietService(DietService dietService) {
//		this.dietService = dietService;
//	}

	@Override
	public String getTrainingDetails() {
		return "Practice cricket for 2 hours.";
	}

	@Override
	public String getDiet() {
		return dietService.getDiet();
	}

}
