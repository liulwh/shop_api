package com.fh.service.impl;

import com.fh.bean.po.ShopBean;
import com.fh.mapper.ShopMapper;
import com.fh.service.ShopService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ShopServiceImpl implements ShopService {

    @Resource
    private ShopMapper shopMapper;

    @Override
    public void addShop(ShopBean shopBean) {
        shopMapper.addShop(shopBean);
    }
}
