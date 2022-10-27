package com.aurionpro.test;

import com.aurionpro.model.*;

public class RectangleTest {
	
	public static void main(String[] args) {
		Rectangle smallRectangle = new Rectangle();
		getDetails(smallRectangle, 10, 20);
		printAreaDetails(smallRectangle);
		
		System.out.println("-----------------------------");
		Rectangle bigRectangle = new Rectangle(); 
		getDetails(bigRectangle, 100, 20);
		printAreaDetails(bigRectangle);
		
	}

	private static void getDetails(Rectangle rectangle, double height, double width) {
		rectangle.setHeight(height);
		rectangle.setWidth(width);
	}
	private static void printAreaDetails(Rectangle rectangle) {
		System.out.println("Height : " +rectangle.getHeight());
		System.out.println("Width : " +rectangle.getWidth());
		System.out.println("Area of rectangle = "+ rectangle.calculateArea());

	}

}
