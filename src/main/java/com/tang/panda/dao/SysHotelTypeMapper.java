package com.tang.panda.dao;


import com.tang.panda.pojo.SysHotelType;

import java.util.List;

public interface SysHotelTypeMapper {
    int deleteByPrimaryKey(Long htid);

    int insert(SysHotelType record);

    int insertSelective(SysHotelType record);

    int updateSysHotelType(SysHotelType hotelType);

    List<SysHotelType> selectSysHotelTypeList(SysHotelType hotelType);

    List<SysHotelType> selectSysHotelTypeAll(SysHotelType hotelType);

    SysHotelType selectByPrimaryKey(Long htid);

    int updateByPrimaryKeySelective(SysHotelType record);

    int updateByPrimaryKey(SysHotelType record);
}