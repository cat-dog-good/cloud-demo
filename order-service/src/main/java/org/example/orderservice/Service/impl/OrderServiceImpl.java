package org.example.orderservice.Service.impl;

import org.example.orderservice.POJO.Order;
import org.example.orderservice.Service.OrderService;
import org.example.orderservice.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;

    @Override
    public Order getById(Integer id) {
        return orderMapper.getById(id);
    }
}
