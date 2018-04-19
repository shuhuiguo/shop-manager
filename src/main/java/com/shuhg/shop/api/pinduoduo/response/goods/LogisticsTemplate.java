package com.shuhg.shop.api.pinduoduo.response.goods;

import java.util.List;

/**
 *
 商家运费模板对象
 * Created by 大舒 on 2018/4/17.
 */
public class LogisticsTemplate {
    /**
     * true
     对不包邮地区，true-若要包邮须满足件数包邮，false-不开启满足件数包邮
     */
    private boolean is_have_free_min_count;
    /**
     对不包邮地区，满足指定件数包邮，该值为商家设置的指定件数，若为-1则商家没有开启满足件数包邮
     */
    private Integer have_free_min_count;
    /**
     *
     false
     对不包邮地区，true-若要包邮须满足指定价格则可以包邮，false-不开启满足指定价格包邮
     */
    private boolean is_have_free_min_amount;
    /**
     *
     对不包邮地区，满足指定价格包邮，该值为商家设置的指定订单金额，若为-1则商家没有开启满足指定价格包邮，注意，单位为分
     */
    private Integer have_free_min_amount;
    /**
     * 首件或首重，根据cost_type区分，首重返回数值单位为克
     */
    private Integer first_standard;
    /**
     * 首件或首重价格，单位为分
     */
    private Integer first_cost;
    private Integer add_standard;
    /**
续件或续重价格，单位为分
    */
    private Integer add_cost;
    /**
     * 运费模板ID
     */
    private String template_id;
    /**
     * 计费方式，0-按件计费，1-按重量计费
     */
    private Integer cost_type;
    /**
     *
     是否送货上门，对于包邮地区：true-商品包邮且送货上门，false-商品包邮但不送货上门
     */
    private boolean free_deliver_house;
    /**
     * 送货上门地区列表
     * 省市区
     */
    private List<FreeDeliverHouseArea> free_deliver_house_area_list;
    /**
    包邮省份对象
     */
    private List<FreeDeliverHouseArea> free_province_list;

    public boolean isIs_have_free_min_count() {
        return is_have_free_min_count;
    }

    public void setIs_have_free_min_count(boolean is_have_free_min_count) {
        this.is_have_free_min_count = is_have_free_min_count;
    }

    public Integer getHave_free_min_count() {
        return have_free_min_count;
    }

    public void setHave_free_min_count(Integer have_free_min_count) {
        this.have_free_min_count = have_free_min_count;
    }

    public boolean isIs_have_free_min_amount() {
        return is_have_free_min_amount;
    }

    public void setIs_have_free_min_amount(boolean is_have_free_min_amount) {
        this.is_have_free_min_amount = is_have_free_min_amount;
    }

    public Integer getHave_free_min_amount() {
        return have_free_min_amount;
    }

    public void setHave_free_min_amount(Integer have_free_min_amount) {
        this.have_free_min_amount = have_free_min_amount;
    }

    public Integer getFirst_standard() {
        return first_standard;
    }

    public void setFirst_standard(Integer first_standard) {
        this.first_standard = first_standard;
    }

    public Integer getFirst_cost() {
        return first_cost;
    }

    public void setFirst_cost(Integer first_cost) {
        this.first_cost = first_cost;
    }

    public Integer getAdd_standard() {
        return add_standard;
    }

    public void setAdd_standard(Integer add_standard) {
        this.add_standard = add_standard;
    }

    public Integer getAdd_cost() {
        return add_cost;
    }

    public void setAdd_cost(Integer add_cost) {
        this.add_cost = add_cost;
    }

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    public Integer getCost_type() {
        return cost_type;
    }

    public void setCost_type(Integer cost_type) {
        this.cost_type = cost_type;
    }

    public boolean isFree_deliver_house() {
        return free_deliver_house;
    }

    public void setFree_deliver_house(boolean free_deliver_house) {
        this.free_deliver_house = free_deliver_house;
    }

    public List<FreeDeliverHouseArea> getFree_deliver_house_area_list() {
        return free_deliver_house_area_list;
    }

    public void setFree_deliver_house_area_list(List<FreeDeliverHouseArea> free_deliver_house_area_list) {
        this.free_deliver_house_area_list = free_deliver_house_area_list;
    }

    public List<FreeDeliverHouseArea> getFree_province_list() {
        return free_province_list;
    }

    public void setFree_province_list(List<FreeDeliverHouseArea> free_province_list) {
        this.free_province_list = free_province_list;
    }
}
