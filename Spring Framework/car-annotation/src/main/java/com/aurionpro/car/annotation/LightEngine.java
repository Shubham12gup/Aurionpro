package com.aurionpro.car.annotation;

import org.springframework.stereotype.Component;

@Component
public class LightEngine implements Engine {

	@Override
	public String getEngine() {
		return "Light weight engine.";
	}

	

}
