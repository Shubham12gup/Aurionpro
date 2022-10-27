package com.aurionpro.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class WeightGainDiet implements DietService {

	@Override
	public String getDiet() {
		return "Weight gain diet";
	}

}
