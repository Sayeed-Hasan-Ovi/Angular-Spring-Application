package com.ordermanagement.ordermanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ordermanagement.ordermanagementsystem.repository.ProductRepository;

import com.ordermanagement.ordermanagementsystem.model.Product;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public ProductService() {
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }
}
