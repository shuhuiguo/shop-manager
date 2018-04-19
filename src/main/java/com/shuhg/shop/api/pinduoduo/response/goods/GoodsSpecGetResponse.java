package com.shuhg.shop.api.pinduoduo.response.goods;

/**
 * Created by 大舒 on 2018/4/18.
 */
public class GoodsSpecGetResponse {
    /**
     * 规格所属的叶子类目ID
     */
    private Integer cat_id;
    /**
     *
     商品规格对应的ID
     */
    private Integer parent_spec_id;
    /**
     * 商品规格ID对应的规格名称
     */
    private Integer parent_spec_name;

    public Integer getCat_id() {
        return cat_id;
    }

    public void setCat_id(Integer cat_id) {
        this.cat_id = cat_id;
    }

    public Integer getParent_spec_id() {
        return parent_spec_id;
    }

    public void setParent_spec_id(Integer parent_spec_id) {
        this.parent_spec_id = parent_spec_id;
    }

    public Integer getParent_spec_name() {
        return parent_spec_name;
    }

    public void setParent_spec_name(Integer parent_spec_name) {
        this.parent_spec_name = parent_spec_name;
    }
}
