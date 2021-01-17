package com.fh.service.impl;

import com.fh.bean.po.SkuValueBean;
import com.fh.mapper.SkuValueMapper;
import com.fh.service.SkuValueService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SkuValueServiceImpl implements SkuValueService {

    @Resource
    private SkuValueMapper skuValueMapper;


    @Override
    public Map queryData(Integer skuId) {
        Map map=new HashMap();

      List<SkuValueBean>  skuValueBeans= skuValueMapper.queryData(skuId);
        map.put("list",skuValueBeans);
        return map;
    }

    @Override
    public void addSkuValue(SkuValueBean skuValueBean) {
        skuValueMapper.addSkuValue(skuValueBean);
    }

    @Override
    public SkuValueBean querySkuValueById(Integer id) {

        return skuValueMapper.querySkuValueById(id);
    }

    @Override
    public void updateSkuValue(SkuValueBean skuValueBean) {
        skuValueMapper.updateSkuValue(skuValueBean);
    }

    @Override
    public void deleteSkuValue(Integer id) {
        skuValueMapper.deleteSkuValue(id);
    }
}
