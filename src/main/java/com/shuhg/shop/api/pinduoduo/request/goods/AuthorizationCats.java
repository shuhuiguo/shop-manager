package com.shuhg.shop.api.pinduoduo.request.goods;

/**
 * 获取当前授权商家可发布的商品类目信息
 * Created by 大舒 on 2018/4/17.
 */
public class AuthorizationCats {
    private String type = "pdd.goods.authorization.cats";

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
