package com.aurionpro.model;

public class PaintCar extends CarDecorator{

	public PaintCar(ICarService carObj) {
		super(carObj);
	}
	
	@Override
	public double getCost() {
		return 1000 + super.getCost();
	}

	@Override
	public String getServiceDetails() {
		return super.getServiceDetails() + "Paint Car\n";
	}

}
