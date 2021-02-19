package com.fh.service;

import com.fh.bean.po.RoleBean;
import com.fh.bean.vo.BrandVo;

import java.util.Map;

public interface RoleService {
    void addRole(RoleBean roleBean);

    Map getRoleDate(BrandVo brandVo);

    void updateRole(RoleBean roleBean);

    void delRole(Integer id);
}
