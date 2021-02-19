package com.fh.controller;

import com.fh.bean.po.RoleBean;
import com.fh.bean.vo.BrandVo;
import com.fh.common.ReturnData;
import com.fh.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/api/role")
public class RoleController {

    @Autowired
    private RoleService roleService;


    @PostMapping("/addRole")
    public ReturnData addRole(RoleBean roleBean){
        roleService.addRole(roleBean);
        return  ReturnData.successs(null);
    }

    @GetMapping("/getRoleDate")
    public ReturnData getRoleDate(BrandVo brandVo){
        Map map = roleService.getRoleDate(brandVo);

        return  ReturnData.successs(map);
    }

    @PostMapping("/updateRole")
    public  ReturnData updateRole(RoleBean roleBean){

        roleService.updateRole(roleBean);
        return ReturnData.successs(null);
    }

    @DeleteMapping("/delRole")
    public  ReturnData delRole(Integer id){
        roleService.delRole(id);
        return  ReturnData.successs(null);
    }

}
