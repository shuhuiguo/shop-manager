package com.shuhg.shop.api.pinduoduo.request.goods;

/**
 * 类目请求参数
 * Created by 大舒 on 2018/4/17.
 */
public class CatsRequest {

    private String type = "pdd.goods.cats.get";
    /**
     * 值=0时为顶点cat_id,通过树顶级节点获取cat树
     */
    private Integer parent_cat_id= 0;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getParent_cat_id() {
        return parent_cat_id;
    }

    public void setParent_cat_id(Integer parent_cat_id) {
        this.parent_cat_id = parent_cat_id;
    }
}
