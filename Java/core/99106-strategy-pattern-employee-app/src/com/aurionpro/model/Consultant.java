package com.aurionpro.model;

public class Consultant implements IRole {

	@Override
	public String description() {
		return "I am consultant";
	}

	@Override
	public String responsibility() {
		return "writes code";
	}

}
