package com.fh.controller;

import com.fh.bean.po.TypeBean;
import com.fh.common.ReturnData;
import com.fh.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/type")
@CrossOrigin
public class TypeController {

    @Autowired
    private TypeService typeService;


    //  http://ip:port/api/type/getData

     @GetMapping("/getData")
     public ReturnData getData(){
         List<TypeBean> data = typeService.getData();

         return  ReturnData.successs(data);
     }

    @GetMapping("/getDataByPid")
    public ReturnData getDataByPid(Integer pid){
        List<TypeBean> data = typeService.getDataByPid(pid);

        return  ReturnData.successs(data);
    }

    @PostMapping("/add")
    public ReturnData addType(TypeBean bean){
        typeService.addType(bean);
        Integer id = bean.getId();
        return ReturnData.successs(id);
    }


    //路径   http://ip:port/api/type/update

    //post请求
    @PostMapping("/update")
    public ReturnData update(TypeBean bean){
        typeService.update(bean);

        return ReturnData.successs("");
    }






}
