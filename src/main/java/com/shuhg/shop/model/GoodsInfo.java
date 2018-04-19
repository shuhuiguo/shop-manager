package com.shuhg.shop.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * 产品信息
 * Created by 大舒 on 2018/3/13.
 */
public class GoodsInfo {
    /**
     * 产品ID
     */
    @JSONField(name = "goodsId")
    private String goodsId;
    /**
     * 产品名
     */
    private String goodsName;
    /**
     * 产品说明
     */
    private String goodsDesc;
    /**
     * 略缩图
     */
    private String thumbUrl;
    /**
     * 是否售卖
     */
    private boolean isOnSale;
    /**
     * 轮播图
     */
    private List<String> topGallery;

    /**
     * 商品描述图片
     */
    private List<ImageInfo> detailGallery;

    /**
     * sku
     */
    private List<SkuInfo> skus;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public boolean isOnSale() {
        return isOnSale;
    }

    public void setOnSale(boolean onSale) {
        isOnSale = onSale;
    }

    public List<String> getTopGallery() {
        return topGallery;
    }

    public void setTopGallery(List<String> topGallery) {
        this.topGallery = topGallery;
    }

    public List<ImageInfo> getDetailGallery() {
        return detailGallery;
    }

    public void setDetailGallery(List<ImageInfo> detailGallery) {
        this.detailGallery = detailGallery;
    }

    public List<SkuInfo> getSkus() {
        return skus;
    }

    public void setSkus(List<SkuInfo> skus) {
        this.skus = skus;
    }
}
