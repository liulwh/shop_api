package com.fh.controller;

import com.fh.bean.po.BrandBean;
import com.fh.bean.vo.BrandVo;
import com.fh.common.ReturnData;
import com.fh.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/brand")
@CrossOrigin
public class BrandController {

    @Autowired
    private BrandService brandService;



    @GetMapping("/getBrandDate")
    public ReturnData getBrandDate(BrandVo brandVo){
     Map  map = brandService.getBrandDate(brandVo);

        return  ReturnData.successs(map);
    }


    @PostMapping("/addBrand")
    public ReturnData addBrand(BrandBean brandBean){
         brandService.addBrand(brandBean);

        return  ReturnData.successs("");
    }



    @GetMapping("/queryBrandById")
    public ReturnData queryBrandById(Integer id){
      BrandBean brandBean= brandService.queryBrandById(id);

        return  ReturnData.successs(brandBean);
    }


    @PostMapping("/updateBrand")
    public  ReturnData updateBrand(BrandBean brandBean){
        brandService.updateBrand(brandBean);
        return  ReturnData.successs(null);
    }


    @DeleteMapping("/delBrand")
    public  ReturnData delBrand(Integer id){
        brandService.delBrand(id);
        return  ReturnData.successs(null);
    }
}
