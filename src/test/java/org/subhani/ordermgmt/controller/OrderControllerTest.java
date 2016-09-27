/**
 * 
 */
package org.subhani.ordermgmt.controller;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.easymock.EasyMock;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.ModelAndView;
import org.subhani.ordermgmt.domain.data.Order;
import org.subhani.ordermgmt.service.OrderService;

/**
 * @author Subhani
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "**/applicationContext.xml" })
public class OrderControllerTest {

	private OrderController orderController;
	private OrderService orderService;
	ModelAndView modelAndView;
	HttpServletRequest httpRequest;
	
	@Before
	public void setUp() {

		orderService = EasyMock.createMock(OrderService.class);
		orderController = EasyMock.createMock(OrderController.class);
		orderController.setOrderService(orderService);

		modelAndView = new ModelAndView();
		

	}

	/**
	 * Test method to retrieve all orders.
	 * {@link org.subhani.ordermgmt.controller.OrderController#getOrders()}.
	 */
	@Test
	public void testGetOrders() {

		prepareAllOrders(modelAndView);
		expect(orderController.getOrders(modelAndView, httpRequest)).andReturn(modelAndView);
		replay(orderController);

		modelAndView = orderController.getOrders(modelAndView, httpRequest);
		assertTrue("View received", modelAndView.getViewName().equals("orders"));
		assertTrue("Order list received.",
				((List) (modelAndView.getModelMap().get("orders"))) != null);

	}

	/**
	 * Class level life cycle method to shut down all the used resources.
	 */
	@AfterClass
	public static void teardown() {

	}

	private void prepareAllOrders(ModelAndView modelAndView) {
		
		List<Order> orders = new ArrayList<Order>();
		modelAndView.addObject("orders", orders);
		modelAndView.setViewName("orders");
	}
}
