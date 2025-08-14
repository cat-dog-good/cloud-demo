package org.example.clientservice.Service;

import org.example.clientservice.POJO.Order;

public interface OrderService {
    //根据id查询员工信息
    Order getById(Integer id);
}
