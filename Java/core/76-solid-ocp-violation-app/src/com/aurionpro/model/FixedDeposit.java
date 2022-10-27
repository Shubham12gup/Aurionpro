package com.aurionpro.model;


public class FixedDeposit {
	public String name;
	public double principal;
	public int duration;
	public FestivalType festival;
	
	public FixedDeposit(String name, double principal, int duration, FestivalType festival) {
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
	public FestivalType getFestival() {
		return festival;
	}

	@Override
	public String toString() {
		return "FixedDeposit [name=" + name + ", principal=" + principal + ", duration=" + duration + ", festival="
				+ festival + "]";
	}
	
	public int getInterestRates() {
		if (festival == FestivalType.Diwali)
			return 10;
		if (festival == FestivalType.Christmas)
			return 20;
		if (festival == FestivalType.Eid)
			return 30;
		if (festival == FestivalType.NewYear)
			return 40;
		if (festival == FestivalType.Other)
			return 6;
		return 0;
	}
	
	public double calculateSimpleInterest() {
		double interest;
		interest = (principal * duration * getInterestRates()) / 100;
		return interest;
	}
	
}
