package com.aurionpro.test;

import com.aurionpro.model.IDisplayable;
import com.aurionpro.model.Monitor;
import com.aurionpro.model.Projector;
import com.aurionpro.model.Television;
import com.aurionpro.model.Advertisement;

public class AdvertisementTest {

	public static void main(String[] args) {
		
		Advertisement obj = new Advertisement();
		
		IDisplayable monitor = new Monitor();
		obj.setDisplayModule(monitor);
		obj.showDisplay();
	
		IDisplayable projector = new Projector();
		obj.setDisplayModule(projector);
		obj.showDisplay();
		
		IDisplayable television = new Television();
		obj.setDisplayModule(television);
		obj.showDisplay();
		
		
	}

}
