package com.fh.mapper;

import com.fh.bean.po.RoleBean;
import com.fh.bean.vo.BrandVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {

    void addRole(RoleBean roleBean);

    Integer getRoleCount(BrandVo brandVo);

    List<RoleBean> queryRoleData(BrandVo brandVo);

    void updateRole(RoleBean roleBean);

    void delRole(Integer id);
}
