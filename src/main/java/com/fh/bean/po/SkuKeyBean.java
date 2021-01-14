package com.fh.bean.po;

import java.util.Date;

public class SkuKeyBean {

    private Integer id;  //主键id

    private String name;// 英文名字 如  color

    private String nameCH;//中文名字   如  颜色

    private Integer typeId;// 品牌 id

    private Integer type; // 属性的类型    0 下拉框     1 单选框      2  复选框   3  输入框

    private Integer isSKU; //  0 是 1 不是

    private Integer isDel; // 0显示 1不显示

    private Date  creataDate;

    private Date  updateDate;

    private String author;// 操作人


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

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getIsSKU() {
        return isSKU;
    }

    public void setIsSKU(Integer isSKU) {
        this.isSKU = isSKU;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Date getCreataDate() {
        return creataDate;
    }

    public void setCreataDate(Date creataDate) {
        this.creataDate = creataDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
