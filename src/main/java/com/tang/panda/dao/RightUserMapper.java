package com.tang.panda.dao;


import com.tang.panda.pojo.RightUser;

public interface RightUserMapper {
    int deleteByPrimaryKey(Long userid);

    int insert(RightUser record);

    int insertSelective(RightUser record);

    RightUser selectByPrimaryKey(Long userid);

    int updateByPrimaryKeySelective(RightUser record);

    int updateByPrimaryKey(RightUser record);
}