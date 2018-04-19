package com.shuhg.shop.api.pinduoduo.request.goods;

/**
 生成商家自定义的规格
 * Created by 大舒 on 2018/4/17.
 */
public class GoodsSpecIdGetRequest {
    /**
     *
     该值为：pdd.goods.spec.id.get，配合pdd.goods.spec.get接口获取对应要发布的商品所属叶子类目所需的规格id，
     通过此接口生成对应的规格名称，
     例如叶子类目下某规格id为0，对应规格名称为颜色，通过此接口可以新建颜色规格下颜色、白色等。
     */
    private String type = "pdd.goods.spec.id.get";

    /**
     * 拼多多标准规格ID，可以通过pdd.goods.spec.get接口获取
     */
    private Integer parent_spec_id ;

    /**
     *
     商家编辑的规格值，如颜色规格下设置白色属性
     */
    private String spec_name;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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
}
