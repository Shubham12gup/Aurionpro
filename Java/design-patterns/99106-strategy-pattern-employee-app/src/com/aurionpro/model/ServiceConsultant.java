package com.aurionpro.model;

public class ServiceConsultant implements IRole {

	@Override
	public String description() {
		return "I am a Service Consultant";
	}

	@Override
	public String responsibility() {
		return "review code";
	}

}
