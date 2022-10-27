package com.aurionpro.model;

public class WheelAlign extends CarDecorator {

	public WheelAlign(ICarService carObj) {
		super(carObj);
	}

	@Override
	public double getCost() {
		return 500 + super.getCost();
	}

	@Override
	public String getServiceDetails() {
		return super.getServiceDetails() + "Wheel Align\n";
	}

}
