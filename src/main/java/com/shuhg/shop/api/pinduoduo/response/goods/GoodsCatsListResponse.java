package com.shuhg.shop.api.pinduoduo.response.goods;

/**
 * 类目返回
 * Created by 大舒 on 2018/4/17.
 */
public class GoodsCatsListResponse {
    /**
     * 类目层级，1-一级类目，2-二级类目，3-三级类目，4-四级类目
     */
    private Integer level;
    /**
     *商品类目名称
     */
    private String cat_name;
    /**
     * id所属父类目ID，其中，parent_id=0时为顶级节点
     */
    private String parent_id;
    /**
     * 商品类目ID
     */
    private String cat_id;

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public String getCat_id() {
        return cat_id;
    }

    public void setCat_id(String cat_id) {
        this.cat_id = cat_id;
    }
}
