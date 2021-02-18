package com.fh.service;

import com.fh.bean.po.PermissionBean;

import java.util.List;

public interface PermissionService {
    List<PermissionBean> getData();

    void add(PermissionBean permissionBean);

    void update(PermissionBean permissionBean);
}
