package com.aurionpro.springXml;

public class FootballCoach implements Coach {
	
	private DietService dietService;
	
	
	public FootballCoach(DietService dietService) {
		super();
		this.dietService = dietService;
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
