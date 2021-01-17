package com.fh.service.impl;

import com.fh.bean.po.SkuKeyBean;
import com.fh.bean.vo.SkuKShow;
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

       List<SkuKShow> skuKShows= skuKeyMapper.queryListShow(skuKVo);
        map.put("list",skuKShows);

        return map;
    }

    @Override
    public void addSkuKey(SkuKeyBean keyBean) {
        skuKeyMapper.addSkuKey(keyBean);
    }

    @Override
    public void updateSkuKey(SkuKeyBean keyBean) {
        skuKeyMapper.updateSkuKey(keyBean);
    }

    @Override
    public void delSkuKey(Integer id) {
        skuKeyMapper.delSkuKey(id);
    }
}
