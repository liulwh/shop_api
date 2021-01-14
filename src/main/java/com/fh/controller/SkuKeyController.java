package com.fh.controller;


import com.fh.bean.po.SkuKeyBean;
import com.fh.bean.vo.SkuKVo;
import com.fh.common.ReturnData;
import com.fh.service.SkuKeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/addSkuKey")
    public ReturnData addSkuKey(SkuKeyBean keyBean){
       skuKeyService.addSkuKey(keyBean);
        return  ReturnData.successs(null);
    }



    @PostMapping("/updateSkuKey")
    public ReturnData updateSkuKey(SkuKeyBean keyBean){
        skuKeyService.updateSkuKey(keyBean);
        return  ReturnData.successs(null);
    }

    @DeleteMapping("/delSkuKey")
    public ReturnData delSkuKey(Integer id){
        skuKeyService.delSkuKey(id);
        return  ReturnData.successs(null);
    }



}
