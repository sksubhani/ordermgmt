/**
 * 
 */
package org.subhani.ordermgmt.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.subhani.ordermgmt.dao.CustomerDao;
import org.subhani.ordermgmt.domain.data.Customer;

/**
 * @author Subhani
 *
 */
@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public List<Customer> getCustomers() {
		
		Query query = entityManager.createNamedQuery( "getAllCustomers" );
		List<Customer> customers = (List<Customer>) query.getResultList();
		
		return customers;
	}
	
	// We are returning the result list instead of single result of Customer object as we can reuse the same JSP for all scenarios.
	public List<Customer> getCustomersByCustomerNumber(Integer customerNumber) {
		
		Query query = entityManager.createNamedQuery( "getCustomerByCustomerNumber" );
		query.setParameter("customerNumber", customerNumber.intValue());
		// Ideal : Customer customer = (Customer) query.getSingleResult();
		List<Customer> customers = (List<Customer>) query.getResultList();
		
		if(customers == null) {
			System.out.println("No customer found.");
		}
		return customers;
	}
	
	public List<Customer> getCustomersByCity(String cityName) {
		
		Query query = entityManager.createNamedQuery( "getAllCustomersByCity" );
		query.setParameter("city", cityName);
		List<Customer> customers = (List<Customer>) query.getResultList();
		
		return customers;
	}

}
