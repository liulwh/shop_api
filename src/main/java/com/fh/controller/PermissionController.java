package com.fh.controller;

import com.fh.bean.po.PermissionBean;
import com.fh.common.ReturnData;
import com.fh.service.PermissionService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/permission")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;


    @GetMapping("/getData")
    public ReturnData getData(){
      List<PermissionBean> data= permissionService.getData();

        return  ReturnData.successs(data);
    }

    @PostMapping("/add")
    public ReturnData add(PermissionBean permissionBean){
        permissionService.add(permissionBean);

        return  ReturnData.successs(null);
    }

    @PostMapping("update")
    public ReturnData update(PermissionBean permissionBean){
        permissionService.update(permissionBean);

        return  ReturnData.successs(null);
    }

}
