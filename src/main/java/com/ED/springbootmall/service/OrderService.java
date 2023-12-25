package com.ED.springbootmall.service;

import com.ED.springbootmall.dto.CreateOrderRequest;
import com.ED.springbootmall.model.Order;

public interface OrderService {
    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
