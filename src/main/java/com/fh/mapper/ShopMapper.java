package com.fh.mapper;

import com.fh.bean.po.ShopBean;
import com.fh.bean.vo.ShopVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShopMapper {

    void addShop(ShopBean shopBean);

    Integer queryCount(ShopVo shopVo);

    List<ShopBean> queryShopData(ShopVo shopVo);

    void updateShop(ShopBean shopBean);

    void deleteShop(Integer id);
}
