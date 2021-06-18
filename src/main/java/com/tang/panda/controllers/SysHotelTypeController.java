package com.tang.panda.controllers;

import com.github.pagehelper.PageInfo;
import com.tang.panda.common.IdWorker;
import com.tang.panda.common.PageData;
import com.tang.panda.pojo.SysHotelType;
import com.tang.panda.services.interfaces.SysHotelTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/sys/hoteltype")
public class SysHotelTypeController {
        @Autowired
        private SysHotelTypeService sysHotelTypeService;

        /**
         * 根据地域id查询地域详细信息
         * @param htid
         * @return
         */
        @RequestMapping("/gethoteltype/{htid}")
        @ResponseBody
        public SysHotelType selectSysHotelTypeById(@PathVariable("htid") Long htid){
            return sysHotelTypeService.selectSysHotelTypeById(htid);
        }

        @RequestMapping("/page")
        @ResponseBody
        public PageInfo<SysHotelType> selectSysHotelType(){
            return sysHotelTypeService.selectSysHotelTypeByPage(new SysHotelType(),1,3);
        }

        @RequestMapping("/page1")
        @ResponseBody
        public PageData<SysHotelType> selectSysHotelTypeByPage(SysHotelType hotelType, Integer page, Integer limit){
            if(page==null){
                page = 1;

            }
            if (limit == null){
                limit = 3;
            }
            PageInfo<SysHotelType> pageinfo = sysHotelTypeService.selectSysHotelTypeByPage(hotelType, page, limit);
            PageData<SysHotelType> pageData = new PageData<>((int)pageinfo.getTotal(),pageinfo.getList());
            return pageData;
        }
        @RequestMapping("/list")
        public List<SysHotelType> selectSysHotelTypeAll(SysHotelType hotelType, Model model) {
            List<SysHotelType> list = sysHotelTypeService.selectSysHotelTypeAll(hotelType);
            model.addAttribute("list",list);
            return list;
        }

        /**
         * 增加景点地域
         * @param hotelType
         * @param model
         * @return
         */
        @RequestMapping("/add")
        public String insertSysHotelType(SysHotelType hotelType, Model model){
            IdWorker idWorker = new IdWorker();
            hotelType.setHtid(idWorker.nextId());
            int rtn = sysHotelTypeService.insertSysHotelType(hotelType);
            if(rtn>0){
                model.addAttribute("msg","保存成功");
            }else{
                model.addAttribute("msg","增加失败");
            }
            return "sys/hoteltype/add";
        }
        /**
         * 修改景点地域
         * @param id
         * @return
         */
        @RequestMapping("/initedit")
        @ResponseBody
        public SysHotelType initeditpage(Long id){
            return sysHotelTypeService.selectSysHotelTypeById(id);
        }

        @RequestMapping("/update")
        @ResponseBody
        public Integer updateSysHotelType(SysHotelType hotelType){
            return sysHotelTypeService.updateSysHotelType(hotelType);
        }
}
