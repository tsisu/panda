package com.tang.panda.dao;


import com.tang.panda.pojo.HotelTraffic;
import com.tang.panda.pojo.SysArea;

import java.util.List;

public interface HotelTrafficMapper {
    int deleteByPrimaryKey(Long htrid);

    int insert(HotelTraffic record);

    int insertSelective(HotelTraffic record);

    HotelTraffic selectByPrimaryKey(Long htrid);

    int updateByPrimaryKeySelective(HotelTraffic record);

    int updateByPrimaryKey(HotelTraffic record);

    List<HotelTraffic> selectHotelTrafficList(HotelTraffic hotelTraffic);

    List<HotelTraffic> selectHotelTrafficAll(HotelTraffic hotelTraffic);
}