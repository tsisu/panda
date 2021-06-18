package com.tang.panda.services.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tang.panda.dao.TravelProductsTypeMapper;
import com.tang.panda.pojo.TravelProductsType;
import com.tang.panda.services.interfaces.TravelProductsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelProductsTypeServiceImpl implements TravelProductsTypeService {

    @Autowired
    private TravelProductsTypeMapper travelProductsTypeMapper;
    @Override
    public TravelProductsType selectTravelProductsTypeById(Long productsid) {
        return travelProductsTypeMapper.selectByPrimaryKey(productsid);
    }

    @Override
    public int insertTravelProductsType(TravelProductsType productsType) {
        return travelProductsTypeMapper.insert(productsType);
    }

    @Override
    public int updateTravelProductsType(TravelProductsType productsType) {
        return travelProductsTypeMapper.updateTravelProductsType(productsType);
    }

    @Override
    public List<TravelProductsType> selectTravelProductsTypeList(TravelProductsType productsType) {
        return travelProductsTypeMapper.selectTravelProductsTypeList(productsType);
    }

    @Override
    public PageInfo<TravelProductsType> selectTravelProductsTypeByPage(TravelProductsType productsType, Integer pageNum, Integer pageSize) {
        //开启分页功能
        PageHelper.startPage(pageNum,pageSize);
        //执行查询方法
        if(productsType!=null && productsType.getTptypename()!=null && !productsType.getTptypename().equals("")){
            productsType.setTptypename("%"+productsType.getTptypename()+"%");
        }
        List<TravelProductsType> list = travelProductsTypeMapper.selectTravelProductsTypeList(productsType);
        //查询结果放入到pageinfo对象
        PageInfo<TravelProductsType> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public List<TravelProductsType> selectTravelProductsTypeAll(TravelProductsType productsType) {
        return travelProductsTypeMapper.selectTravelProductsTypeAll(productsType);
    }

    @Override
    public int delete(String productsid) {
        return 0;
    }
}
