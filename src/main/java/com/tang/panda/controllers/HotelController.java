package com.tang.panda.controllers;

import com.github.pagehelper.PageInfo;
import com.tang.panda.common.IdWorker;
import com.tang.panda.common.Message;
import com.tang.panda.common.PageData;
import com.tang.panda.pojo.Hotel;
import com.tang.panda.pojo.SysHotelType;
import com.tang.panda.services.interfaces.HotelService;
import com.tang.panda.services.interfaces.SysHotelTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goods/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @Autowired
    private SysHotelTypeService sysHotelTypeService;

    @ResponseBody
    @RequestMapping("/gethoteltype")
    public List<SysHotelType> selectHotelTypeByUsed(){
        SysHotelType hotelType = new SysHotelType();
        hotelType.setHtstate(1);
        List<SysHotelType> list = sysHotelTypeService.selectSysHotelTypeList(hotelType);
        return list;
    }
    /**
     * 保存酒店信息
     * @param hotel
     * @return
     */
    @RequestMapping("/savahoteltype")
    public Message insertHotel(Hotel hotel){
        Message message = new Message();
        IdWorker idWorker = new IdWorker();
        hotel.setHotelid(idWorker.nextId());
        hotel.setHoteltypeid(idWorker.nextId());
        String[] hotelType = hotel.getHoteltypename().split(",");
        hotel.setHoteltypeid(Long.parseLong(hotelType[0]));

        hotel.setHoteltypename(hotelType[1]);
        int rtn = hotelService.insertHotel(hotel);
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
    public PageInfo<Hotel> selectHotel(){
        return hotelService.selectHotelByPage(new Hotel(),1,3);
    }

    @RequestMapping("/page1")
    @ResponseBody
    public PageData<Hotel> selectHotelByPage(Hotel hotel, Integer page, Integer limit){
        if(page==null){
            page = 1;

        }
        if (limit == null){
            limit = 3;
        }
        PageInfo<Hotel> pageinfo = hotelService.selectHotelByPage(hotel, page, limit);
        PageData<Hotel> pageData = new PageData<>((int)pageinfo.getTotal(),pageinfo.getList());
        return pageData;
    }
    @RequestMapping("/list")
    public List<Hotel> selectScenicSpotsAll(Hotel hotel, Model model) {
        List<Hotel> list = hotelService.selectHotelAll(hotel);
        model.addAttribute("list",list);
        return list;
    }
    /**
     * 修改酒店信息
     * @param id
     * @return
     */
    @RequestMapping("/initedit")
    @ResponseBody
    public Hotel initeditpage(Long id){
        return hotelService.selectHotelById(id);
    }

    @RequestMapping("/update")
    @ResponseBody
    public Integer updateHotel(Hotel hotel){
        String[] hotelType = hotel.getHoteltypename().split(",");
        hotel.setHoteltypeid(Long.parseLong(hotelType[0]));
        hotel.setHoteltypename(hotelType[1]);
        return hotelService.updateHotel(hotel);
    }
}
