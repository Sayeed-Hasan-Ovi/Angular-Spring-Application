package com.ordermanagement.ordermanagementsystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table (name = "customers")
public class Customer {
    @Id
    @Column(name = "customerNumber", nullable = false)
    private Integer customerNumber; // Changed from Long to Integer to match the database schema

    @Column(name = "customerName", length = 50, nullable = false)
    private String customerName;

    @Column(name = "country", length = 255)
    private String country;

    public Customer() {
    }

    public Customer(Integer customerNumber, String customerName, String country) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.country = country;
    }
}
