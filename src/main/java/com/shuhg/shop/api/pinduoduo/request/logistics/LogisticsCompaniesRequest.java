package com.shuhg.shop.api.pinduoduo.request.logistics;

/**
 * 快递公司查看接口
 * Created by 大舒 on 2018/4/18.
 */
public class LogisticsCompaniesRequest {
    private String type = "pdd.logistics.companies.get";

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
