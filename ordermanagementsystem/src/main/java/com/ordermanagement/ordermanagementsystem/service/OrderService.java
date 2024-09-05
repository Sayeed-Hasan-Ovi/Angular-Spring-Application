package com.ordermanagement.ordermanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.ordermanagement.ordermanagementsystem.model.Order;
import com.ordermanagement.ordermanagementsystem.repository.OrderRepository;
import com.ordermanagement.ordermanagementsystem.model.OrderDetail;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getRecentlyPlacedOrders() {
        return orderRepository.getRecentlyPlacedOrders();
    }

    public List<Order> getRecentlyDeliveredOrders() {
        return orderRepository.getRecentlyDeliveredOrders();
    }

    public List<OrderDetail> getOrderDetails(int orderNumber, int customerNumber) {
        // System.out.println(orderRepository.getOrderDetails(orderNumber, customerNumber));
        return orderRepository.getOrderDetails(orderNumber, customerNumber);
    }
}
