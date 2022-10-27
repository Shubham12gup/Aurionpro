package com.aurionpro.springboot.service;

import java.util.List;

import com.aurionpro.springboot.entity.Customer;

public interface CustomerService {
	
	public List<Customer> findAll();

	public Customer findById(int customerId);

	public void save(Customer customer);

	public void deleteById(int customerId); 
		
}
