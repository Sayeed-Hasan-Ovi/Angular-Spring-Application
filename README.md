# Project Setup Instructions

1. **Restore the MySQL Database:**
   After CREATE DATABASE classicmodels
   ```sh
   mysql -u root -p -h 127.0.0.1 classicmodels < mysql_backup.sql
   ```

2. **Set MySQL Password:**
   ```sql
   For Convenience '1667' is used as password
   ```

3. **Run the Spring Boot Application:**
   ```sh
   cd ordermanagementsystem/
   mvn spring-boot:run
   ```

4. **Run the Angular Front-End:**
   ```sh
   cd Angular-Front-End/
   ng serve
   ```


# List of APIs

1. **Get All Customers from Backend**
   - **Endpoint:** `http://localhost:8080/api/customers`

2. **Get All Products from Backend**
   - **Endpoint:** `http://localhost:8080/api/products`

3. **Get Recently Placed Orders (Sorted)**
   - **Endpoint:** `http://localhost:8080/api/orders/recentlyPlaced`

4. **Get Recently Delivered Orders**
   - **Endpoint:** `http://localhost:8080/api/orders/recentlyDelivered`

5. **Order Detail from Backend**
   - **Endpoint:** `http://localhost:8080/api/order-details?orderNumber=10419&customerNumber=382`
   - Check with other valid combinations.

6. **Front End Initial Hit Point**
   - **Endpoint:** `http://localhost:4200/`

7. **Get All Customers in Front End**
   - **Endpoint:** `http://localhost:4200/customer`

8. **Get All Products in Front End**
   - **Endpoint:** `http://localhost:4200/product`

9. **Front End Delivered List**
   - **Endpoint:** `http://localhost:4200/recentlyDelivered`

10. **Sorted Placements of Orders**
    - **Endpoint:** `http://localhost:4200/recentlyPlaced`

11. **Order Details with Pricing Calculation**
    - **Endpoint:** `http://localhost:4200/getOrderDetails/10422/157`
