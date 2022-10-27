package com.aurionpro.springClassConfig;

import org.springframework.stereotype.Component;


public class WeightLossDiet implements DietService {

	@Override
	public String getDiet() {
		return "Reduce fats diet";
	}

}
