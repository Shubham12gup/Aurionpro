package com.aurionpro.model;

public class BMI {
	Person person;
	float bmi;

	public BMI(Person person) {
		this.person = person;
		this.bmi = calculateBmi();
	}
	
	public float getBmi() {
		return bmi;
	}

	private float calculateBmi() {
		float bmiValue;
		float ht = person.getHeight()/100;
		bmiValue = person.getWeight()/(ht * ht);
		return bmiValue;
	}
	
	public String getBodyType() {
		float bmi = getBmi();		
		if (bmi<18.5)
			return "Under weight";
		if (bmi>=18.5 && bmi<=24.99)
			return "Normal Range";
		if (bmi >= 25.0 && bmi<= 29.99)
			return "Over Weight";
		return "Obese";
	}

}
