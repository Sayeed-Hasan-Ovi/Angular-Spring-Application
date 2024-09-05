package com.ordermanagement.ordermanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ordermanagement.ordermanagementsystem.model.Order;
import com.ordermanagement.ordermanagementsystem.model.OrderDetail;
import com.ordermanagement.ordermanagementsystem.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/orders/recentlyPlaced")
    List<Order> getRecentlyPlacedOrders() {
        return orderService.getRecentlyPlacedOrders();
    }
    
    @GetMapping("/orders/recentlyDelivered")
    List<Order> getRecentlyDeliveredOrders() {
        return orderService.getRecentlyDeliveredOrders();
    }

    // @GetMapping("/order detail by order number and customer number also get qty, price, product code")
    @GetMapping("/order-details")
    public List<OrderDetail> getOrderDetails(
            @RequestParam int orderNumber,
            @RequestParam int customerNumber) {
        // System.out.println("Order number: " + orderNumber + ", Customer number: " + customerNumber);
        return orderService.getOrderDetails(orderNumber, customerNumber);
    }
}
