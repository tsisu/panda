package com.tang.panda.services.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tang.panda.dao.SysHotelTypeMapper;
import com.tang.panda.pojo.SysHotelType;
import com.tang.panda.services.interfaces.SysHotelTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysHotelTypeServiceImpl implements SysHotelTypeService {

    @Autowired
    private SysHotelTypeMapper sysHotelTypeMapper;
    @Override
    public SysHotelType selectSysHotelTypeById(Long htid) {
        return sysHotelTypeMapper.selectByPrimaryKey(htid);
    }

    @Override
    public int insertSysHotelType(SysHotelType hotelType) {
        return sysHotelTypeMapper.insert(hotelType);
    }

    @Override
    public int updateSysHotelType(SysHotelType hotelType) {
        return sysHotelTypeMapper.updateSysHotelType(hotelType);
    }

    @Override
    public List<SysHotelType> selectSysHotelTypeList(SysHotelType hotelType) {
        return sysHotelTypeMapper.selectSysHotelTypeList(hotelType);
    }

    @Override
    public PageInfo<SysHotelType> selectSysHotelTypeByPage(SysHotelType hotelType, Integer pageNum, Integer pageSize) {
        //开启分页功能
        PageHelper.startPage(pageNum,pageSize);
        //执行查询方法
        if(hotelType!=null && hotelType.getHtname()!=null && !hotelType.getHtname().equals("")){
            hotelType.setHtname("%"+hotelType.getHtname()+"%");
        }
        List<SysHotelType> list = sysHotelTypeMapper.selectSysHotelTypeList(hotelType);
        //查询结果放入到pageinfo对象
        PageInfo<SysHotelType> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public List<SysHotelType> selectSysHotelTypeAll(SysHotelType hotelType) {
        return sysHotelTypeMapper.selectSysHotelTypeAll(hotelType);
    }

    @Override
    public int delete(String htid) {
        return 0;
    }
}
