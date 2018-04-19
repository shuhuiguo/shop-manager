package com.shuhg.shop.api.pinduoduo.response.order;

/**
 * 订单项详情
 * Created by 大舒 on 2018/4/18.
 */
public class OrderItem {
    /**
     * 商品编号
     */
    private String goods_id;
    /**
     * 商品规格编码
     */
    private String sku_id;
    /**
     *
     商家外部编码（sku）
     */
    private String outer_id;
    /**
     * 商家外部编码（商品）
     */
    private String outer_goods_id;
    /**
     * 商品名称
     */
    private String goods_name;
    /**
     * 商品销售价格
     */
    private String goods_price;
    /**
     *
     商品规格，使用（规格值1,规格值2）组合作为sku的表示，中间以英文逗号隔开
     */
    private String goods_spec;
    /**
     * 商品数量
     */
    private String goods_count;
    /**
     * 商品图片
     */
    private String goods_img;

    public String getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(String goods_id) {
        this.goods_id = goods_id;
    }

    public String getSku_id() {
        return sku_id;
    }

    public void setSku_id(String sku_id) {
        this.sku_id = sku_id;
    }

    public String getOuter_id() {
        return outer_id;
    }

    public void setOuter_id(String outer_id) {
        this.outer_id = outer_id;
    }

    public String getOuter_goods_id() {
        return outer_goods_id;
    }

    public void setOuter_goods_id(String outer_goods_id) {
        this.outer_goods_id = outer_goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(String goods_price) {
        this.goods_price = goods_price;
    }

    public String getGoods_spec() {
        return goods_spec;
    }

    public void setGoods_spec(String goods_spec) {
        this.goods_spec = goods_spec;
    }

    public String getGoods_count() {
        return goods_count;
    }

    public void setGoods_count(String goods_count) {
        this.goods_count = goods_count;
    }

    public String getGoods_img() {
        return goods_img;
    }

    public void setGoods_img(String goods_img) {
        this.goods_img = goods_img;
    }
}
