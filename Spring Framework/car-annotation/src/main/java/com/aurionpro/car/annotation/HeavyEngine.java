package com.aurionpro.car.annotation;

import org.springframework.stereotype.Component;

@Component
public class HeavyEngine implements Engine {

	@Override
	public String getEngine() {
		return "Heavy weight engine.";
	}

}
