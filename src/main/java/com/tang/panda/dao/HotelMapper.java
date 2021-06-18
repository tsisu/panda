package com.tang.panda.dao;


import com.tang.panda.pojo.Hotel;
import com.tang.panda.pojo.ScenicSpots;

import java.util.List;

public interface HotelMapper {
    int deleteByPrimaryKey(Long hotelid);

    int insert(Hotel record);

    int insertSelective(Hotel record);

    Hotel selectByPrimaryKey(Long hotelid);

    List<Hotel> selectHotelList(Hotel hotel);

    List<Hotel> selectHotelAll(Hotel hotel);

    int updateByPrimaryKeySelective(Hotel record);

    int updateByPrimaryKeyWithBLOBs(Hotel record);

    int updateByPrimaryKey(Hotel record);

    int updateHotel(Hotel hotel);
}
