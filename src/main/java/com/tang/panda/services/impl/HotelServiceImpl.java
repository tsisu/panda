package com.tang.panda.services.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tang.panda.dao.HotelMapper;
import com.tang.panda.pojo.Hotel;
import com.tang.panda.pojo.ScenicSpots;
import com.tang.panda.services.interfaces.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelMapper hotelMapper;

    @Override
    public int insertHotel(Hotel hotel) {
        return hotelMapper.insert(hotel);
    }

    /**
     * 分页查询
     *
     * @param hotel     查询条件
     * @param pageNum  第几页
     * @param pageSize 每页多少行
     * @return
     */
    @Override
    public PageInfo<Hotel> selectHotelByPage(Hotel hotel, Integer pageNum, Integer pageSize) {
        //开启分页功能
        PageHelper.startPage(pageNum,pageSize);
        //执行查询方法
        if(hotel!=null && hotel.getHotelname()!=null && !hotel.getHotelname().equals("")){
            hotel.setHotelname("%"+hotel.getHotelname()+"%");
        }
        List<Hotel> list = hotelMapper.selectHotelList(hotel);
        //查询结果放入到pageinfo对象
        PageInfo<Hotel> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Hotel selectHotelById(Long hotelid) {
        return hotelMapper.selectByPrimaryKey(hotelid);
    }

    @Override
    public List<Hotel> selectHotelAll(Hotel hotel) {
        return hotelMapper.selectHotelAll(hotel);
    }

    @Override
    public int updateHotel(Hotel hotel) {
        return hotelMapper.updateHotel(hotel);
    }

    @Override
    public List<Hotel> selectHotelList(Hotel hotel) {
        return hotelMapper.selectHotelList(hotel);
    }
}
