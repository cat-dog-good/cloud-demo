package org.example.clientservice.Service;


import org.example.clientservice.POJO.Client;

public interface ClientService {

    //根据id查询员工信息
    Client getById(Integer id);
}
