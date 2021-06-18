package com.tang.panda.dao;


import com.tang.panda.pojo.RightPermission;

public interface RightPermissionMapper {
    int deleteByPrimaryKey(Long preid);

    int insert(RightPermission record);

    int insertSelective(RightPermission record);

    RightPermission selectByPrimaryKey(Long preid);

    int updateByPrimaryKeySelective(RightPermission record);

    int updateByPrimaryKey(RightPermission record);
}