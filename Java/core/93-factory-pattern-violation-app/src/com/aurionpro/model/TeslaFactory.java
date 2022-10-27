package com.aurionpro.model;

public class TeslaFactory implements IAutomobileFactory {

	static TeslaFactory instance;
	
	private TeslaFactory() {}

	public static TeslaFactory getInstance() {
		if (instance == null) {
			instance = new TeslaFactory();
		}
		return instance;
	}

	@Override
	public IAutomobile makeAutoMobile() {
		return new Tesla();
	}

}
