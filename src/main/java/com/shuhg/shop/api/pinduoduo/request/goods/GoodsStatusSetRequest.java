package com.shuhg.shop.api.pinduoduo.request.goods;

/**
 * 商品上架状态设置
 * Created by 大舒 on 2018/4/18.
 */
public class GoodsStatusSetRequest {
    /**
     * 拼多多商品id
     */
    private Integer goods_id;
    /**
     * 上下架状态：1:上架 0:下架
     */
    private Integer is_onsale =1;

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public Integer getIs_onsale() {
        return is_onsale;
    }

    public void setIs_onsale(Integer is_onsale) {
        this.is_onsale = is_onsale;
    }
}
