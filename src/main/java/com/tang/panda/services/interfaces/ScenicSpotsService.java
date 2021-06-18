package com.tang.panda.services.interfaces;

import com.github.pagehelper.PageInfo;
import com.tang.panda.pojo.ScenicSpots;
import com.tang.panda.pojo.SysArea;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ScenicSpotsService {

    int insertSpots(ScenicSpots spots);

    List<ScenicSpots> selectScenicSpotsList(ScenicSpots spots);
    int updateScenicSpots(ScenicSpots spots);
    PageInfo<ScenicSpots> selectScenicSpotsByPage(ScenicSpots spots, Integer pageNum, Integer pageSize);

    ScenicSpots selectScenicSpotsById(Long spotsid);
    List<ScenicSpots> selectScenicSpotsAll(ScenicSpots spots);
}
