package com.tang.panda.dao;


import com.tang.panda.pojo.CustomerOrder;

public interface CustomerOrderMapper {
    int deleteByPrimaryKey(Long orderid);

    int insert(CustomerOrder record);

    int insertSelective(CustomerOrder record);

    CustomerOrder selectByPrimaryKey(Long orderid);

    int updateByPrimaryKeySelective(CustomerOrder record);

    int updateByPrimaryKey(CustomerOrder record);
}