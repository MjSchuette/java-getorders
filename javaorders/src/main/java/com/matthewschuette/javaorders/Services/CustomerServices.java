package com.matthewschuette.javaorders.Services;

import com.matthewschuette.javaorders.Models.Customers;

import java.util.List;

public interface CustomerServices {
    List<Customers> findAllCustomerOrders();
    Customers findCustomersById(long id);
    List<Customers> findByCustomerName(String custname);
}
