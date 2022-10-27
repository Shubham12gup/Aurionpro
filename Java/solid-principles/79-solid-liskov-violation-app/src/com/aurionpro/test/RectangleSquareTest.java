package com.aurionpro.test;

import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Square;

public class RectangleSquareTest {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(10, 20);
		if (isRectangle(rect)) {
			System.out.println("Object is a rectangle");
		}
		else
			System.out.println("Object is not a rectangle");
		System.out.println(rect);
		System.out.println(rect.CalculateArea());
		
		System.out.println("------------------------------------");
		
		Square square = new Square(10);
		if (isRectangle(square)) {
			System.out.println("Object is a rectangle");
		}
		else
			System.out.println("Object is not a rectangle");
		System.out.println(square);
		System.out.println(square.CalculateArea());

	}
	
	public static boolean isRectangle(Rectangle rectObj) {
		
		double previous = rectObj.getBreadth();
		rectObj.setLength(30);
		double after = rectObj.getBreadth();
		return previous == after;
	}
}
