package com.aurionpro.model;

public class XMLDaoFactory implements IDaoAbstractFactory {

	@Override
	public IDao createDao(String type) {
		if (type.equalsIgnoreCase("Emp"))
			return new XMLEmpDao();
		
		if (type.equalsIgnoreCase("Dept"))
			return new XMLDeptDao();
		return null;
	}

}
