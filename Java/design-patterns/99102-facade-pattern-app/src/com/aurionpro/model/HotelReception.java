package com.aurionpro.model;

public class HotelReception {

	public void getIndianMenu() {
		IHotel indianHotel = new IndianHotel();
		IMenu indianMenu = indianHotel.getMenu();
		indianMenu.showMenu();
	}
	
	public void getChineseMenu() {
		IHotel chineseHotel = new ChineseHotel();
		IMenu chineseMenu = chineseHotel.getMenu();
		chineseMenu.showMenu();
	}
	
	public void getItalianMenu() {
		IHotel italianHotel = new ItalianHotel();
		IMenu italianMenu = italianHotel.getMenu();
		italianMenu.showMenu();
	}

}
