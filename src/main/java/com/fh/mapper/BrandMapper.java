package com.fh.mapper;

import com.fh.bean.po.BrandBean;
import com.fh.bean.vo.BrandVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BrandMapper {

    Integer getBrandCount(BrandVo brandVo);

    List<BrandBean> queryBrandDate(BrandVo brandVo);

    void addBrand(BrandBean brandBean);

    BrandBean queryBrandById(Integer id);

    void updateBrand(BrandBean brandBean);

    void delBrand(Integer id);
}
