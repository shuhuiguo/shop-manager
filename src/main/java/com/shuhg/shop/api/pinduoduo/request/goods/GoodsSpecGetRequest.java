package com.shuhg.shop.api.pinduoduo.request.goods;

/**
 * 商品属性类目接口
 * Created by 大舒 on 2018/4/18.
 */
public class GoodsSpecGetRequest {
    private String type ="pdd.goods.spec.get";
    /**
     * 叶子类目ID，必须入参level=3时的cat_id,否则无法返回正确的参数
     */
    private Integer cat_id;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCat_id() {
        return cat_id;
    }

    public void setCat_id(Integer cat_id) {
        this.cat_id = cat_id;
    }
}
