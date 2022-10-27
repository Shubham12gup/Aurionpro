package com.aurionpro.model;

public class Person {
	private final String name;
	private final int age;
	private final float height;
	private final float weight;
	private final Gender gender;
	
	public Person(String name, int age, float height, float weight, Gender gender) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public Gender getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + ", gender=" + gender + "]";
	}
}
