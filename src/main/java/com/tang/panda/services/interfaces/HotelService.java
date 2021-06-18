package com.tang.panda.services.interfaces;

import com.github.pagehelper.PageInfo;
import com.tang.panda.pojo.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelService {
    int insertHotel(Hotel hotel);
    PageInfo<Hotel> selectHotelByPage(Hotel hotel, Integer pageNum, Integer pageSize);

    Hotel selectHotelById(Long hotelid);
    List<Hotel> selectHotelAll(Hotel hotel);

    int updateHotel(Hotel hotel);

    List<Hotel> selectHotelList(Hotel hotel);
}
