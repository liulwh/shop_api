package com.fh.mapper;

import com.fh.bean.po.PermissionBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PermissionMapper {

    List<PermissionBean> getData();

    void add(PermissionBean permissionBean);

    void update(PermissionBean permissionBean);
}
