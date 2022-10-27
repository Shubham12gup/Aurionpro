package com.aurionpro.model;

public class AreaCalculator {
	public IShape shape;

	public AreaCalculator(IShape shape) {
		super();
		this.shape = shape;
	}
	
	@Override
	public String toString() {
		return "AreaCalculator [shape=" + shape + "]";
	}

	public double showArea() {
		return shape.getArea();
	}
	
	
}
