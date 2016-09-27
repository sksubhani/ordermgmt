package org.subhani.ordermgmt.controller;

import java.util.List;

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
	
	@Autowired
	CustomerService customerService;
	
	/**
	 * Get all customers from the database.
	 * @return ModelAndView
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getCustomers() {
		
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
		
		ModelAndView modelAndView = new ModelAndView();
		List<Customer> customers = customerService.getCustomersByCity(cityName);
		modelAndView.addObject("pageTitle", "Customers in " + cityName);
		modelAndView.addObject("customers", customers);
		modelAndView.setViewName("customers");
		return modelAndView;

	}

}
