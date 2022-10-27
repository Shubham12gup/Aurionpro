package com.aurionpro.model;

public class Doctor implements Comparable<Doctor> {
	private int id;
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
	
	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public double getFees() {
		return fees;
	}

	
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", department=" + department + ", fees=" + fees + "]";
	}

	@Override
	public int compareTo(Doctor doc) {
		return name.compareToIgnoreCase(doc.getName());
	}
	
	
//	@Override
//	public int compareTo(Doctor doc) {
//		if (fees == doc.getFees())
//			return 0;
//		else if (fees > doc.getFees())
//			return 1;
//		else 
//			return -1;
//	}
}
