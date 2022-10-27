package com.aurionpro.test;

import com.aurionpro.model.IShape;
import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Square;

public class RectangleSquareTest {

	public static void main(String[] args) {
		IShape rect = new Rectangle(10, 20);
		System.out.println(rect);
		System.out.println(rect.CalculateArea());
		
		System.out.println("------------------------------------");
		
		Square square = new Square(10);
		System.out.println(square);
		System.out.println(square.CalculateArea());

	}

}
