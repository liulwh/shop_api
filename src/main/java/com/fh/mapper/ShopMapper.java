package com.fh.mapper;

import com.fh.bean.po.ShopBean;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShopMapper {

    void addShop(ShopBean shopBean);
}
