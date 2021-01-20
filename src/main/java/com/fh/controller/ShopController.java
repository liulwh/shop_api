package com.fh.controller;

import com.fh.bean.po.ShopBean;
import com.fh.common.ReturnData;
import com.fh.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/shop")
@CrossOrigin
public class ShopController {


    @Autowired
    private ShopService shopService;


    /**
     * 新增商品
     *
     *路径   http://192.168.135:8080/api/shop/addShop
     *
     * 请求方式  post
     *
     * 参数
     *
     * 返回值  code:"200",message:"操作成功",data:" 空  "
     *
     *
     * @param shopBean
     * @return
     */
    @PostMapping("/addShop")
    public ReturnData  addShop(ShopBean shopBean){
        shopService.addShop(shopBean);

        return  ReturnData.successs(null);
    }



}
