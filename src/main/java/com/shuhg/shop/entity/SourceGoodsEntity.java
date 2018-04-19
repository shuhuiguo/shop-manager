package com.shuhg.shop.entity;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 源url
 * Created by 大舒 on 2018/4/17.
 */
@Table(name = "t_source_goods")
public class SourceGoodsEntity {
    @Id
    private Long id;
    /**
     * 编辑商品时，必填
     */
    private Integer goods_id;
    /**
     * 必填
     商品标题，例如，新疆特产 红满疆枣夹核桃500g
     */
    private String goods_name;

    /**
     * 必填
     商品描述， 字数限制：20-500，例如，新包装，保证产品的口感和新鲜度。单颗独立小包装，双重营养，1斤家庭分享装，更实惠新疆一级骏枣夹核桃仁。
     */
    private String goods_desc;
    /**
     * 必填
     叶子类目ID
     */
    private Integer cat_id;

    /**
     * 是否售卖
     */
    private boolean is_on_sale;

    /**
     * 平台类型
     */
    private int platform_type;

    /**
     * 平台名称
     */
    private String platform_name;

    /**
     * 商品源url
     */
    private String goods_url;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getGoods_desc() {
        return goods_desc;
    }

    public void setGoods_desc(String goods_desc) {
        this.goods_desc = goods_desc;
    }

    public Integer getCat_id() {
        return cat_id;
    }

    public void setCat_id(Integer cat_id) {
        this.cat_id = cat_id;
    }

    public boolean isIs_on_sale() {
        return is_on_sale;
    }

    public void setIs_on_sale(boolean is_on_sale) {
        this.is_on_sale = is_on_sale;
    }

    public int getPlatform_type() {
        return platform_type;
    }

    public void setPlatform_type(int platform_type) {
        this.platform_type = platform_type;
    }

    public String getPlatform_name() {
        return platform_name;
    }

    public void setPlatform_name(String platform_name) {
        this.platform_name = platform_name;
    }

    public String getGoods_url() {
        return goods_url;
    }

    public void setGoods_url(String goods_url) {
        this.goods_url = goods_url;
    }
}
