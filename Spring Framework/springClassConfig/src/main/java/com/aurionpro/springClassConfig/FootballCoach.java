package com.aurionpro.springClassConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class FootballCoach implements Coach {

	private DietService dietService;
	
	@Value("${footballCoach.country}")
	private String country; 

	@Autowired
	public FootballCoach(DietService dietService) {
		super();
		this.dietService = dietService;
		this.country = country;
	}

	public DietService getDietService() {
		return dietService;
	}
	
	public String getCountry() {
		return country;
	}

	@Override
	public String getTrainingDetails() {
		return "Play football for 2 hours.";
	}

	@Override
	public String getDiet() {
		return dietService.getDiet();
	}

}
