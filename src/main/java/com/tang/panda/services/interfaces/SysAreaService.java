package com.tang.panda.services.interfaces;

import com.github.pagehelper.PageInfo;
import com.tang.panda.pojo.SysArea;

import java.util.List;

/**
 * 系统地域管理service层接口
 */
public interface SysAreaService {
    /**
     * 根据id查询地域详细信息
     * @param areaid 地域id
     * @return
     */
    SysArea selectSysAreaById(Long areaid);
    /**
     * 插入地域
     * @param area
     * @return
     */
    int insertSysArea(SysArea area);
    /**
     * 分页查询
     * @param area
     * @param curindex 当前第几页
     * @return
     */
//    Page<SysArea> selectSysAreaByPage(SysArea area, int curindex, int limit);
    /**
     * 编辑景点地域
     * @param area
     * @return
     */
    int updateSysArea(SysArea area);

    /**
     * 查询景点地域列表
     * @param area
     * @return
     */
    List<SysArea> selectSysAreaList(SysArea area);

    /**
     * 分页查询
     * @param area 查询条件
     * @param pageNum 第几页
     * @param pageSize 每页多少行
     * @return
     */
    PageInfo<SysArea> selectSysAreaByPage(SysArea area, Integer pageNum, Integer pageSize);
    List<SysArea> selectSysAreaAll(SysArea area);

    /**
     * 删除
     * @param areaid
     * @return
     */
    int delete(String areaid);
}

