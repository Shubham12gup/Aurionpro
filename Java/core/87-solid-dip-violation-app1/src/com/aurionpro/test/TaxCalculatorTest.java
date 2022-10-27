package com.aurionpro.test;

import com.aurionpro.model.LogType;
import com.aurionpro.model.TaxCalculator;

public class TaxCalculatorTest {

	public static void main(String[] args) {
		TaxCalculator taxCal = new TaxCalculator(LogType.FILE);
		System.out.println(taxCal.calculateTax(1000, 10));
		
	}

}
