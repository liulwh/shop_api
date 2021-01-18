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


    /**
     * 属性value 分页
     *
     * 路径 http://192.168.135:8080/api/SkuValue/queryData
     *
     * 请求路径  get
     *
     * 参数  Integer start 页数 必传 Integer size 条数 必传  Integer skuKeyId  必传
     *
     * 返回值  code："200",message:"操作成功",data:[{},{}],count:""
     *
     *
     * @param SkuValVo
     * @return
     */
    @GetMapping("/queryData")
    public ReturnData  queryData(SkuValVo SkuValVo){
        Map map=skuValueService.queryData(SkuValVo);
        return  ReturnData.successs(map);
    }

    /**
     * 属性value 新增
     *
     * 请求路径  http://192.168.135:8080/api/SkuValue/addSkuValue
     *
     * 请求方式 post
     *
     * 参数   String name 英文名称  String nameCH 中文名称     Integer  skuKeyId  必传
     *
     *  返回值  code:"200",message:"操作成功",data:" 空  "
     *
     * @param skuValueBean
     * @return
     */
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


    /**
     * 属性 value修改
     *
     * 请求路径  http://192.168.135:8080/api/SkuValue/updateSkuValue
     *
     * 请求方式 post
     *
     * 参数   String name 英文名称  String nameCH 中文名称     Integer  skuKeyId  必传
     *
     *
     * 返回值  code:"200",message:"操作成功",data:" 空  "
     * @param skuValueBean
     * @return
     */
    @PostMapping("/updateSkuValue")
    public ReturnData updateSkuValue(SkuValueBean skuValueBean){
        skuValueService.updateSkuValue(skuValueBean);
        return  ReturnData.successs("");
    }

    /**
     * 属性 value 删除
     *
     * 请求路径   http://192.168.135:8080/api/SkuValue/deleteSkuValue
     *
     * 请求方式 delete
     *
     * 参数  Integer id 必传
     *
     * 返回值  code:"200",message:"操作成功",data:" 空  "
     *
     * @param id
     * @return
     */
    @DeleteMapping("/deleteSkuValue")
    public ReturnData deleteSkuValue(Integer id){
        skuValueService.deleteSkuValue(id);
        return  ReturnData.successs("");
    }


}
