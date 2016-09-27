package org.subhani.ordermgmt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.subhani.ordermgmt.dao.OrderDao;
import org.subhani.ordermgmt.domain.data.Order;
import org.subhani.ordermgmt.service.OrderService;


import java.util.List;

/**
 * 
 * @author Subhani
 *
 */
@Service(value = "orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    public List<Order> getOrders() {
        return orderDao.getOrders();
    }
}
