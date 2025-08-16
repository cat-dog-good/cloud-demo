package org.example.orderservice.Service;

import org.example.orderservice.POJO.Order;

public interface OrderService {
    //根据id查询员工信息
    Order getById(Integer id);
}
