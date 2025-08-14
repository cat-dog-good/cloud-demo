package org.example.clientservice.Service.impl;

import org.example.clientservice.POJO.Order;
import org.example.clientservice.Service.OrderService;
import org.example.clientservice.mapper.OrderMapper;
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
