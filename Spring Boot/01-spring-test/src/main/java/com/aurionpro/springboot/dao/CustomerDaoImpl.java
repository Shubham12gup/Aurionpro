package com.aurionpro.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aurionpro.springboot.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

//	@Autowired
//	private SessionFactory sessionFactory;
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Customer> getCustomers() {
		Session currentSession = entityManager.unwrap(Session.class);
//		Session currentSession = sessionFactory.getCurrentSession();
		List<Customer> resultList = currentSession.createQuery("from Customer order by firstName", Customer.class).getResultList();
		return resultList;
	}

	@Override
	public Customer getCustomerById(int customerId) {
		Session currentSession = entityManager.unwrap(Session.class);
//		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession.get(Customer.class, customerId);
		 
	}

	@Override
	public void addCustomer(Customer customer) {
		Session currentSession = entityManager.unwrap(Session.class);
//		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(customer);
	}

	@Override
	public void deleteCustomer(int customerId) {
		Session currentSession = entityManager.unwrap(Session.class);
//		Session currentSession = sessionFactory.getCurrentSession();
		Query deleteQuery = currentSession.createQuery("delete from Customer where id=:id");
		deleteQuery.setParameter("id", customerId);
		deleteQuery.executeUpdate();
	}

}
