package com.tang.panda.dao;


import com.tang.panda.pojo.OrderDetail;

public interface OrderDetailMapper {
    int deleteByPrimaryKey(Long detailid);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(Long detailid);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
}