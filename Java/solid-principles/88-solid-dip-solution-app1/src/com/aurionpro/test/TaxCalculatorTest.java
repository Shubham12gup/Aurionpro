package com.aurionpro.test;

import com.aurionpro.model.DBLogger;
import com.aurionpro.model.FileLogger;
import com.aurionpro.model.TaxCalculator;

public class TaxCalculatorTest {

	public static void main(String[] args) {
		TaxCalculator taxCal = new TaxCalculator(new DBLogger());
		System.out.println("Tax: " + taxCal.calculateTax(1000, 0));

		TaxCalculator taxCalulator = new TaxCalculator(new FileLogger());
		System.out.println("Tax: " + taxCalulator.calculateTax(1000, 20));

	}

}
