package com.aurionpro.test;

import com.aurionpro.model.Customer;
import com.aurionpro.model.LineItem;
import com.aurionpro.model.Order;
import com.aurionpro.model.Product;

public class CustomerTest {

	public static void main(String[] args) {

		Product parleG = new Product(101, "Parle-G", 20, 10);
		LineItem lineItem1 = new LineItem(101, 5, parleG);

		Product Marie = new Product(102, "Marie Gold", 10, 10);
		LineItem lineItem2 = new LineItem(102, 5, Marie);

		Order order1 = new Order(101, "11/08/2022");
		order1.addLineItem(lineItem1);
		order1.addLineItem(lineItem2);

		Product krackjack = new Product(103, "Krack-Jack", 100, 10);
		LineItem krackjackLine = new LineItem(103, 5, krackjack);

		Product JimJam = new Product(104, "JimJam", 10, 10);
		LineItem JimJamLine = new LineItem(104, 5, JimJam);

		Order order2 = new Order(102, "12/08/2022");
		order2.addLineItem(krackjackLine);
		order2.addLineItem(JimJamLine);

		Customer customer = new Customer(101, "Shubh");
		customer.addOrder(order1);
		customer.addOrder(order2);
		System.out.println("Order Count: " + customer.orderCount());
		System.out.println(customer);
		System.out.println("Total spending till now: " + customer.cartTotal());

	}

}
