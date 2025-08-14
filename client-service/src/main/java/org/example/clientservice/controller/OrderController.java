package org.example.clientservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.clientservice.POJO.Client;
import org.example.clientservice.POJO.Order;
import org.example.clientservice.POJO.Result;
import org.example.clientservice.Service.ClientService;
import org.example.clientservice.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/qill7/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    //根据id查询员工信息
    @GetMapping("{id}")
    public Result getById(@PathVariable Integer id){
        log.info("根据id查询员工信息:{}",id);

        Order emp = orderService.getById(id);
        return Result.success(emp);
    }

}

