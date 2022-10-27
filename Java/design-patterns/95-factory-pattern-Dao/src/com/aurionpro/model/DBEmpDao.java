package com.aurionpro.model;

public class DBEmpDao implements IDao {

	@Override
	public void save() {
		System.out.println("Saving Employee data to DB");
	}

}
