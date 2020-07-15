package com.matthewschuette.javaorders.Services;

import com.matthewschuette.javaorders.Models.Orders;

public interface OrderServices {
    Orders findOrdersById(long id);
}
