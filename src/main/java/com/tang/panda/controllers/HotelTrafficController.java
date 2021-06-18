package com.tang.panda.controllers;

import com.github.pagehelper.PageInfo;
import com.tang.panda.common.IdWorker;
import com.tang.panda.common.Message;
import com.tang.panda.common.PageData;
import com.tang.panda.pojo.HotelTraffic;
import com.tang.panda.services.interfaces.HotelTrafficService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/goods/traffic")
public class HotelTrafficController {
    @Autowired
    private HotelTrafficService hotelTrafficService;

    @RequestMapping("/gettraffic/{htrid}")
    @ResponseBody
    public HotelTraffic selectHotelTrafficById(@PathVariable("htrid") Long htrid){
        return hotelTrafficService.selectHotelTrafficById(htrid);
    }

    @RequestMapping("/page")
    @ResponseBody
    public PageInfo<HotelTraffic> selectHotelTraffic(){
        return hotelTrafficService.selectHotelTrafficByPage(new HotelTraffic(),1,3);
    }

    @RequestMapping("/page1")
    @ResponseBody
    public PageData<HotelTraffic> selectHotelTrafficByPage(HotelTraffic hotelTraffic, Integer page, Integer limit){
        if(page==null){
            page = 1;

        }
        if (limit == null){
            limit = 3;
        }
        PageInfo<HotelTraffic> pageinfo = hotelTrafficService.selectHotelTrafficByPage(hotelTraffic, page, limit);
        PageData<HotelTraffic> pageData = new PageData<>((int)pageinfo.getTotal(),pageinfo.getList());
        return pageData;
    }
    @RequestMapping("/list")
    public List<HotelTraffic> selectHotelTrafficAll(HotelTraffic hotelTraffic, Model model) {
        List<HotelTraffic> list = hotelTrafficService.selectHotelTrafficAll(hotelTraffic);
        model.addAttribute("list",list);
        return list;
    }
    @RequestMapping("/savatraffic")
    public Message insertHotelTraffic(HotelTraffic hotelTraffic){
        Message message = new Message();
        IdWorker idWorker = new IdWorker();
        /*spots.setSpotsid(idWorker.nextId());
        String[] area = spots.getSpotsareaname().split(",");
        spots.setSpotsareaid(Long.parseLong(area[0]));

        spots.setSpotsareaname(area[1]);*/
        int rtn = hotelTrafficService.insertHotelTraffic(hotelTraffic);
        if (rtn>0){
            message.setMsg("保存成功");
        }else{
            message.setMsg("保存失败");
        }
        message.setCode(rtn);
        return message;
    }
}
