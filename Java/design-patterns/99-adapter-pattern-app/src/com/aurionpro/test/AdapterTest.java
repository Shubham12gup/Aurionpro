package com.aurionpro.test;

import java.util.List;

import com.aurionpro.model.Biscuit;
import com.aurionpro.model.Hat;
import com.aurionpro.model.HatAdapter;
import com.aurionpro.model.IItem;
import com.aurionpro.model.Pepsi;
import com.aurionpro.model.ShoppingCart;

public class AdapterTest {

	public static void main(String[] args) {
		Hat hat = new Hat("Red Hat", "Round red hat", 500, 0.10);

		HatAdapter hatAdapter = new HatAdapter(hat);
		Biscuit biscuit = new Biscuit("ParleG", 10);
		Pepsi pepsi = new Pepsi("Pepsi", 50);

		ShoppingCart cart = new ShoppingCart();
		cart.addItemToCart(biscuit);
		cart.addItemToCart(hatAdapter);
		cart.addItemToCart(pepsi);

		displayCartItems(cart);
		System.out.println("Cart total" + cart.getTotalPrice());
	}

	private static void displayCartItems(ShoppingCart cart) {
		List<IItem> cartList = cart.getItems();
		for (IItem item : cartList) {
			System.out.println("Item Name " + item.getName());
			System.out.println("Item Price " + item.getPrice());
			System.out.println("------------------------------------");

		}
	}

}
