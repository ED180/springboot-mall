package com.ED.springbootmall.service;

import com.ED.springbootmall.dto.CreateOrderRequest;
import com.ED.springbootmall.dto.OrderQueryParams;
import com.ED.springbootmall.model.Order;

import java.util.List;

public interface OrderService {
    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Integer countOrder(OrderQueryParams orderQueryParams);
}
