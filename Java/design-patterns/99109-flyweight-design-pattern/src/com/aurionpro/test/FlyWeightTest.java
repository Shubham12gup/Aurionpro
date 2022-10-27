package com.aurionpro.test;

import com.aurionpro.model.CircleFactory;
import com.aurionpro.model.ColorCircle;

public class FlyWeightTest {

	private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

	public static void main(String[] args) {

		for (int i = 0; i < 10; ++i) {
			ColorCircle circle = (ColorCircle) CircleFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
			System.out.println(circle.hashCode());
		}
	}

	private static String getRandomColor() {

		return colors[(int) (Math.random() * colors.length)];
	}

	private static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}
}
