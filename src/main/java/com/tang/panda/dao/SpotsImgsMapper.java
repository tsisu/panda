package com.tang.panda.dao;


import com.tang.panda.pojo.SpotsImgs;

public interface SpotsImgsMapper {
    int deleteByPrimaryKey(Long simgid);

    int insert(SpotsImgs record);

    int insertSelective(SpotsImgs record);

    SpotsImgs selectByPrimaryKey(Long simgid);

    int updateByPrimaryKeySelective(SpotsImgs record);

    int updateByPrimaryKey(SpotsImgs record);
}