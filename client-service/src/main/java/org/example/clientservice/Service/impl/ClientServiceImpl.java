package org.example.clientservice.Service.impl;


import org.example.clientservice.Mapper.ClientMapper;
import org.example.clientservice.POJO.Client;
import org.example.clientservice.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientMapper ClientMapper;

    @Override
    public Client getById(Integer id) {
        return ClientMapper.getById(id);
    }
}
