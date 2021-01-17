package com.fh.service;

import com.fh.bean.po.SkuValueBean;

import java.util.Map;

public interface SkuValueService {
    Map queryData(Integer skuId);

    void addSkuValue(SkuValueBean skuValueBean);

    SkuValueBean querySkuValueById(Integer id);
}
