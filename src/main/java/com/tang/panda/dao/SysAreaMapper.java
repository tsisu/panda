package com.tang.panda.dao;

import com.tang.panda.pojo.SysArea;

import java.util.List;

public interface SysAreaMapper  {
    int deleteByPrimaryKey(String areaid);

    int insert(SysArea record);

    int insertSelective(SysArea record);

    SysArea selectByPrimaryKey(Long areaid);

    int updateByPrimaryKeySelective(SysArea record);

    int updateByPrimaryKey(SysArea record);

//    Page<SysArea> selectPage(Page<SysArea> page, QueryWrapper<SysArea> wrapper);

    SysArea selectById(Long id);

    int updateSysArea(SysArea area);

    /**
     * 查询景点地域列表
     * @param area
     * @return
     */
    List<SysArea> selectSysAreaList(SysArea area);

    /**
     * 查询所有景点地域
     * @param area
     * @return
     */
    List<SysArea> selectSysAreaAll(SysArea area);
    int delete(String areaid);
}
