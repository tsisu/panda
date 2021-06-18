package com.tang.panda.services.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tang.panda.dao.SysAreaMapper;
import com.tang.panda.pojo.SysArea;
import com.tang.panda.services.interfaces.SysAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 系统地域管理service层实现类
 */
@Service
public class SysAreaServiceImpl implements SysAreaService {

    @Autowired
    private SysAreaMapper sysAreaMapper;

    /**
     * 根据id查询地域详细信息
     *
     * @param areaid 地域id
     * @return
     */
    @Override
    public SysArea selectSysAreaById(Long areaid) {
        return sysAreaMapper.selectByPrimaryKey(areaid);
    }

    /**
     * 查询景点地域列表
     *
     * @param area
     * @return
     */
    @Override
    public List<SysArea> selectSysAreaList(SysArea area) {
        return sysAreaMapper.selectSysAreaList(area);
    }

    /**
     * 分页查询
     *
     * @param area     查询条件
     * @param pageNum  第几页
     * @param pageSize 每页多少行
     * @return
     */
    @Override
    public PageInfo<SysArea> selectSysAreaByPage(SysArea area, Integer pageNum, Integer pageSize) {
        //开启分页功能
        PageHelper.startPage(pageNum,pageSize);
        //执行查询方法
        if(area!=null && area.getAreaname()!=null && !area.getAreaname().equals("")){
            area.setAreaname("%"+area.getAreaname()+"%");
        }
        List<SysArea> list = sysAreaMapper.selectSysAreaList(area);
        //查询结果放入到pageinfo对象
        PageInfo<SysArea> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    /**
     * 删除
     * @param areaid
     * @return
     */
    @Override
    public int delete(String areaid) {
        return sysAreaMapper.delete(areaid);
    }
//    @Override
//    public Page<SysArea> selectSysAreaByPage(SysArea area, int curindex, int limit) {
//        //
//        //开启分页功能
//        //PageHelper.startPage(curindex,limit);
//        //执行查询方法
//        QueryWrapper<SysArea> wrapper = new QueryWrapper<>();
//        if(area!=null && area.getAreastate()!=null && area.getAreastate()!=-1) {
//            wrapper.eq("areastate", area.getAreastate());
//        }
//        if(area!=null && area.getAreaname()!=null &&!area.getAreaname().equals("")) {
//            wrapper.like("areaname", "%" + area.getAreaname() + "%");
//        }
//        Page<SysArea> page = new Page<>(curindex,limit);
//        return sysAreaMapper.selectPage(page,wrapper);
//    }

    /**
     * 插入地域
     *
     * @param area
     * @return
     */
    @Override
    public int insertSysArea(SysArea area) {

        return sysAreaMapper.insert(area);
    }
    @Override
    public int updateSysArea(SysArea area) {
        return sysAreaMapper.updateSysArea(area);
    }

    /**
     * 查询所有地域景点列表
     * @param area
     * @return
     */
    @Override
    public List<SysArea> selectSysAreaAll(SysArea area) {
        return sysAreaMapper.selectSysAreaAll(area);
    }

}
