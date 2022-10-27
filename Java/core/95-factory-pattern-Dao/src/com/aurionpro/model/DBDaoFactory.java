package com.aurionpro.model;

public class DBDaoFactory implements IDaoAbstractFactory {

	@Override
	public IDao createDao(String type) {
		if (type.equalsIgnoreCase("Emp"))
			return new DBEmpDao();
		
		if (type.equalsIgnoreCase("Dept"))
			return new DBEmpDao();
		return null;
	}

}
