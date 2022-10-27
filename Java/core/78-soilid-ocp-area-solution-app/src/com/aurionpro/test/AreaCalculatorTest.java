package com.aurionpro.test;

import com.aurionpro.model.AreaCalculator;
import com.aurionpro.model.Circle;
import com.aurionpro.model.Rectangle;

public class AreaCalculatorTest {

	public static void main(String[] args) {
		AreaCalculator a1 = new AreaCalculator(new Circle(10));
		System.out.println(a1);
		System.out.println("Area: " + a1.showArea());
		
		AreaCalculator a2 = new AreaCalculator(new Rectangle(10, 20));
		System.out.println(a2);
		System.out.println("Area: " + a2.showArea());
		
	}

}
