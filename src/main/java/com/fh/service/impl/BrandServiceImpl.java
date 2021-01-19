package com.fh.service.impl;

import com.fh.bean.po.BrandBean;
import com.fh.bean.vo.BrandVo;
import com.fh.mapper.BrandMapper;
import com.fh.service.BrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BrandServiceImpl implements BrandService {

    @Resource
    private BrandMapper brandMapper;


    @Override
    public Map getBrandDate(BrandVo brandVo) {
        Map map=new HashMap();
        Integer count = brandMapper.getBrandCount(brandVo);
        map.put("count",count);
      List<BrandBean> brandBeans= brandMapper.queryBrandDate(brandVo);
        map.put("list",brandBeans);
        return map;
    }

    @Override
    public void addBrand(BrandBean brandBean) {
        brandMapper.addBrand(brandBean);
    }

    @Override
    public void updateBrand(BrandBean brandBean) {
        brandMapper.updateBrand(brandBean);
    }

    @Override
    public BrandBean queryBrandById(Integer id) {
        return brandMapper.queryBrandById(id);

    }

    @Override
    public void delBrand(Integer id) {
        brandMapper.delBrand(id);
    }

    @Override
    public Map queryBrandData() {
        Map map=new HashMap();

     List<BrandBean> brandBeans=   brandMapper.queryBrandData();
        map.put("data",brandBeans);

        return map;
    }
}
