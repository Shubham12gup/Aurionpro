package com.aurionpro.springXml;

public class CricketCoach implements Coach {
	
	private DietService dietService;
	private String name;
	private String country;
	
	
	public CricketCoach(DietService dietService, String name, String country) {
		super();
		this.dietService = dietService;
		this.name = name;
		this.country = country;
	}
	
	
//	public CricketCoach() {
//		super();
//		this.dietService = dietService;
//	}

	@Override
	public String getTrainingDetails() {
		return "Practice in net for 2 hours.";
	}

	@Override
	public String getDiet() {
		return dietService.getDiet();
	}


	public String getName() {
		return name;
	}
	

	public String getCountry() {
		return country;
	}
	
	public void doInit() {
		System.out.println("This is init");
	}
	
	public void doDestroy() {
		System.out.println("This is destroy");
	}


}
