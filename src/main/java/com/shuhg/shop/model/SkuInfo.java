package com.shuhg.shop.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.util.List;

/**
 *  商品信息
 * Created by 大舒 on 2018/3/13.
 */
public class SkuInfo {
    /**
     * sku
     */
    @JSONField(name = "skuID")
    private String skuId;
    /**
     * 数量
     */
    private int quantity;
    /**
     * 是否售卖
     */
    private boolean isOnSale;
    /**
     * 以售卖数量
     */
    private int soldQuantity;
    /**
     * 规格列表:颜色，尺寸
     */
    private List<SpecInfo> specs;
    /**
     * 略缩图
     */
    private String thumbUrl;
    /**
     * 最大购买
     */
    private int limitQuantity;
    /**
     * 售卖价
     */
    private BigDecimal normalPrice;
    /**
     * 组合价
     */
    private BigDecimal groupPrice;
    /**
     * 原价
     */
    private BigDecimal oldGroupPrice;

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isOnSale() {
        return isOnSale;
    }

    public void setOnSale(boolean onSale) {
        isOnSale = onSale;
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(int soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public List<SpecInfo> getSpecs() {
        return specs;
    }

    public void setSpecs(List<SpecInfo> specs) {
        this.specs = specs;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public int getLimitQuantity() {
        return limitQuantity;
    }

    public void setLimitQuantity(int limitQuantity) {
        this.limitQuantity = limitQuantity;
    }

    public BigDecimal getNormalPrice() {
        return normalPrice;
    }

    public void setNormalPrice(BigDecimal normalPrice) {
        this.normalPrice = normalPrice;
    }

    public BigDecimal getGroupPrice() {
        return groupPrice;
    }

    public void setGroupPrice(BigDecimal groupPrice) {
        this.groupPrice = groupPrice;
    }

    public BigDecimal getOldGroupPrice() {
        return oldGroupPrice;
    }

    public void setOldGroupPrice(BigDecimal oldGroupPrice) {
        this.oldGroupPrice = oldGroupPrice;
    }
}
