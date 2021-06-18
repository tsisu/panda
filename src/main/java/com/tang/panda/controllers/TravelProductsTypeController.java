package com.tang.panda.controllers;

import com.github.pagehelper.PageInfo;
import com.tang.panda.common.IdWorker;
import com.tang.panda.common.PageData;
import com.tang.panda.pojo.TravelProductsType;
import com.tang.panda.services.interfaces.TravelProductsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/sys/productstype")
public class TravelProductsTypeController {
    @Autowired
    private TravelProductsTypeService travelProductsTypeService;

    /**
     * 根据地域id查询地域详细信息
     * @param productsid
     * @return
     */
    @RequestMapping("/getproducts/{productsid}")
    @ResponseBody
    public TravelProductsType selectProductsTypeById(@PathVariable("productsid") Long productsid){
        return travelProductsTypeService.selectTravelProductsTypeById(productsid);
    }

    @RequestMapping("/page")
    @ResponseBody
    public PageInfo<TravelProductsType> selectTravelProductsType(){
        return travelProductsTypeService.selectTravelProductsTypeByPage(new TravelProductsType(),1,3);
    }

    @RequestMapping("/page1")
    @ResponseBody
    public PageData<TravelProductsType> selectTravelProductsTypeByPage(TravelProductsType productsType, Integer page, Integer limit){
        if(page==null){
            page = 1;

        }
        if (limit == null){
            limit = 3;
        }
        PageInfo<TravelProductsType> pageinfo = travelProductsTypeService.selectTravelProductsTypeByPage(productsType, page, limit);
        PageData<TravelProductsType> pageData = new PageData<>((int)pageinfo.getTotal(),pageinfo.getList());
        return pageData;
    }
    @RequestMapping("/list")
    public List<TravelProductsType> selectTravelProductsTypeAll(TravelProductsType productsType, Model model) {
        List<TravelProductsType> list = travelProductsTypeService.selectTravelProductsTypeAll(productsType);
        model.addAttribute("list",list);
        return list;
    }

    /**
     * 增加景点地域
     * @param productsType
     * @param model
     * @return
     */
    @RequestMapping("/add")
    public String insertTravelProductsType(TravelProductsType productsType, Model model){
        IdWorker idWorker = new IdWorker();
        productsType.setTptypeid(idWorker.nextId());
        int rtn = travelProductsTypeService.insertTravelProductsType(productsType);
        if(rtn>0){
            model.addAttribute("msg","保存成功");
        }else{
            model.addAttribute("msg","增加失败");
        }
        return "sys/productstype/add";
    }
    /**
     * 修改景点地域
     * @param id
     * @return
     */
    @RequestMapping("/initedit")
    @ResponseBody
    public TravelProductsType initeditpage(Long id){
        return travelProductsTypeService.selectTravelProductsTypeById(id);
    }

    @RequestMapping("/update")
    @ResponseBody
    public Integer updateTravelProductsType(TravelProductsType productsType){
        return travelProductsTypeService.updateTravelProductsType(productsType);
    }
}
