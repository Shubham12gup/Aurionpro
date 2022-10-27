package com.aurionpro.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	public int id;
	public String name;
	public double salary;
	public Date doj;
	public String formattedDate;

	DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

	public Employee(int id, String name, double salary, String sDate) {
		this.id = id;
		this.name = name;
		this.salary = salary;

		try {
			this.doj = formatter.parse(sDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.formattedDate = formatter.format(doj);

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", doj=" + doj + ", Formatted date="
				+ formattedDate + "]";
	}

}
