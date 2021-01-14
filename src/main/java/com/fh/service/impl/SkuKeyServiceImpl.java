package com.fh.service.impl;

import com.fh.bean.po.SkuKeyBean;
import com.fh.bean.vo.SkuKVo;
import com.fh.mapper.SkuKeyMapper;
import com.fh.service.SkuKeyService;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SkuKeyServiceImpl implements SkuKeyService {

    @Resource
    private SkuKeyMapper skuKeyMapper;

    @Override
    public Map querySkuKeyData(SkuKVo skuKVo) {
        Map map=new HashMap();

      Integer count= skuKeyMapper.queryCount(skuKVo);
        map.put("count",count);

       List<SkuKeyBean> skuKeyBeans= skuKeyMapper.queryList(skuKVo);
        map.put("list",skuKeyBeans);

        return map;
    }
}
