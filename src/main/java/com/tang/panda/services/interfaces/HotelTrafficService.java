package com.tang.panda.services.interfaces;

import com.github.pagehelper.PageInfo;
import com.tang.panda.pojo.HotelTraffic;
import com.tang.panda.pojo.SysArea;

import java.util.List;

public interface HotelTrafficService {

    HotelTraffic selectHotelTrafficById(Long htrid);

    List<HotelTraffic> selectHotelTrafficList(HotelTraffic hotelTraffic);


    PageInfo<HotelTraffic> selectHotelTrafficByPage(HotelTraffic hotelTraffic, Integer pageNum, Integer pageSize);
    List<HotelTraffic> selectHotelTrafficAll(HotelTraffic hotelTraffic);

    int insertHotelTraffic(HotelTraffic hotelTraffic);
}
