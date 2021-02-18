package com.fh.service.impl;

import com.fh.bean.po.PermissionBean;
import com.fh.mapper.PermissionMapper;
import com.fh.service.PermissionService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Resource
    private PermissionMapper permissionMapper;


    @Override
    public List<PermissionBean> getData() {

        return permissionMapper.getData();
    }

    @Override
    public void add(PermissionBean permissionBean) {
        permissionMapper.add(permissionBean);
    }

    @Override
    public void update(PermissionBean permissionBean) {
        permissionMapper.update(permissionBean);
    }
}
