package com.aurionpro.test;

import com.aurionpro.model.Image;
import com.aurionpro.model.ProxyImage;

public class ProxyImageTest {

	public static void main(String[] args) {
		Image image = new ProxyImage("Sun.jpg");

		// image will be loaded from disk
		image.display();
		System.out.println("");

		// image will not be loaded from disk
		image.display();
	}
}
