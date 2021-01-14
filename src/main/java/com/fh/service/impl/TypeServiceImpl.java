package com.fh.service.impl;

import com.fh.bean.po.TypeBean;
import com.fh.common.ReturnData;
import com.fh.mapper.TypeMapper;
import com.fh.service.TypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TypeServiceImpl implements TypeService {

    @Resource
    private TypeMapper typeMapper;


    @Override
    public void addType(TypeBean bean) {
        typeMapper.addType(bean);
    }

    @Override
    public List<TypeBean> getData() {
     List<TypeBean> typeBeans= typeMapper.getData();
        return typeBeans;
    }

    @Override
    public List<TypeBean> getDataByPid(Integer pid) {
        List<TypeBean> typeBeans=typeMapper.getDataByPid(pid);
        return typeBeans;
    }

    @Override
    public void update(TypeBean bean) {
        typeMapper.update(bean);
    }
}
