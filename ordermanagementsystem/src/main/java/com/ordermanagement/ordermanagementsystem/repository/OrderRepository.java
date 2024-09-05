package com.ordermanagement.ordermanagementsystem.repository;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.ordermanagement.ordermanagementsystem.model.Order;
import com.ordermanagement.ordermanagementsystem.model.OrderDetail;
import com.ordermanagement.ordermanagementsystem.model.Product;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
    public List<Order> getRecentlyPlacedOrders() {
        
        String sql = "SELECT * FROM order_summary ORDER BY orderDate DESC";
        List<Order> orders = new ArrayList<>();
        int count = 0;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "1667");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                for (String productCode : rs.getString("productCodes").split(",")) {
                    Order order = new Order();
                    order.setOrderNumber(rs.getInt("orderNumber"));
                    order.setOrderDate(rs.getDate("orderDate"));
                    order.setRequiredDate(rs.getDate("requiredDate"));
                    order.setStatus(rs.getString("status"));
                    order.setCustomerNumber(rs.getInt("customerNumber"));
                    orders.add(order);
                    count++;
                }
                if (count >= 30) {
                    break;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return orders;
    }

    public List<Order> getRecentlyDeliveredOrders() {
        String sql = "SELECT * FROM order_summary WHERE status = 'Shipped' ORDER BY orderDate DESC";
        
        List<Order> orders = new ArrayList<>();
        int count = 0;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "1667");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                for (String productCode : rs.getString("productCodes").split(",")) {
                    Order order = new Order();
                    order.setOrderNumber(rs.getInt("orderNumber"));
                    order.setOrderDate(rs.getDate("orderDate"));
                    order.setRequiredDate(rs.getDate("requiredDate"));
                    order.setStatus(rs.getString("status"));
                    order.setCustomerNumber(rs.getInt("customerNumber"));
                    orders.add(order);
                    count++;
                }
                if (count >= 30) {
                    break;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return orders;
    }

    public List<OrderDetail> getOrderDetails(int orderNumber, int customerNumber) {
        String sql = "SELECT * FROM orderdetails WHERE orderNumber = " + orderNumber + ";";
        List<OrderDetail> orderDetails = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "1667");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                OrderDetail orderDetail = new OrderDetail();
                orderDetail.setQuantityOrdered(rs.getInt("quantityOrdered"));
                orderDetail.setPriceEach(rs.getBigDecimal("priceEach"));
                Product product = new Product();
                product.setProductCode(rs.getString("productCode"));
                orderDetail.setProduct(product);
                orderDetails.add(orderDetail);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return orderDetails;
    }
}
