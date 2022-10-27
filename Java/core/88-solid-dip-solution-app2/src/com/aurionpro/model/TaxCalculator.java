package com.aurionpro.model;

public class TaxCalculator {
	
	public ILogType logger;

	public TaxCalculator(ILogType logger) {
		super();
		this.logger = logger;
	}
	
	public double calculateTax(int amount, int rate) {
		double tax = 0;
		try {
			tax = amount / rate;
		}
		catch (Exception e) {
			logger.log("An error ocurred " + e.getMessage());
		}
		return tax;
	}
}
