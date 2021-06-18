package com.tang.panda.services.interfaces;

import com.github.pagehelper.PageInfo;
import com.tang.panda.pojo.TravelProducts;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TravelProductsService {
    int insertProducts(TravelProducts products);

    List<TravelProducts> selectTravelProductsList(TravelProducts products);
    int updateTravelProducts(TravelProducts products);
    PageInfo<TravelProducts> selectTravelProductsByPage(TravelProducts products, Integer pageNum, Integer pageSize);

    TravelProducts selectTravelProductsById(Long tpid);
    List<TravelProducts> selectTravelProductsAll(TravelProducts products);
}

