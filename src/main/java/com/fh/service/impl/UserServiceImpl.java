package com.fh.service.impl;

import com.fh.bean.po.UserBean;
import com.fh.mapper.UserMapper;
import com.fh.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    @Override
    @Transactional
    public Map addUser(UserBean userBean) {
     UserBean  userDb=userMapper.queryUserByName(userBean.getName());


       if (userDb==null){
           userMapper.addUser(userBean);
           return null;
       }  else {
           Map map = new HashMap();
           return map;
       }

    }

    @Override
    public Map queryUserByNameAndPassword(String name, String password) {

        Map map=new HashMap();
        UserBean  userDb=userMapper.queryUserByName(name);
          if (userDb==null){
              map.put("code",500);
              map.put("msg","账号不存在");
              return map;
          } else {

              if (!userDb.getPassword().equals(password)){
                  map.put("code",400);
                  map.put("msg","密码错误");
                  return map;
              }

          }

        map.put("code",200);
        map.put("msg","登陆成功");
        return map;
    }


}
