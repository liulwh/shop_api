package com.fh.service;

import com.fh.bean.po.SkuValueBean;
import com.fh.bean.vo.SkuValVo;

import java.util.Map;

public interface SkuValueService {
    //Map queryData(Integer skuId);

    void addSkuValue(SkuValueBean skuValueBean);

    SkuValueBean querySkuValueById(Integer id);

    void updateSkuValue(SkuValueBean skuValueBean);

    void deleteSkuValue(Integer id);

    Map queryData(SkuValVo skuValVo);

    Map querySkuValueBySkuKeyId(Integer skuKeyId);
}
