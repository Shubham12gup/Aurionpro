package com.aurionpro.model;

public class Doctor {
	private int id ;
	private String name;
	private String department;
	private double fees;
	
	public Doctor(int id, String name, String department, double fees) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.fees = fees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", department=" + department + ", fees=" + fees + "]";
	}
}