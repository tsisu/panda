package com.tang.panda.services.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tang.panda.dao.HotelTrafficMapper;
import com.tang.panda.pojo.HotelTraffic;
import com.tang.panda.services.interfaces.HotelTrafficService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelTrafficServiceImpl implements HotelTrafficService {

    @Autowired
    private HotelTrafficMapper hotelTrafficMapper;
    @Override
    public HotelTraffic selectHotelTrafficById(Long htrid) {
        return hotelTrafficMapper.selectByPrimaryKey(htrid);
    }

    @Override
    public List<HotelTraffic> selectHotelTrafficList(HotelTraffic hotelTraffic) {
        return hotelTrafficMapper.selectHotelTrafficList(hotelTraffic);
    }

    @Override
    public PageInfo<HotelTraffic> selectHotelTrafficByPage(HotelTraffic hotelTraffic, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        if (hotelTraffic!=null&&hotelTraffic.getHtrdestination()!=null&&hotelTraffic.getHtrdestination().equals("")){
            hotelTraffic.setHtrdestination("%"+hotelTraffic.getHtrdestination()+"%");
        }
        List<HotelTraffic> list = hotelTrafficMapper.selectHotelTrafficList(hotelTraffic);
        PageInfo<HotelTraffic> pageInfo = new PageInfo<>();
        return pageInfo;
    }

    @Override
    public List<HotelTraffic> selectHotelTrafficAll(HotelTraffic hotelTraffic) {
        return hotelTrafficMapper.selectHotelTrafficAll(hotelTraffic);
    }

    @Override
    public int insertHotelTraffic(HotelTraffic hotelTraffic) {
        return hotelTrafficMapper.insert(hotelTraffic);
    }
}
