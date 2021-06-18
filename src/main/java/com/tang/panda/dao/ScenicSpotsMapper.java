package com.tang.panda.dao;


import com.tang.panda.pojo.ScenicSpots;
import com.tang.panda.pojo.SysArea;

import java.util.List;

public interface ScenicSpotsMapper {
    int deleteByPrimaryKey(Long spotsid);

    int insert(ScenicSpots record);

    int insertSelective(ScenicSpots record);

    ScenicSpots selectByPrimaryKey(Long spotsid);

    int updateByPrimaryKeySelective(ScenicSpots record);

    int updateByPrimaryKeyWithBLOBs(ScenicSpots record);

    int updateByPrimaryKey(ScenicSpots record);

    List<ScenicSpots> selectScenicSpotsList(ScenicSpots spots);

    int updateScenicSpots(ScenicSpots spots);
    List<ScenicSpots> selectScenicSpotsAll(ScenicSpots spots);
}
