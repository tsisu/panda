package com.tang.panda.controllers;

import com.github.pagehelper.PageInfo;
import com.tang.panda.common.IdWorker;
import com.tang.panda.common.Message;
import com.tang.panda.common.PageData;
import com.tang.panda.pojo.Hotel;
import com.tang.panda.pojo.TravelProducts;
import com.tang.panda.services.interfaces.HotelService;
import com.tang.panda.services.interfaces.TravelProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goods/products")
public class TravelProductsController {
    @Autowired
    private TravelProductsService travelProductsService;

    @ResponseBody
    @RequestMapping("/gettps")
    public List<TravelProducts> selectProductsByUsed(){
        TravelProducts products = new TravelProducts();
        products.setTpstate(1);
        List<TravelProducts> list = travelProductsService.selectTravelProductsList(products);
        return list;
    }
    /**
     *
     * 保存酒店信息
     * @param products
     * @return
     */
    @RequestMapping("/savatps")
    public Message insertProducts(TravelProducts products){
        Message message = new Message();
        IdWorker idWorker = new IdWorker();
        products.setTpid(idWorker.nextId());
        int rtn = travelProductsService.insertProducts(products);
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
    public PageInfo<TravelProducts> selectHotel(){
        return travelProductsService.selectTravelProductsByPage(new TravelProducts(),1,3);
    }

    @RequestMapping("/page1")
    @ResponseBody
    public PageData<TravelProducts> selectTravelProductsByPage(TravelProducts products, Integer page, Integer limit){
        if(page==null){
            page = 1;

        }
        if (limit == null){
            limit = 3;
        }
        PageInfo<TravelProducts> pageinfo = travelProductsService.selectTravelProductsByPage(products, page, limit);
        PageData<TravelProducts> pageData = new PageData<>((int)pageinfo.getTotal(),pageinfo.getList());
        return pageData;
    }
    @RequestMapping("/list")
    public List<TravelProducts> selectTravelProductsAll(TravelProducts products, Model model) {
        List<TravelProducts> list = travelProductsService.selectTravelProductsAll(products);
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
    public TravelProducts initeditpage(Long id){
        return travelProductsService.selectTravelProductsById(id);
    }

    @RequestMapping("/update")
    @ResponseBody
    public Integer updateTravelProducts(TravelProducts products){
        return travelProductsService.updateTravelProducts(products);
    }
}
