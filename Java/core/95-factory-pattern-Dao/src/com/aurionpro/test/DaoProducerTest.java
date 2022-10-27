package com.aurionpro.test;

import com.aurionpro.model.DaoFactoryProducer;
import com.aurionpro.model.IDao;
import com.aurionpro.model.IDaoAbstractFactory;

public class DaoProducerTest {

	public static void main(String[] args) {
		IDaoAbstractFactory daf = DaoFactoryProducer.produce("XML");
		IDao dao = daf.createDao("Emp");
		dao.save();

		IDaoAbstractFactory daf1 = DaoFactoryProducer.produce("DB");
		IDao dao1 = daf1.createDao("Emp");
		dao1.save();
		
	}

}
