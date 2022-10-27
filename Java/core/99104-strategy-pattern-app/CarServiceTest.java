package com.aurionpro.model;

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
