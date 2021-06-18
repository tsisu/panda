package com.tang.panda.dao;


import com.tang.panda.pojo.SpotsHotel;

public interface SpotsHotelMapper {
    int deleteByPrimaryKey(Long shid);

    int insert(SpotsHotel record);

    int insertSelective(SpotsHotel record);

    SpotsHotel selectByPrimaryKey(Long shid);

    int updateByPrimaryKeySelective(SpotsHotel record);

    int updateByPrimaryKey(SpotsHotel record);
}