package com.ordermanagement.ordermanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ordermanagement.ordermanagementsystem.service.CustomerService;
import com.ordermanagement.ordermanagementsystem.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    private CustomerService customerService;


    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    // @GetMapping("/customers/{customerNumber}")
    // public Customer getCustomer(int customerNumber) {
    //     return customerService.getCustomer(customerNumber);
    // }
}
