package com.tang.panda.dao;


import com.tang.panda.pojo.HotelImgs;

public interface HotelImgsMapper {
    int deleteByPrimaryKey(Long himgid);

    int insert(HotelImgs record);

    int insertSelective(HotelImgs record);

    HotelImgs selectByPrimaryKey(Long himgid);

    int updateByPrimaryKeySelective(HotelImgs record);

    int updateByPrimaryKey(HotelImgs record);
}