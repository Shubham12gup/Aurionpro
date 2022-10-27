package com.aurionpro.test;

import com.aurionpro.model.Laptop;
import com.aurionpro.model.LaptopBuilder;

public class LaptopTest {

	public static void main(String[] args) {
		Laptop laptop = new LaptopBuilder()
				.addHdd("1 TB")
				.addRam("12 GB")
				.addKeyBoard("Zebronics")
				.addMouse("Zebronics")
				.addTouchScreen(true)
				.getLaptop();
		
		System.out.println(laptop);
	}

}
