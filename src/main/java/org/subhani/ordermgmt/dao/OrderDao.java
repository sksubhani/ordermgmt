package org.subhani.ordermgmt.dao;

import java.util.List;

import org.subhani.ordermgmt.domain.data.Order;

public interface OrderDao {
	
	public List<Order> getOrders();

}
