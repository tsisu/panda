package com.tang.panda.dao;


import com.tang.panda.pojo.SysShufflingPic;

public interface SysShufflingPicMapper {
    int deleteByPrimaryKey(Long imgid);

    int insert(SysShufflingPic record);

    int insertSelective(SysShufflingPic record);

    SysShufflingPic selectByPrimaryKey(Long imgid);

    int updateByPrimaryKeySelective(SysShufflingPic record);

    int updateByPrimaryKey(SysShufflingPic record);
}