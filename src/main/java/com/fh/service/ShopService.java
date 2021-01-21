package com.fh.service;

import com.fh.bean.po.ShopBean;
import com.fh.bean.vo.ShopVo;

import java.util.Map;

public interface ShopService {
    void addShop(ShopBean shopBean,String attr,String sku);

    Map queryShop(ShopVo shopVo);

    void updateShop(ShopBean shopBean);

    void deleteShop(Integer id);

    ShopBean queryShopById(Integer id);
}
