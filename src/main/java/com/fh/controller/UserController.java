package com.fh.controller;

import com.fh.bean.po.UserBean;
import com.fh.common.ReturnData;
import com.fh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/user")
@CrossOrigin
public class UserController {


    @Autowired
    private UserService userService;


    @PostMapping("/addUser")
    public ReturnData addUser(UserBean userBean) {

        Map map = userService.addUser(userBean);
        if (map != null) {
            return ReturnData.error(500,"用户名存在");

        }
        return ReturnData.successs(null);

    }

    //loginUser
    @PostMapping("/loginUser")
    public Map loginUser(UserBean userBean){
    Map map= userService.queryUserByNameAndPassword(userBean.getName(),userBean.getPassword());

        return map;
    }
}