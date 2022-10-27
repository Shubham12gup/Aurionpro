package com.aurionpro.springClassConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:/resource/coach.properties")
public class FootballCoachConfig {
	
	@Bean
	public DietService weightLossDiet() {
		return new WeightLossDiet();
	}
	
	@Bean
	@Scope("") //setting scope
	public Coach footballCoach() {
		return new FootballCoach(weightLossDiet());
	}
}
