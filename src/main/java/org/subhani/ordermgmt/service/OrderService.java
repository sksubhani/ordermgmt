package org.subhani.ordermgmt.service;

import org.springframework.stereotype.Service;
import org.subhani.ordermgmt.domain.data.Order;

import java.util.List;

/**
 * Created by dv57454 on 9/18/2016.
 */
@Service
public interface OrderService {

    public List<Order> getOrders();

}
