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


    /**
     *
     *  品牌分页
     *
     * 路径   http://192.168.135:8080/api/brand/getBrandDate
     *
     * 请求方式     get 请求
     *
     * 参数  Integer start 页数   Integer size 每页条数  必传
     *
     * 返回值  code："200",message:"操作成功",data:[{},{}],count:""
     *
     * @param brandVo
     * @return
     */
    @GetMapping("/getBrandDate")
    public ReturnData getBrandDate(BrandVo brandVo){
     Map  map = brandService.getBrandDate(brandVo);

        return  ReturnData.successs(map);
    }


    /**
     * 新增品牌信息
     *
     * 路径  http://192.168.135:8080/api/brand/addBrand
     *
     * 请求方式  post
     *
     * 参数  String name 品牌名称   String imgpath 图片路径  String brandDesc 品牌介绍
     *
     *      Integer ord 排序 数字  可传可不传
     *
     * 返回值  code:"200",message:"操作成功",data:" 空  "
     *
     *
     * @param brandBean
     * @return
     */
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


    /**
     * 品牌修改
     *
     *
     * 路径  http://192.168.135:8080/api/brand/updateBrand
     *
     * 请求方式 post
     *
     * 参数  String name 品牌名称   String imgpath 图片路径  String brandDesc 品牌介绍
     *  Integer ord 排序 数字  可传可不传   Integer id 必传
     *
     * 返回值类型  code:"200",message:"操作成功",data:" 空  "
     *
     * @param brandBean
     * @return
     */
    @PostMapping("/updateBrand")
    public  ReturnData updateBrand(BrandBean brandBean){
        brandService.updateBrand(brandBean);
        return  ReturnData.successs(null);
    }


    /**
     * 品牌删除
     *
     * 路径 http://192.168.135:8080/api/brand/delBrand
     *
     * 请求方式  delete
     *
     * 参数   Integer id 必传
     *
     * 返回值类型  code:"200",message:"操作成功",data:" 空  "
     *
     * @param id
     * @return
     */
    @DeleteMapping("/delBrand")
    public  ReturnData delBrand(Integer id){
        brandService.delBrand(id);
        return  ReturnData.successs(null);
    }

}
