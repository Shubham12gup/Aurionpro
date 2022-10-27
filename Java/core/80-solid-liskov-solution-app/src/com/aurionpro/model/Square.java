package com.aurionpro.model;

public class Square implements IShape{
	
	public double side;
	public Square(double side) {
		this.side = side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

	public double CalculateArea() {
		return side * side;
	}


}
