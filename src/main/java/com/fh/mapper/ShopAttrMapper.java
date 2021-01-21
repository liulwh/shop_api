package com.fh.mapper;

import com.fh.bean.po.ShopKYBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ShopAttrMapper {
    void add(@Param("list") List<ShopKYBean> shopKYBeans);
}
