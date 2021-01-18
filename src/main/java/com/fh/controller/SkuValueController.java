package com.fh.controller;

import com.fh.bean.po.SkuValueBean;
import com.fh.bean.vo.SkuValVo;
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
    public ReturnData  queryData(SkuValVo SkuValVo){
        Map map=skuValueService.queryData(SkuValVo);
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

    @PostMapping("/updateSkuValue")
    public ReturnData updateSkuValue(SkuValueBean skuValueBean){
        skuValueService.updateSkuValue(skuValueBean);
        return  ReturnData.successs("");
    }

    @DeleteMapping("/deleteSkuValue")
    public ReturnData deleteSkuValue(Integer id){
        skuValueService.deleteSkuValue(id);
        return  ReturnData.successs("");
    }


}
