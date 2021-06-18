package com.tang.panda.controllers;

import com.github.pagehelper.PageInfo;
import com.tang.panda.common.IdWorker;
import com.tang.panda.common.PageData;
import com.tang.panda.pojo.SysArea;
import com.tang.panda.services.interfaces.SysAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * 地域管理controller层
 */
@Controller
@RequestMapping("/sys/area")
public class SysAreaController {

    @Autowired
    private SysAreaService sysAreaService;

    /**
     * 根据地域id查询地域详细信息
     * @param areaid
     * @return
     */
    @RequestMapping("/getarea/{areaid}")
    @ResponseBody
    public SysArea selectSysAreaById(@PathVariable("areaid") Long areaid){
        return sysAreaService.selectSysAreaById(areaid);
    }

    @RequestMapping("/page")
    @ResponseBody
    public PageInfo<SysArea> selectSysArea(){
        return sysAreaService.selectSysAreaByPage(new SysArea(),1,3);
    }

    @RequestMapping("/page1")
    @ResponseBody
    public PageData<SysArea> selectSysAreaByPage(SysArea area,Integer page,Integer limit){
        if(page==null){
            page = 1;

        }
        if (limit == null){
            limit = 3;
        }
        PageInfo<SysArea> pageinfo = sysAreaService.selectSysAreaByPage(area, page, limit);
        PageData<SysArea> pageData = new PageData<>((int)pageinfo.getTotal(),pageinfo.getList());
        return pageData;
    }
        @RequestMapping("/list")
        public List<SysArea> selectSysAreaAll(SysArea area, Model model) {
            List<SysArea> list = sysAreaService.selectSysAreaAll(area);
            model.addAttribute("list",list);
            return list;
        }

    /**
     * 增加景点地域
     * @param area
     * @param model
     * @return
     */
    @RequestMapping("/add")
    public String insertSysArea(SysArea area, Model model){
        IdWorker idWorker = new IdWorker();
        area.setAreaid(idWorker.nextId());
        int rtn = sysAreaService.insertSysArea(area);
        if(rtn>0){
            model.addAttribute("msg","保存成功");
        }else{
            model.addAttribute("msg","增加失败");
        }
        return "sys/area/add";
    }
    /**
     * 修改景点地域
     * @param id
     * @return
     */
    @RequestMapping("/initedit")
    @ResponseBody
    public SysArea initeditpage(Long id){
        return sysAreaService.selectSysAreaById(id);
    }

    @RequestMapping("/update")
    @ResponseBody
    public Integer updateSysArea(SysArea area){
        return sysAreaService.updateSysArea(area);
    }
    @RequestMapping("/delete")
    @ResponseBody
    public int delete(String areaid){
        return sysAreaService.delete(areaid);
    }
}
