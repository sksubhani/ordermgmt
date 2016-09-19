package org.subhani.ordermgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.subhani.ordermgmt.domain.data.Order;
import org.subhani.ordermgmt.service.OrderService;


import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * Created by dv57454 on 9/18/2016.
 */
@Controller
@RequestMapping("/orders")

public class OrderController {


    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ModelAndView getOrders(ModelAndView model, HttpServletRequest request) {

        List<Order> orders = orderService.getOrders();

        model.addObject("orders", orders);
        model.setViewName("orders");

        System.out.println("Inside Controller class");
        return model;
        //return new ModelAndView("/index.jsp", "orders", orders);
    }
}
