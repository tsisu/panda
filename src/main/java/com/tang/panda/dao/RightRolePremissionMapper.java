package com.tang.panda.dao;


import com.tang.panda.pojo.RightRolePremission;

public interface RightRolePremissionMapper {
    int deleteByPrimaryKey(Long rpid);

    int insert(RightRolePremission record);

    int insertSelective(RightRolePremission record);

    RightRolePremission selectByPrimaryKey(Long rpid);

    int updateByPrimaryKeySelective(RightRolePremission record);

    int updateByPrimaryKey(RightRolePremission record);
}