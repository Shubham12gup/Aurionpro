package com.aurionpro.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aurionpro.springdemo.dao.CustomerDao;
import com.aurionpro.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;
	
	@Transactional
	@Override
	public List<Customer> getCustomers() {
		
		return customerDao.getCustomers();
	}
	
	@Transactional
	@Override
	public Customer getCustomerById(int customerId) {
		return customerDao.getCustomerById(customerId);
	}

	@Transactional
	@Override
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
	}
	
	@Transactional
	@Override
	public void deleteCustomer(int customerId) {
		customerDao.deleteCustomer(customerId);
	}

}
