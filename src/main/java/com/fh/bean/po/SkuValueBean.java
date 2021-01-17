package com.fh.bean.po;

public class SkuValueBean {

    private  Integer id;

    private  String name;

    private  String nameCH;

    private  Integer  skuKeyId;

    private  Integer isDel;  // 0显示  1不显示

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameCH() {
        return nameCH;
    }

    public void setNameCH(String nameCH) {
        this.nameCH = nameCH;
    }

    public Integer getSkuKeyId() {
        return skuKeyId;
    }

    public void setSkuKeyId(Integer skuKeyId) {
        this.skuKeyId = skuKeyId;
    }
}
