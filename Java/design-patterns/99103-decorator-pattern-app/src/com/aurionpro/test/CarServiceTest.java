package com.aurionpro.test;

import com.aurionpro.model.CarService;
import com.aurionpro.model.OilChange;
import com.aurionpro.model.PaintCar;
import com.aurionpro.model.WheelAlign;

public class CarServiceTest {

	public static void main(String[] args) {
		CarService car = new CarService();
		
		OilChange carOilChange= new OilChange(car);
		
		WheelAlign wheelAlign = new WheelAlign(carOilChange);
		
		PaintCar paintCar = new PaintCar(wheelAlign);
		
		System.out.println(paintCar.getServiceDetails());
		System.out.println("Total service cost :" + paintCar.getCost());
		
	}

}
