package com.aurionpro.model;

public class StringUtil {
	
	public String truncateAInFirst2Place(String str) {
		if (str.charAt(0) == 'A' && str.charAt(1) == 'A')
			return str.substring(2);
		if (str.charAt(0) == 'A')
			return str.substring(1);
		if (str.charAt(1) == 'A')
			return str.substring(0,1) + str.substring(2);
		
		return str;
	}
	
	public boolean fisrtAndLast2CharAreEqual(String str) {
		if (str.substring(0, 2).equals(str.substring(str.length()-2, str.length())))
			return true;
		return false;
	}
}
