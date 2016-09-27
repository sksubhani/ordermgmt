package org.subhani.ordermgmt.service;

import org.springframework.stereotype.Service;
import org.subhani.ordermgmt.domain.data.Order;

import java.util.List;

/**
 * 
 * @author Subhani
 *
 */
@Service
public interface OrderService {

    public List<Order> getOrders();

}
