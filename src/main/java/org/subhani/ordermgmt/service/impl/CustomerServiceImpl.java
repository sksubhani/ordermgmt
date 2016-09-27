package org.subhani.ordermgmt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.subhani.ordermgmt.dao.CustomerDao;
import org.subhani.ordermgmt.domain.data.Customer;
import org.subhani.ordermgmt.service.CustomerService;

/**
 * 
 * @author Subhani
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDao;
	
	public List<Customer> getCustomers() {
		
		List<Customer> customers = customerDao.getCustomers();
		return customers;
	}
	
	public List<Customer> getCustomersByCustomerNumber(Integer customerNumber) {
		List<Customer> customers = customerDao.getCustomersByCustomerNumber(customerNumber);
		return customers;
	}
	

	public List<Customer> getCustomersByCity(String cityName) {
		
		List<Customer> customers = customerDao.getCustomersByCity(cityName);
		return customers;
	}
}
