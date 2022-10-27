package com.aurionpro.model;

public class DBLogger implements ILogType{
	public void log(String err) {
		System.out.println("Logged to DB " + err);
	}
}
