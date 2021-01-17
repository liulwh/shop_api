package com.fh.mapper;

import com.fh.bean.po.SkuValueBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SkuValueMapper {
    List<SkuValueBean> queryData(Integer skuId);

    void addSkuValue(SkuValueBean skuValueBean);
}
