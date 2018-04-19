package com.shuhg.shop.api.pinduoduo.request.goods;

import java.math.BigDecimal;
import java.util.List;

/**
 * sku对象
 * ed by 大舒 on 2018/4/17.
 */
public class SkuListRequest {
    /**
     * 商品规格列表，根据pdd.goods.spec.id.get生成的规格属性id，
     * 例如：颜色规格下商家新增白色和黑色，大小规格下商家新增L和XL，则由4种spec组合，入参一种组合即可，在skulist中需要有4个spec组合的sku
     */
    private List<Integer> spec_id_list;
    /**
     * 必填
     * 重量，单位为g
     */
    private Integer weight;
    /**
     * 必填
     商品sku库存初始数量，后续库存update只使用stocks.update接口进行调用
     */
    private Integer quantity;
    /**
     * 非必填
     商品sku外部编码
     */
    private Integer out_sku_sn;
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
    private Integer is_onsale;

    public List<Integer> getSpec_id_list() {
        return spec_id_list;
    }

    public void setSpec_id_list(List<Integer> spec_id_list) {
        this.spec_id_list = spec_id_list;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getOut_sku_sn() {
        return out_sku_sn;
    }

    public void setOut_sku_sn(Integer out_sku_sn) {
        this.out_sku_sn = out_sku_sn;
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

    public Integer getIs_onsale() {
        return is_onsale;
    }

    public void setIs_onsale(Integer is_onsale) {
        this.is_onsale = is_onsale;
    }
}
