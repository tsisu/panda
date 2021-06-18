package com.tang.panda.dao;


import com.tang.panda.pojo.SysColumn;

public interface SysColumnMapper {
    int deleteByPrimaryKey(Long colid);

    int insert(SysColumn record);

    int insertSelective(SysColumn record);

    SysColumn selectByPrimaryKey(Long colid);

    int updateByPrimaryKeySelective(SysColumn record);

    int updateByPrimaryKey(SysColumn record);
}