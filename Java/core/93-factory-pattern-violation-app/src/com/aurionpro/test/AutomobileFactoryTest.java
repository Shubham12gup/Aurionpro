package com.aurionpro.test;

import com.aurionpro.model.BmwFactory;
import com.aurionpro.model.IAutomobile;
import com.aurionpro.model.IAutomobileFactory;
import com.aurionpro.model.MarutiFactory;
import com.aurionpro.model.TeslaFactory;

public class AutomobileFactoryTest {

	public static void main(String[] args) {

		IAutomobileFactory bmwFactory = BmwFactory.getInstance();
		System.out.println(bmwFactory.hashCode()); //Checking hashcode
		IAutomobile bmw = bmwFactory.makeAutoMobile();
		bmw.start();
		bmw.stop();
		
		IAutomobileFactory bmwFactory1 = BmwFactory.getInstance();
		IAutomobile bmw1 = bmwFactory1.makeAutoMobile();
		System.out.println(bmwFactory1.hashCode()); //Checking hashcode
		bmw1.start();
		bmw1.stop();
		
		
		
		IAutomobileFactory teslaFactory = TeslaFactory.getInstance();
		IAutomobile tesla = teslaFactory.makeAutoMobile();
		tesla.start();
		tesla.stop();
		
		IAutomobileFactory marutiFactory = MarutiFactory.getInstance();
		IAutomobile maruti = marutiFactory.makeAutoMobile();
		maruti.start();
		maruti.stop();
		
	}

}
