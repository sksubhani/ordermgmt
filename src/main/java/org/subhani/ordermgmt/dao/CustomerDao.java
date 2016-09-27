package org.subhani.ordermgmt.dao;

import java.util.List;

import org.subhani.ordermgmt.domain.data.Customer;

/**
 * 
 * @author Subhani
 *
 */
public interface CustomerDao {

	/**
	 * Retrieve all customers from the database.
	 * @return list customer list
	 */
	public List<Customer> getCustomers();
	
	
	/**
	 * Retrieve customer details by customer number
	 * @param Integer customer number
	 * @return list customer details
	 */
	public List<Customer> getCustomersByCustomerNumber(Integer customerNumber);
	
	
	/**
	 * Retrieve all customers by city name
	 * @param String cityName
	 * @return list customer list
	 */
	public List<Customer> getCustomersByCity(String cityName);
}
