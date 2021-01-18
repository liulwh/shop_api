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
@CrossOrigin
public class SkuKeyController {


    @Autowired
   private SkuKeyService skuKeyService;


    /**
     *
     *  属性分页
     *
     * 路径   http://192.168.135:8080/api/skukey/querySkuKeyData
     *
     *请求方式     get 请求
     *
     * 参数  Integer start 页数   Integer size 每页条数  必传 Integer skuKeyId  必传
     *
     * 返回值  code："200",message:"操作成功",data:[{},{}],count:""
     *
     * @param skuKVo
     * @return
     */
    @GetMapping("/querySkuKeyData")
    public ReturnData querySkuKeyData(SkuKVo skuKVo){


      Map map= skuKeyService.querySkuKeyData(skuKVo);

        return  ReturnData.successs(map);
    }

    /**
     *
     *  属性新增
     *
     *  路径 http://192.168.135:8080/api/skukey/addSkuKey
     *
     *  请求方式 post
     *
     *  参数 String name;// 英文名字 如  color String nameCH;//中文名字   如  颜色
     *      Integer typeId;// 类型id  Integer type; // 属性的类型    0 下拉框     1 单选框      2  复选框   3  输入框
     *     Integer isSKU;
     *
     * 返回值  code:"200",message:"操作成功",data:" 空  "
     *
     *
     * @param keyBean
     * @return
     */
    @PostMapping("/addSkuKey")
    public ReturnData addSkuKey(SkuKeyBean keyBean){
       skuKeyService.addSkuKey(keyBean);
        return  ReturnData.successs(null);
    }


    /**
     *  属性修改
     *
     *  路径  http://192.168.135:8080/api/skukey/updateSkuKey
     *
     *  请求方式 post
     *
     *  参数 String name;// 英文名字 如  color String nameCH;//中文名字   如  颜色
     *      Integer typeId;// 类型id  Integer type; // 属性的类型    0 下拉框     1 单选框      2  复选框   3  输入框
     *       Integer isSKU;
     *
     *       Integer id 必传
     *
     *  返回值  code:"200",message:"操作成功",data:" 空  "
     * @param keyBean
     * @return
     */
    @PostMapping("/updateSkuKey")
    public ReturnData updateSkuKey(SkuKeyBean keyBean){
        skuKeyService.updateSkuKey(keyBean);
        return  ReturnData.successs(null);
    }

    /**
     *  属性删除
     *
     *  路径  http://192.168.135:8080/api/skukey/delSkuKey
     *
     *  请求方式 delete
     *
     *  参数 Integer id 必传
     *
     *  返回值  code:"200",message:"操作成功",data:" 空  "
     *
     * @param id
     * @return
     */
    @DeleteMapping("/delSkuKey")
    public ReturnData delSkuKey(Integer id){
        skuKeyService.delSkuKey(id);
        return  ReturnData.successs(null);
    }



}
