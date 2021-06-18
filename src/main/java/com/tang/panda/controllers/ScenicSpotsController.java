package com.tang.panda.controllers;

import com.github.pagehelper.PageInfo;
import com.tang.panda.common.IdWorker;
import com.tang.panda.common.Message;
import com.tang.panda.common.PageData;
import com.tang.panda.pojo.ScenicSpots;
import com.tang.panda.pojo.SysArea;
import com.tang.panda.services.interfaces.ScenicSpotsService;
import com.tang.panda.services.interfaces.SysAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 景点控制层
 */
@RestController
@RequestMapping("/goods/spots")
public class ScenicSpotsController {
    @Autowired
    private SysAreaService sysAreaService;
    @Autowired
    private ScenicSpotsService scenicSpotsService;
    @ResponseBody
    @RequestMapping("/getarea")
    public List<SysArea> selectAreaByUsed(){
        SysArea area = new SysArea();
        area.setAreastate(1);
        List<SysArea> list = sysAreaService.selectSysAreaList(area);
        return list;
    }

    /**
     * 保存景点信息
     * @param spots
     * @return
     */
    @RequestMapping("/savaarea")
    public Message insertSpots(ScenicSpots spots){
        Message message = new Message();
        IdWorker idWorker = new IdWorker();
        spots.setSpotsid(idWorker.nextId());
        String[] area = spots.getSpotsareaname().split(",");
        spots.setSpotsareaid(Long.parseLong(area[0]));

        spots.setSpotsareaname(area[1]);
        int rtn = scenicSpotsService.insertSpots(spots);
        if (rtn>0){
            message.setMsg("保存成功");
        }else{
            message.setMsg("保存失败");
        }
        message.setCode(rtn);
        return message;
    }

    /**
     * 分页查询
     * @return
     */
    @RequestMapping("/page")
    @ResponseBody
    public PageInfo<ScenicSpots> selectScenicSpots(){
        return scenicSpotsService.selectScenicSpotsByPage(new ScenicSpots(),1,3);
    }

    @RequestMapping("/page1")
    @ResponseBody
    public PageData<ScenicSpots> selectSysAreaByPage(ScenicSpots spots, Integer page, Integer limit){
        if(page==null){
            page = 1;

        }
        if (limit == null){
            limit = 3;
        }
        PageInfo<ScenicSpots> pageinfo = scenicSpotsService.selectScenicSpotsByPage(spots, page, limit);
        PageData<ScenicSpots> pageData = new PageData<>((int)pageinfo.getTotal(),pageinfo.getList());
        return pageData;
    }
    @RequestMapping("/list")
    public List<ScenicSpots> selectScenicSpotsAll(ScenicSpots spots, Model model) {
        List<ScenicSpots> list = scenicSpotsService.selectScenicSpotsAll(spots);
        model.addAttribute("list",list);
        return list;
    }
    /**
     * 修改景点地域
     * @param id
     * @return
     */
    @RequestMapping("/initedit")
    @ResponseBody
    public ScenicSpots initeditpage(Long id){
        return scenicSpotsService.selectScenicSpotsById(id);
    }

    @RequestMapping("/update")
    @ResponseBody
    public Integer updateScenicSpots(ScenicSpots spots){
        String[] area = spots.getSpotsareaname().split(",");
        spots.setSpotsareaid(Long.parseLong(area[0]));
        spots.setSpotsareaname(area[1]);
        return scenicSpotsService.updateScenicSpots(spots);
    }
}
