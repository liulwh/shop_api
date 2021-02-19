package com.fh.service.impl;

import com.fh.bean.po.RoleBean;
import com.fh.bean.vo.BrandVo;
import com.fh.mapper.RoleMapper;
import com.fh.service.RoleService;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleMapper roleMapper;


    @Override
    public void addRole(RoleBean roleBean) {
        roleMapper.addRole(roleBean);
    }

    @Override
    public Map getRoleDate(BrandVo brandVo) {
        Map map=new HashMap();
      Integer count= roleMapper.getRoleCount(brandVo);
        map.put("count",count);
       List<RoleBean> roleBeans= roleMapper.queryRoleData(brandVo);
       map.put("list",roleBeans);
        return map;
    }

    @Override
    public void updateRole(RoleBean roleBean) {
        roleMapper.updateRole(roleBean);
    }

    @Override
    public void delRole(Integer id) {
        roleMapper.delRole(id);
    }
}
