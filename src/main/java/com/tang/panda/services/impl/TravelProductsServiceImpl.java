package com.tang.panda.services.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tang.panda.dao.TravelProductsMapper;
import com.tang.panda.pojo.ScenicSpots;
import com.tang.panda.pojo.TravelProducts;
import com.tang.panda.services.interfaces.TravelProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelProductsServiceImpl implements TravelProductsService {
    @Autowired
    private TravelProductsMapper travelProductsMapper;
    @Override
    public int insertProducts(TravelProducts products) {
        return travelProductsMapper.insert(products);
    }

    @Override
    public List<TravelProducts> selectTravelProductsList(TravelProducts products) {
        return travelProductsMapper.selectTravelProductsList(products);
    }

    @Override
    public int updateTravelProducts(TravelProducts products) {
        return travelProductsMapper.updateTravelProducts(products);
    }

    @Override
    public PageInfo<TravelProducts> selectTravelProductsByPage(TravelProducts products, Integer pageNum, Integer pageSize) {
        //开启分页功能
        PageHelper.startPage(pageNum,pageSize);
        //执行查询方法
        if(products!=null &&products.getTpname()!=null && !products.getTpname().equals("")){
            products.setTpname("%"+products.getTpname()+"%");
        }
        List<TravelProducts> list = travelProductsMapper.selectTravelProductsList(products);
        //查询结果放入到pageinfo对象
        PageInfo<TravelProducts> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public TravelProducts selectTravelProductsById(Long tpid) {
        return travelProductsMapper.selectByPrimaryKey(tpid);
    }

    @Override
    public List<TravelProducts> selectTravelProductsAll(TravelProducts products) {
        return travelProductsMapper.selectTravelProductsAll(products);
    }
}
