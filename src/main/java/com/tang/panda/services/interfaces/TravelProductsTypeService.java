package com.tang.panda.services.interfaces;

import com.github.pagehelper.PageInfo;
import com.tang.panda.pojo.TravelProductsType;

import java.util.List;

public interface TravelProductsTypeService {

    TravelProductsType selectTravelProductsTypeById(Long productsid);

    int insertTravelProductsType(TravelProductsType productsType);

    int updateTravelProductsType(TravelProductsType productsType);


    List<TravelProductsType> selectTravelProductsTypeList(TravelProductsType productsType);


    PageInfo<TravelProductsType> selectTravelProductsTypeByPage(TravelProductsType productsType, Integer pageNum, Integer pageSize);
    List<TravelProductsType> selectTravelProductsTypeAll(TravelProductsType productsType);


    int delete(String productsid);
}
