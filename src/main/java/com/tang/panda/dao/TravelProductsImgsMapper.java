package com.tang.panda.dao;


import com.tang.panda.pojo.TravelProductsImgs;

public interface TravelProductsImgsMapper {
    int deleteByPrimaryKey(Long tpimgid);

    int insert(TravelProductsImgs record);

    int insertSelective(TravelProductsImgs record);

    TravelProductsImgs selectByPrimaryKey(Long tpimgid);

    int updateByPrimaryKeySelective(TravelProductsImgs record);

    int updateByPrimaryKey(TravelProductsImgs record);
}