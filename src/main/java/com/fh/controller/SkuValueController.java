package com.fh.controller;

import com.fh.bean.po.SkuValueBean;
import com.fh.common.ReturnData;
import com.fh.service.SkuValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/addSkuValue")
    public ReturnData addSkuValue(SkuValueBean skuValueBean){
        skuValueService.addSkuValue(skuValueBean);
        return  ReturnData.successs("");
    }

    @GetMapping("/querySkuValueById")
    public ReturnData querySkuValueById(Integer id){
      SkuValueBean skuValueBean= skuValueService.querySkuValueById(id);
        return  ReturnData.successs(skuValueBean);
    }

}
