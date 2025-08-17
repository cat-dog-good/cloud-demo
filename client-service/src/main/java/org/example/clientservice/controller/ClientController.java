package org.example.clientservice.controller;

import lombok.extern.slf4j.Slf4j;

import org.example.clientservice.POJO.Client;

import org.example.clientservice.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/qill7/client")
public class ClientController {

    @Autowired
    private ClientService ClientService;

    //根据id查询员工信息
    @GetMapping("{id}")
    public Client getById(@PathVariable Integer id){
        log.info("根据id查询员工信息:{}",id);

        Client emp = ClientService.getById(id);
        return emp;
    }

}
