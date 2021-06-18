package com.tang.panda.dao;


import com.tang.panda.pojo.TravlNode;

public interface TravlNodeMapper {
    int deleteByPrimaryKey(Long tnid);

    int insert(TravlNode record);

    int insertSelective(TravlNode record);

    TravlNode selectByPrimaryKey(Long tnid);

    int updateByPrimaryKeySelective(TravlNode record);

    int updateByPrimaryKeyWithBLOBs(TravlNode record);

    int updateByPrimaryKey(TravlNode record);
}