/**
 * 
 */
package org.subhani.ordermgmt.controller;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.easymock.EasyMock;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.ModelAndView;
import org.subhani.ordermgmt.domain.data.Customer;
import org.subhani.ordermgmt.service.CustomerService;

/**
 * @author Subhani
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "**/applicationContext.xml" })
public class CustomerControllerTest {

	private static int SIZE_ONE = 1;
	private static int SIZE_ZERO = 0;

	private CustomerController customerController;
	private CustomerService customerService;
	ModelAndView modelAndView;

	@Before
	public void setUp() {

		customerService = EasyMock.createMock(CustomerService.class);
		customerController = EasyMock.createMock(CustomerController.class);
		customerController.setCustomerService(customerService);

		modelAndView = new ModelAndView();

	}

	/**
	 * Test method to retrieve all customers.
	 * {@link org.subhani.ordermgmt.controller.CustomerController#getCustomers()}.
	 */
	@Test
	public void testGetCustomers() {

		prepareCustomerListForAll(modelAndView);
		expect(customerController.getCustomers()).andReturn(modelAndView);
		replay(customerController);

		modelAndView = customerController.getCustomers();
		assertTrue("View received", modelAndView.getViewName().equals("customers"));
		assertTrue("Customer list received.",
				((List) (modelAndView.getModelMap().get("customers"))) != null);

	}

	/**
	 * Test method to retrieve customer by customer number.
	 * {@link org.subhani.ordermgmt.controller.CustomerController#getCustomersByCustomerNumber(java.lang.Integer)}.
	 */
	@Test
	public void testGetCustomersByCustomerNumber() {

		Integer customerNumber = new Integer(103);
		prepareCustomerByCustomerNumber(modelAndView, customerNumber);
		expect(customerController.getCustomersByCustomerNumber(customerNumber)).andReturn(modelAndView);
		replay(customerController);

		modelAndView = customerController.getCustomersByCustomerNumber(customerNumber);
		assertTrue("One customer found with Customer Number " + customerNumber,
				((List) (modelAndView.getModelMap().get("customers"))).size() == SIZE_ONE);
	}

	/**
	 * Test method to retrieve customer by customer number where no customer
	 * exists for given customer number.
	 * {@link org.subhani.ordermgmt.controller.CustomerController#getCustomersByCustomerNumber(java.lang.Integer)}.
	 */
	@Test
	public void testGetCustomersByCustomerNumberWhenNoRecordsFound() {

		Integer customerNumber = new Integer(104);
		prepareCustomerByCustomerNumber(modelAndView, customerNumber);
		expect(customerController.getCustomersByCustomerNumber(customerNumber)).andReturn(modelAndView);
		replay(customerController);

		modelAndView = customerController.getCustomersByCustomerNumber(customerNumber);
		assertTrue("Customer not found for customer number " + customerNumber,
				((List) (modelAndView.getModelMap().get("customers"))) == Collections.emptyList());
	}
	

	/**
	 * Test method to retrieve customers by city name.
	 * {@link org.subhani.ordermgmt.controller.CustomerController#getCustomersByCity(java.lang.String)}.
	 */
	@Test
	public void testGetCustomersByCity() {

		String cityName = "Nantes";
		prepareCustomerByCity(modelAndView, cityName);
		expect(customerController.getCustomersByCity(cityName)).andReturn(modelAndView);
		replay(customerController);

		modelAndView = customerController.getCustomersByCity(cityName);
		assertTrue("Customer list received. ",
				((List) (modelAndView.getModelMap().get("customers"))) != null);
	}

	/**
	 * Class level life cycle method to shut down all the used resources.
	 */
	@AfterClass
	public static void teardown() {

	}

	private void prepareCustomerListForAll(ModelAndView modelAndView) {
		modelAndView.addObject("pageTitle", "All Customers");
		List<Customer> customers = new ArrayList<Customer>();
		modelAndView.addObject("customers", customers);
		modelAndView.setViewName("customers");
	}

	private void prepareCustomerByCustomerNumber(ModelAndView modelAndView, Integer customerNumber) {

		List<Customer> customers = new ArrayList<Customer>();
		if (customerNumber == 103) {
			customers.add(new Customer());
		} else {
			customers = Collections.emptyList();
		}
		modelAndView.addObject("pageTitle", "Customers Details of Customer Number " + customerNumber);
		modelAndView.addObject("customers", customers);
		modelAndView.setViewName("customers");
	}

	private void prepareCustomerByCity(ModelAndView modelAndView, String cityName) {

		List<Customer> customers = new ArrayList<Customer>();
		modelAndView.addObject("pageTitle", "Customers in " + cityName);
		modelAndView.addObject("customers", customers);
		modelAndView.setViewName("customers");
	}

}
