package com.aurionpro.model;

public class Circle implements IShape {
	
	public double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

}
