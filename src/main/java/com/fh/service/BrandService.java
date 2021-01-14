package com.fh.service;

import com.fh.bean.po.BrandBean;
import com.fh.bean.vo.BrandVo;

import java.util.List;
import java.util.Map;

public interface BrandService {

    Map getBrandDate(BrandVo brandVo);

    void addBrand(BrandBean brandBean);

    void updateBrand(BrandBean brandBean);

    BrandBean queryBrandById(Integer id);

    void delBrand(Integer id);
}
