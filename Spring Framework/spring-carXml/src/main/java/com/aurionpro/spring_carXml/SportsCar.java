package com.aurionpro.spring_carXml;

public class SportsCar implements Car {
	
	private Engine engine;
	private String country;
	

	public SportsCar(Engine engine, String country) {
		super();
		this.engine = engine;
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public double getCarPrice() {
		return 1500000;
		
	}

	@Override
	public String getCarColor() {
		return "Red";

	}

	@Override
	public String getEngine() {
		return engine.getEngine();
	}

}
