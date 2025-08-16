package org.example.orderservice.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.orderservice.POJO.Order;

@Mapper
public interface OrderMapper {
    //根据id查询订单信息

    Order getById(Integer id);
}
