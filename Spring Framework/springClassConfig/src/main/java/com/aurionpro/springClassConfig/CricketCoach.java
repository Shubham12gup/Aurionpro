package com.aurionpro.springClassConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	
	private DietService dietService;
	
	@Autowired
	public CricketCoach(DietService dietService) {
		super();
		this.dietService = dietService;
	}

	public String getTrainingDetails() {
		return "Practice in net for 2 hours.";
	}

	@Override
	public String getDiet() {
		return dietService.getDiet();
	}
	
}
