package com.aurionpro.model;

public class TechLead implements IRole{

	@Override
	public String description() {
		return "I am tech lead";
	}

	@Override
	public String responsibility() {
		return "assign work";
	}

}
