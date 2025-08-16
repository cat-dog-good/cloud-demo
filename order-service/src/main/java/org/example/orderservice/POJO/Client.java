package org.example.orderservice.POJO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//客户表
public class Client {
        private Integer id;
        private String address;
        private String name;
        private String gender;
        private Short age;
        private String idCard;
}
