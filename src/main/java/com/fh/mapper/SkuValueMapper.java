package com.fh.mapper;

import com.fh.bean.po.SkuValueBean;
import com.fh.bean.vo.SkuValVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SkuValueMapper {
    List<SkuValueBean> queryData(Integer skuId);

    void addSkuValue(SkuValueBean skuValueBean);

    SkuValueBean querySkuValueById(Integer id);

    void updateSkuValue(SkuValueBean skuValueBean);

    void deleteSkuValue(Integer id);

    Integer queryCount(SkuValVo skuValVo);

    List<SkuValueBean> queryPageData(SkuValVo skuValVo);
}
