package com.shuhg.shop.api.pinduoduo.response.logistics;

/**
 * Created by 大舒 on 2018/4/18.
 */
public class AddressResponse {
    /**
     * 是否有效，0-无效，1-有效
     */
    private Integer is_enabled;
    /**
     *
     地区邮编
     */
    private Integer national_code;
    /**
     *
     地区层级，1-省份，2-市级，3-区级
     */
    private Integer region_type;
    /**
     * 地区名称
     */
    private String region_name;
    /**
     * 父地区ID，顶点id为0
     */
    private Integer parent_idv;
    /**
     * 地区ID
     */
    private Integer id;

    public Integer getIs_enabled() {
        return is_enabled;
    }

    public void setIs_enabled(Integer is_enabled) {
        this.is_enabled = is_enabled;
    }

    public Integer getNational_code() {
        return national_code;
    }

    public void setNational_code(Integer national_code) {
        this.national_code = national_code;
    }

    public Integer getRegion_type() {
        return region_type;
    }

    public void setRegion_type(Integer region_type) {
        this.region_type = region_type;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }

    public Integer getParent_idv() {
        return parent_idv;
    }

    public void setParent_idv(Integer parent_idv) {
        this.parent_idv = parent_idv;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
