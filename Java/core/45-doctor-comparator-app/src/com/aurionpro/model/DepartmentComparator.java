package com.aurionpro.model;

import java.util.Comparator;

public class DepartmentComparator implements Comparator<Doctor> {
	
	@Override
	public int compare(Doctor doc1, Doctor doc2) {
		return doc1.getDepartment().compareToIgnoreCase(doc2.getDepartment());
	}

}
