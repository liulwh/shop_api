package com.fh.service;

import com.fh.bean.po.SkuKeyBean;
import com.fh.bean.vo.SkuKVo;

import java.util.Map;

public interface SkuKeyService {
    Map querySkuKeyData(SkuKVo skuKVo);

    void addSkuKey(SkuKeyBean keyBean);

    void updateSkuKey(SkuKeyBean keyBean);

    void delSkuKey(Integer id);
}
