package com.aurionpro.model;

public class ChineseHotel implements IHotel {

	@Override
	public IMenu getMenu() {
		return new ChineseMenu();
	}

}
