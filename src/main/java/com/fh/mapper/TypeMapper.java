package com.fh.mapper;

import com.fh.bean.po.TypeBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TypeMapper {


    List<TypeBean> getData();

    List<TypeBean> getDataByPid(Integer pid);

    void addType(TypeBean bean);

    void update(TypeBean bean);
}
