package com.ordermanagement.ordermanagementsystem.service;

import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.ordermanagement.ordermanagementsystem.repository.CustomerRepository;

import com.ordermanagement.ordermanagementsystem.model.Customer;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public CustomerService() {
    }

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    // public Customer getCustomer(int customerNumber) {
    //     return customerRepository.findById(customerNumber).orElse(null);
    // }
}
