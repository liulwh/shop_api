package com.fh.bean.vo;

import com.fh.bean.po.SkuValueBean;

public class SkuValVo extends SkuValueBean {

    private  Integer start;

    private  Integer size;

    private  Integer skuKeyId;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    @Override
    public Integer getSkuKeyId() {
        return skuKeyId;
    }

    @Override
    public void setSkuKeyId(Integer skuKeyId) {
        this.skuKeyId = skuKeyId;
    }



    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
