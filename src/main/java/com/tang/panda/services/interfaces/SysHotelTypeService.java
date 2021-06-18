package com.tang.panda.services.interfaces;

import com.github.pagehelper.PageInfo;
import com.tang.panda.pojo.SysArea;
import com.tang.panda.pojo.SysHotelType;

import java.util.List;

public interface SysHotelTypeService {

    SysHotelType selectSysHotelTypeById(Long htid);

    int insertSysHotelType(SysHotelType hotelType);

    int updateSysHotelType(SysHotelType hotelType);

    List<SysHotelType> selectSysHotelTypeList(SysHotelType hotelType);

    PageInfo<SysHotelType> selectSysHotelTypeByPage(SysHotelType hotelType, Integer pageNum, Integer pageSize);
    List<SysHotelType> selectSysHotelTypeAll(SysHotelType hotelType);

    int delete(String htid);
}
