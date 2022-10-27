package com.aurionpro.spring_carXml;

public class SedanCar implements Car {
	
	private String name;
	private Engine engine;
	private String country;
	
	public SedanCar(String name, Engine engine, String country) {
		super();
		this.name = name;
		this.engine = engine;
		this.country = country;
	}
	
	public SedanCar() {
		super();
	}

	
	@Override
	public double getCarPrice() {
		return 500000;
	}

	@Override
	public String getCarColor() {
		return "Silver";
	}

	@Override
	public String getEngine() {
		return engine.getEngine();
	}

	public String getCountry() {
		return country;
	}

	public String getName() {
		return name;
	}
	
	public void doInit() {
		System.out.println("This is init");
	}
	
	public void doDestroy() {
		System.out.println("This is destroy");
	}

	

}
