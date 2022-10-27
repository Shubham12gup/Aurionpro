package com.aurionpro.test;

import com.aurionpro.model.CustomerRepository;
import com.aurionpro.model.IRepository;
import com.aurionpro.model.OrderRepository;
import com.aurionpro.model.ProductRepository;

public class RepositoryTest {

	public static void main(String[] args) {
		IRepository customer = new CustomerRepository();
		repositoryCrud(customer);
		System.out.println("------------------------");

		IRepository order = new OrderRepository();
		repositoryCrud(order);
		System.out.println("------------------------");
		
		IRepository product = new ProductRepository();
		repositoryCrud(product);
		System.out.println("------------------------");

	}

	public static void repositoryCrud(IRepository repository) {
		repository.create();
		repository.read();
		repository.update();
		repository.delete();
	}

}
