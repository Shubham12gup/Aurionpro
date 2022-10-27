package com.aurionpro.model;

public class BmwFactory implements IAutomobileFactory {

	static BmwFactory instance;
	
	private BmwFactory() {}
	
	public static BmwFactory getInstance() {
		if (instance == null) {
			instance = new BmwFactory();
		}
		return instance;
	}
	
	@Override
	public IAutomobile makeAutoMobile() {
		return new BMW();
	}

}
