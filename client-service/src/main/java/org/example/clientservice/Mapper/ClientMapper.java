package org.example.clientservice.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.clientservice.POJO.Client;


@Mapper
public interface ClientMapper {
    //根据id查询员工信息
    @Select("select * from client where id = #{id}")
    Client getById(Integer id);
}
