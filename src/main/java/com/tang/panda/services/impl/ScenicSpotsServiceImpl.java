package com.tang.panda.services.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tang.panda.dao.ScenicSpotsMapper;
import com.tang.panda.pojo.ScenicSpots;
import com.tang.panda.services.interfaces.ScenicSpotsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScenicSpotsServiceImpl implements ScenicSpotsService {
    @Autowired
    private ScenicSpotsMapper scenicSpotsMapper;
    @Override
    public int insertSpots(ScenicSpots spots) {
        return scenicSpotsMapper.insert(spots);
    }

    @Override
    public List<ScenicSpots> selectScenicSpotsList(ScenicSpots spots) {
        return scenicSpotsMapper.selectScenicSpotsList(spots);
    }

    @Override
    public int updateScenicSpots(ScenicSpots spots) {
        return scenicSpotsMapper.updateScenicSpots(spots);
    }

    /**
     * 分页查询
     *
     * @param spots     查询条件
     * @param pageNum  第几页
     * @param pageSize 每页多少行
     * @return
     */
    @Override
    public PageInfo<ScenicSpots> selectScenicSpotsByPage(ScenicSpots spots, Integer pageNum, Integer pageSize) {
        //开启分页功能
        PageHelper.startPage(pageNum,pageSize);
        //执行查询方法
        if(spots!=null && spots.getSpotsname()!=null && !spots.getSpotsname().equals("")){
            spots.setSpotsname("%"+spots.getSpotsname()+"%");
        }
        List<ScenicSpots> list = scenicSpotsMapper.selectScenicSpotsList(spots);
        //查询结果放入到pageinfo对象
        PageInfo<ScenicSpots> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public ScenicSpots selectScenicSpotsById(Long spotsid) {
        return scenicSpotsMapper.selectByPrimaryKey(spotsid);
    }
    @Override
    public List<ScenicSpots> selectScenicSpotsAll(ScenicSpots spots) {
        return scenicSpotsMapper.selectScenicSpotsAll(spots);
    }



}
