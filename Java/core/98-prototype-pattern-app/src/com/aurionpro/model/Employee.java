package com.aurionpro.model;

public abstract class Employee implements Cloneable{
	
	public abstract void performTask();

	public abstract Employee cloneMethod();
	
	
	public Object clone() {
		Object clone = null;
		
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
		
	}
}
