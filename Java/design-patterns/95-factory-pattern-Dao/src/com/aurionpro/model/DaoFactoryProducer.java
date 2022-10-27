package com.aurionpro.model;

public class DaoFactoryProducer {

	static DaoFactoryProducer instance;

	private DaoFactoryProducer() {}

	public static DaoFactoryProducer getInstance() {
		if (instance == null) {
			instance = new DaoFactoryProducer();
		}
		return instance;
	}

	public static IDaoAbstractFactory produce(String factoryTpye) {
		if (factoryTpye.equalsIgnoreCase("XML"))
			return new XMLDaoFactory();

		if (factoryTpye.equalsIgnoreCase("DB"))
			return new DBDaoFactory();

		return null;
	}
}
