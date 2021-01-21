package com.fh.bean.po;

public class ShopKYBean {

      private  Integer id; //主键

      private  Integer shopId;// 商品 id

      private  String skuData; // sku属性 和非 sku属性

      private  Double price;   //价格

      private  Integer stocks; // 库存


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getSkuData() {
        return skuData;
    }

    public void setSkuData(String skuData) {
        this.skuData = skuData;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStocks() {
        return stocks;
    }

    public void setStocks(Integer stocks) {
        this.stocks = stocks;
    }
}
