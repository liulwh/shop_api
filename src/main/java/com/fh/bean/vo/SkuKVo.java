package com.fh.bean.vo;

import com.fh.bean.po.SkuKeyBean;

public class SkuKVo extends SkuKeyBean {

    private  Integer start;

    private  Integer size;


    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
