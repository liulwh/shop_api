package com.fh.mapper;

import com.fh.bean.po.SkuKeyBean;
import com.fh.bean.vo.SkuKShow;
import com.fh.bean.vo.SkuKVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SkuKeyMapper {

    Integer queryCount(SkuKVo skuKVo);

    List<SkuKeyBean> queryList(SkuKVo skuKVo);

    List<SkuKShow> queryListShow(SkuKVo skuKVo);

    void addSkuKey(SkuKeyBean keyBean);

    void updateSkuKey(SkuKeyBean keyBean);

    void delSkuKey(Integer id);
}
