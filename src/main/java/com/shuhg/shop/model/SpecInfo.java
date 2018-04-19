package com.shuhg.shop.model;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 规格
 * Created by 大舒 on 2018/3/13.
 */
public class SpecInfo {
    /**
     * 规格信息
     */
    @JSONField(name = "spec_key")
    private String specKey;

    /**
     * 规格值
     */
    @JSONField(name = "spec_value")
    private String specValue;

    public String getSpecKey() {
        return specKey;
    }

    public void setSpecKey(String specKey) {
        this.specKey = specKey;
    }

    public String getSpecValue() {
        return specValue;
    }

    public void setSpecValue(String specValue) {
        this.specValue = specValue;
    }
}
