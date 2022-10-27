package com.aurionpro.springboot.service;

import java.util.List;

import com.aurionpro.springboot.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public Customer getCustomerById(int customerId);

	public void addCustomer(Customer customer);

	public void deleteCustomer(int customerId); 
		
}
