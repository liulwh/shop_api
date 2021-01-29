package com.fh.mapper;

import com.fh.bean.po.UserBean;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    UserBean queryUserByName(String name);

    void addUser(UserBean userBean);
}
