package com.tang.panda.dao;


import com.tang.panda.pojo.Customer;

public interface CustomerMapper {
    int deleteByPrimaryKey(Long cusid);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Long cusid);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}