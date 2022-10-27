package com.aurionpro.model;
public class FixedDeposit {
	public String name;
	public double principal;
	public int duration;
	public IFestival festival;
	
	public FixedDeposit(String name, double principal, int duration, IFestival festival) {
		super();
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.festival = festival;
	}
	
	public String getName() {
		return name;
	}
	public double getPrincipal() {
		return principal;
	}
	public int getDuration() {
		return duration;
	}
	public IFestival getFestival() {
		return festival;
	}

	@Override
	public String toString() {
		return "FixedDeposit [name=" + name + ", principal=" + principal + ", duration=" + duration + ", festival="
				+ festival.getClass().getSimpleName() + "]";
	}
	
	public double calculateSimpleInterest() {
		double interest;
		interest = (principal * duration * festival.getInterestRates()) / 100;
		return interest;
	}
}
