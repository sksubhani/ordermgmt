package org.subhani.ordermgmt.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.subhani.ordermgmt.domain.data.Customer;

/**
 * 
 * @author Subhani
 *
 */
@Service
public interface CustomerService {
	
	/**
	 * Retrieve all customers from the database.
	 * @return list customer list
	 */
	public List<Customer> getCustomers();
	
	/**
	 * Retrieve customer details by customer number.
	 * @param Integer customerNumber
	 * @return List Customers
	 */
	public List<Customer> getCustomersByCustomerNumber(Integer customerNumber);
	
	/**
	 * Retrieve all customers by city name
	 * @param String cityName
	 * @return list customer list
	 */
	public List<Customer> getCustomersByCity(String cityName);
	
}
