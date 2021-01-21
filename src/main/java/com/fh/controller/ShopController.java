package com.fh.controller;

import com.fh.bean.po.ShopBean;
import com.fh.bean.vo.ShopVo;
import com.fh.common.ReturnData;
import com.fh.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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
    public ReturnData  addShop(ShopBean shopBean,String attr,String sku){
        shopService.addShop(shopBean,attr,sku);

        return  ReturnData.successs(null);
    }


    /**
     * 查询商品
     *
     * 路径   http://localhost:8080/api/shop/queryShop
     *
     * 请求方式 get
     *
     * 参数  Integer  start 页数  Integer size 条数
     *
     * 返回值  code："200",message:"操作成功",data:[{},{}],count:""
     *
     * @param shopVo
     * @return
     */
    @GetMapping("/queryShop")
    public  ReturnData queryShop(ShopVo shopVo){
        Map nap=shopService.queryShop(shopVo);

        return  ReturnData.successs(nap);
    }



}
