package com.aurionpro.model;

public class AutomobileFactory {
	
	public IAutomobile makeAutoMobile(AutoType auto) {
		if (auto == AutoType.BMW)
			return new BMW();
		if (auto == AutoType.MARUTI)
			return new Maruti();
		if (auto == AutoType.TESLA)
			return new Tesla();
		return null;
	}
	
}
