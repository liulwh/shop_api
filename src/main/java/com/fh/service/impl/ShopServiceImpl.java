package com.fh.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fh.bean.po.ShopBean;
import com.fh.bean.po.ShopKYBean;
import com.fh.bean.vo.ShopVo;
import com.fh.mapper.ShopAttrMapper;
import com.fh.mapper.ShopMapper;
import com.fh.service.ShopService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ShopServiceImpl implements ShopService {

    @Resource
    private ShopMapper shopMapper;

    @Resource
    private ShopAttrMapper shopAttrMapper;

    @Override
    @Transactional //事务
    public void addShop(ShopBean shopBean, String attr, String sku) {
        shopMapper.addShop(shopBean);

        List<ShopKYBean> shopKYBeans=new ArrayList<>();

        JSONArray objects = JSONObject.parseArray(attr);
        for (int i = 0; i <objects.size() ; i++) {

            ShopKYBean shopKYBean=new ShopKYBean();
            shopKYBean.setShopId(shopBean.getId());
            shopKYBean.setSkuData(objects.get(i).toString());

            shopKYBeans.add(shopKYBean);
        }

        JSONArray objectsSku = JSONObject.parseArray(sku);

        for (int i = 0; i <objectsSku.size() ; i++) {

            JSONObject dataJs = (JSONObject)objectsSku.get(i);
            ShopKYBean shopKYBean=new ShopKYBean();
            shopKYBean.setShopId(shopBean.getId());
            shopKYBean.setPrice(dataJs.getDouble("price"));
            shopKYBean.setStocks(dataJs.getInteger("stocks"));
            shopKYBean.setSkuData(objectsSku.get(i).toString());

            shopKYBeans.add(shopKYBean);
        }

        shopAttrMapper.add(shopKYBeans);
    }

    @Override
    public Map queryShop(ShopVo shopVo) {
        Map map=new HashMap();
     Integer count= shopMapper.queryCount(shopVo);
     map.put("count",count);
       List<ShopBean> shopBeans=shopMapper.queryShopData(shopVo);
        map.put("data",shopBeans);
        return map;
    }

    @Override
    public void updateShop(ShopBean shopBean) {
        shopMapper.updateShop(shopBean);
    }

    @Override
    public void deleteShop(Integer id) {
        shopMapper.deleteShop(id);
    }

}
