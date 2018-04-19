package com.shuhg.shop.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * sku对象
 * ed by 大舒 on 2018/4/17.
 */
@Table(name = "t_source_sku")
public class SourceSkuEntity {
    @Id
    private Long id;

    /**
     * 源商品id
     */
    private Long source_goods_id;
    /**
     * skuId
     */
    private String sku_id;
    /**
     * 必填
     sku预览图，预览图尺寸：等宽高，且高度不低于480px，现已支持1M大小，越清晰越好卖，SKU预览图格式：仅支持JPG,PNG格式
     */
    private String thumb_url;
    /**
     * 必填
     商品团购价格
     */
    private BigDecimal multi_price;
    /**
     * 必填
     商品单买价格
     */
    private BigDecimal price;
    /**
     * 必填
     sku购买限制，只入参999
     */
    private Integer limit_quantity;
    /**
     *
     必填
     sku上架状态，0-已下架，1-上架中
     */
    private Integer is_on_sale;

    /**
     * 商品ID
     */
    private String goods_id;

    /**
     * 格格值json
     */
    private String specs;
    /**
     * 平台类型
     */
    private int platform_type;

    /**
     * 平台名称
     */
    private String platform_name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSource_goods_id() {
        return source_goods_id;
    }

    public void setSource_goods_id(Long source_goods_id) {
        this.source_goods_id = source_goods_id;
    }

    public String getSku_id() {
        return sku_id;
    }

    public void setSku_id(String sku_id) {
        this.sku_id = sku_id;
    }

    public String getThumb_url() {
        return thumb_url;
    }

    public void setThumb_url(String thumb_url) {
        this.thumb_url = thumb_url;
    }

    public BigDecimal getMulti_price() {
        return multi_price;
    }

    public void setMulti_price(BigDecimal multi_price) {
        this.multi_price = multi_price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getLimit_quantity() {
        return limit_quantity;
    }

    public void setLimit_quantity(Integer limit_quantity) {
        this.limit_quantity = limit_quantity;
    }

    public Integer getIs_on_sale() {
        return is_on_sale;
    }

    public void setIs_on_sale(Integer is_on_sale) {
        this.is_on_sale = is_on_sale;
    }

    public String getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(String goods_id) {
        this.goods_id = goods_id;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
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
}
