package com.aurionpro.model;

public class LaptopBuilder {
	
	Laptop laptop;

	public LaptopBuilder() {
		super();
		laptop = new Laptop();
	}
	
	public LaptopBuilder addRam(String ram){
		laptop.setRam(ram);
		return this;
	}
	
	public LaptopBuilder addHdd(String hdd){
		laptop.setHdd(hdd);
		return this;
	}
	
	public LaptopBuilder addKeyBoard(String keyboard) {
		laptop.setKeyboard(keyboard);
		return this;

	}
	
	public LaptopBuilder addMouse(String mouse) {
		laptop.setMouse(mouse);
		return this;

	}
	
	public LaptopBuilder addTouchScreen(boolean bool) {
		laptop.setTouchScreen(bool);
		return this;
	}
	
	public Laptop getLaptop() {
		return laptop;
	}

	
}
