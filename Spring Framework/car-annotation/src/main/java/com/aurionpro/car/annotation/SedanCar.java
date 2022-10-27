package com.aurionpro.car.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SedanCar implements Car {

	private Engine engine;

	@Value("${sedanCar.manufacturing.Country}")
	private String country;

	@Autowired
	public SedanCar(@Qualifier("lightEngine") Engine engine) {
		super();
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
	
	@PostConstruct
	public void doInit() {
		System.out.println("This is init");
	}
	
	@PreDestroy
	public void doDestroy() {
		System.out.println("This is destroy");
	}

}
