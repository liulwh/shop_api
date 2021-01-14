package com.fh.controller;


import com.fh.bean.vo.SkuKVo;
import com.fh.common.ReturnData;
import com.fh.service.SkuKeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/skukey")
public class SkuKeyController {


    @Autowired
   private SkuKeyService skuKeyService;


    @GetMapping("/querySkuKeyData")
    public ReturnData querySkuKeyData(SkuKVo skuKVo){
      Map map= skuKeyService.querySkuKeyData(skuKVo);
        return  ReturnData.successs(map);
    }



}
