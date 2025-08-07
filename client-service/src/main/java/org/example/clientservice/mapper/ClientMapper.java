package org.example.clientservice.mapper;

import org.apache.ibatis.annotations.Mapper;

import org.example.clientservice.POJO.Client;


@Mapper
public interface ClientMapper {
    //根据id查询员工信息

    Client getById(Integer id);
}
