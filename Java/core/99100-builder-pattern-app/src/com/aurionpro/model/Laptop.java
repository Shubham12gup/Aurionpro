package com.aurionpro.model;

public class Laptop {
	
	String ram;
	String hdd;
	String keyboard;
	String mouse;
	boolean touchScreen;
	
	
//	public Laptop(String ram, String hdd, String keyboard, String mouse, boolean touchScreen) {
//		super();
//		this.ram = ram;
//		this.hdd = hdd;
//		this.keyboard = keyboard;
//		this.mouse = mouse;
//		this.touchScreen = touchScreen;
//	}
	public String getRam() {
		return ram;
	}
	
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getHdd() {
		return hdd;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	public String getKeyboard() {
		return keyboard;
	}
	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}
	public String getMouse() {
		return mouse;
	}
	public void setMouse(String mouse) {
		this.mouse = mouse;
	}
	public boolean isTouchScreen() {
		return touchScreen;
	}
	public void setTouchScreen(boolean touchScreen) {
		this.touchScreen = touchScreen;
	}
	
	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", hdd=" + hdd + ", keyboard=" + keyboard + ", mouse=" + mouse + ", touchScreen="
				+ touchScreen + "]";
	}
	
}
