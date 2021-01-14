package com.fh.service;

import com.fh.bean.po.TypeBean;
import com.fh.common.ReturnData;

import java.util.List;
import java.util.Map;

public interface TypeService {
    void addType(TypeBean bean);

    List<TypeBean>  getData();

    List<TypeBean>   getDataByPid(Integer pid);

    void update(TypeBean bean);
}
