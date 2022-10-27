package com.aurionpro.test;

import com.aurionpro.model.GoldenHat;
import com.aurionpro.model.ProminentHat;
import com.aurionpro.model.RibbonHat;
import com.aurionpro.model.StandardHat;

public class HatDecoratorTest {

	public static void main(String[] args) {
		StandardHat standardHat = new StandardHat();

		GoldenHat golden = new GoldenHat(standardHat);
		
		System.out.println(golden.getName());
		System.out.println(golden.getDescription());
		System.out.println(golden.getPrice());
		System.out.println("--------------------------------");
		
		ProminentHat prominentHat = new ProminentHat();
		
		GoldenHat goldenDec = new GoldenHat(prominentHat);
		RibbonHat ribbon = new RibbonHat(goldenDec);
		
		System.out.println(ribbon.getName());
		System.out.println(ribbon.getDescription());
		System.out.println(ribbon.getPrice());
		
	}

}
