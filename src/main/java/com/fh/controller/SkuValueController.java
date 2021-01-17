package com.fh.controller;

import com.fh.bean.po.SkuValueBean;
import com.fh.common.ReturnData;
import com.fh.service.SkuValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/SkuValue")
@CrossOrigin
public class SkuValueController {

    @Autowired
    private SkuValueService skuValueService;


    @GetMapping("/queryData")
    public ReturnData  queryData(Integer skuId){
        Map map=skuValueService.queryData(skuId);
        return  ReturnData.successs(map);
    }



}
