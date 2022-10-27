package com.aurionpro.model;

public class Developer implements Employee {
	
	private final String JOB;
	private String skill;
	
	public Developer() {
	    JOB = "Write Code";
	}
	  
	@Override
	public void assignSkill(String skill) {
	    this.skill = skill;
	}

	@Override
	public void task() {
	    System.out.println("Developer with skill: " + this.skill + " with Job: " + JOB);

	}

}
