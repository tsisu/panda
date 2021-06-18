package com.tang.panda.dao;


import com.tang.panda.pojo.TravelProductsType;

import java.util.List;

public interface TravelProductsTypeMapper {
    int deleteByPrimaryKey(Long tptypeid);

    int insert(TravelProductsType record);

    int insertSelective(TravelProductsType record);

    TravelProductsType selectByPrimaryKey(Long tptypeid);

    int updateByPrimaryKeySelective(TravelProductsType record);

    int updateByPrimaryKey(TravelProductsType record);

    int updateTravelProductsType(TravelProductsType productsType);

    List<TravelProductsType> selectTravelProductsTypeList(TravelProductsType productsType);

    List<TravelProductsType> selectTravelProductsTypeAll(TravelProductsType productsType);
}