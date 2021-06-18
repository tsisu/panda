package com.tang.panda.dao;


import com.tang.panda.pojo.RightRole;

public interface RightRoleMapper {
    int deleteByPrimaryKey(Long roleid);

    int insert(RightRole record);

    int insertSelective(RightRole record);

    RightRole selectByPrimaryKey(Long roleid);

    int updateByPrimaryKeySelective(RightRole record);

    int updateByPrimaryKey(RightRole record);
}