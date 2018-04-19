package com.shuhg.shop.api.pinduoduo.response.goods;

/**
 * 获取当前授权商家可发布的商品类目信息
 * Created by 大舒 on 2018/4/17.
 */
public class AuthorizationGoodsCatsList {
    /**
     * 对应ID下的类目名称
     */
    private String cat_name;
    /**
     * 类目ID，一级类目ID
     */
    private Integer cat_id;

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }

    public Integer getCat_id() {
        return cat_id;
    }

    public void setCat_id(Integer cat_id) {
        this.cat_id = cat_id;
    }
}
