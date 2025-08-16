package org.example.orderservice.POJO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//订单表
public class Order {
    private Integer id;
    private Integer clientID;
    private Client client;
    private Integer price;
}