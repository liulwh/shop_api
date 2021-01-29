package com.fh.service;

import com.fh.bean.po.UserBean;

import java.util.Map;

public interface UserService {
    Map addUser(UserBean userBean);



    Map queryUserByNameAndPassword(String name, String password);
}
