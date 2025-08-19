package org.example.orderservice.Service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.orderservice.POJO.Client;
import org.example.orderservice.POJO.Order;
import org.example.orderservice.POJO.Result;
import org.example.orderservice.Service.OrderService;
import org.example.orderservice.client.UserClient;
import org.example.orderservice.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;

    @Autowired
    UserClient userClient;

    @Override
    public Order getById(Integer id) {
        //1.查询订单
        Order order = orderMapper.getById(id);
        //2用Fegin发送http请求，查询用户
        Client client = userClient.getById(order.getClientID());
        order.setClient(client);
        return order;
    }
}
