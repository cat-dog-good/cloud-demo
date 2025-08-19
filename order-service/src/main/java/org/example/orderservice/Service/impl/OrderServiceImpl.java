package org.example.orderservice.Service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.orderservice.POJO.Client;
import org.example.orderservice.POJO.Order;
import org.example.orderservice.POJO.Result;
import org.example.orderservice.Service.OrderService;
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

    private final RestTemplate restTemplate;

    @Override
    public Order getById(Integer id) {
        //1.查询订单
        Order order = orderMapper.getById(id);
        //2利用restTemplate发送http请求，查询用户
        String url = "http://CLIENTSERVICE/qill7/client/"+order.getClientID();
        Client client = restTemplate.getForObject(url, Client.class);
        order.setClient(client);
        return order;
    }
}
