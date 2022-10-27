package com.aurionpro.model;

import java.util.Comparator;

public class FeesComparator implements Comparator<Doctor>{

	@Override
	public int compare(Doctor doc1, Doctor doc2) {
		if(doc1.getFees() == doc2.getFees())
			return 0;
		else if(doc1.getFees() > doc2.getFees())
			return 1;
		else
			return -1;	
	}
}
