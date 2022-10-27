package com.aurionpro.springdemo.dao;

import java.util.List;

import com.aurionpro.springdemo.entity.Customer;

public interface CustomerDao {
	
	public List<Customer> getCustomers();

	public Customer getCustomerById(int customerId);

	public void addCustomer(Customer customer);

	public void deleteCustomer(int customerId);
		
}
