package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CustomerTest {

	Product parleG = new Product(101, "Parle-G", 20, 10);

	@Test
	void testCalculatePriceAfterDiscount_check() {
		double expected = 18;
		double actual = parleG.calculatePriceAfterDiscount();
		assertEquals(expected, actual);
	}
	
	LineItem parleGLine = new LineItem(101, 5, parleG);
	
	@Test
	void testCalculateLineItemCost_check() {
		double expected = 18*5;
		double actual = parleGLine.calculateLineItemCost();
		assertEquals(expected, actual);
	}
	
	Order order = new Order(101, "11/08/2022");
	
	@Test
	void testCalculateOrderTotal_check() {
		order.addLineItem(parleGLine);
		double expected = 18*5;
		double actual = order.calculateOrderTotal();
		assertEquals(expected, actual);
	}
	
}

