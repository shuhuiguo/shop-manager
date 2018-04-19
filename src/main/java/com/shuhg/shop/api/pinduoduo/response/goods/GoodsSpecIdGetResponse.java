package com.shuhg.shop.api.pinduoduo.response.goods;

/**
 * 生成规格响应对象
 * Created by 大舒 on 2018/4/17.
 */
public class GoodsSpecIdGetResponse{
    /**
     *自定义规格所属的规格ID
     */
    private Integer parent_spec_id;
    /**
     *生成的自定义规格名称
     */
    private String spec_name;
    /**
     *生成的自定义规格ID
     */
    private Integer spec_id;

    public Integer getParent_spec_id() {
        return parent_spec_id;
    }

    public void setParent_spec_id(Integer parent_spec_id) {
        this.parent_spec_id = parent_spec_id;
    }

    public String getSpec_name() {
        return spec_name;
    }

    public void setSpec_name(String spec_name) {
        this.spec_name = spec_name;
    }

    public Integer getSpec_id() {
        return spec_id;
    }

    public void setSpec_id(Integer spec_id) {
        this.spec_id = spec_id;
    }
}
