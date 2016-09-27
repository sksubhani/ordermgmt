package org.subhani.ordermgmt.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.subhani.ordermgmt.domain.data.Customer;
import org.subhani.ordermgmt.service.CustomerService;

/**
 * 
 * @author Subhani
 *
 */

@Controller
@RequestMapping( "/customers" )
public class CustomerController {
	
	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	CustomerService customerService;


	/**
	 * Get all customers from the database.
	 * @return ModelAndView
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getCustomers() {
		
		logger.debug("Request received for to get all customers." );
		ModelAndView modelAndView = new ModelAndView();
		List<Customer> customers = customerService.getCustomers();
		modelAndView.addObject("pageTitle", "All Customers");
		modelAndView.addObject("customers", customers);
		modelAndView.setViewName("customers");
		return modelAndView;
	}
	
	
	/**
	 * Get customer details by customer number.
	 * @param customerNumber
	 * @return ModelAndView
	 */
	@RequestMapping( value = "/{customerNumber}", method = RequestMethod.GET)
	public ModelAndView getCustomersByCustomerNumber(@PathVariable Integer customerNumber) {		
		
		logger.debug("Request received for to get a customer details for customer: " + customerNumber);
		ModelAndView modelAndView = new ModelAndView();
		List<Customer> customers = customerService.getCustomersByCustomerNumber(customerNumber);
		modelAndView.addObject("pageTitle", "Customers Details of Customer Number " + customerNumber);
		modelAndView.addObject("customers", customers);
		modelAndView.setViewName("customers");
		return modelAndView;

	}

	
	/**
	 * Get all customers by city name.
	 * @param cityName
	 * @return ModelAndView
	 */
	@RequestMapping( value = "/cities/{cityName}", method = RequestMethod.GET)
	public ModelAndView getCustomersByCity(@PathVariable String cityName) {		
		
		logger.debug("Request received for to get all customers in the city: " + cityName);
		ModelAndView modelAndView = new ModelAndView();
		List<Customer> customers = customerService.getCustomersByCity(cityName);
		modelAndView.addObject("pageTitle", "Customers in " + cityName);
		modelAndView.addObject("customers", customers);
		modelAndView.setViewName("customers");
		return modelAndView;

	}

	
	public CustomerService getCustomerService() {
		return customerService;
	}


	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
}
