package com.ordermanagement.ordermanagementsystem.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "products")
public class Product {
    @Id 
    @Column(name = "product_code", length = 15, nullable = false)
    private String productCode;

    @Column(name = "product_name", length = 70, nullable = false)
    private String productName;

    @Column(name = "product_scale", length = 10, nullable = false)
    private String productScale;

    @Column(name = "product_vendor", length = 50, nullable = false)
    private String productVendor;

    @Column(name = "product_description", columnDefinition = "TEXT", nullable = false)
    private String productDescription;

    @Column(name = "quantity_in_stock", nullable = false)
    private Short quantityInStock;

    @Column(name = "buy_price", precision = 10, scale = 2, nullable = false)
    private BigDecimal buyPrice;

    @Column(name = "msrp", precision = 38, scale = 2, nullable = true)
    private BigDecimal msrp;

    public Product() {
    }

    public Product(String productCode, String productName, String productScale, String productVendor, String productDescription, Short quantityInStock, BigDecimal buyPrice, BigDecimal MSRP) {
        this.productCode = productCode;
        this.productName = productName;
        this.productScale = productScale;
        this.productVendor = productVendor;
        this.productDescription = productDescription;
        this.quantityInStock = quantityInStock;
        this.buyPrice = buyPrice;
        this.msrp = MSRP;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductScale(String productScale) {
        this.productScale = productScale;
    }

    public void setProductVendor(String productVendor) {
        this.productVendor = productVendor;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setQuantityInStock(Short quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public void setBuyPrice(BigDecimal buyPrice) {
        this.buyPrice = buyPrice;
    }

    public void setMSRP(BigDecimal MSRP) {
        this.msrp = MSRP;
    }
}