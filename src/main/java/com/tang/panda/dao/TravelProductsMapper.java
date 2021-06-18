package com.tang.panda.dao;


import com.tang.panda.pojo.ScenicSpots;
import com.tang.panda.pojo.TravelProducts;

import java.util.List;

public interface TravelProductsMapper {
    int deleteByPrimaryKey(Long tpid);

    int insert(TravelProducts record);

    int insertSelective(TravelProducts record);

    TravelProducts selectByPrimaryKey(Long tpid);

    int updateByPrimaryKeySelective(TravelProducts record);

    int updateByPrimaryKeyWithBLOBs(TravelProducts record);

    int updateByPrimaryKey(TravelProducts record);

    List<TravelProducts> selectTravelProductsList(TravelProducts products);

    int updateTravelProducts(TravelProducts products);

    List<TravelProducts> selectTravelProductsAll(TravelProducts products);
}