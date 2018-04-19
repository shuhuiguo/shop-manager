package com.shuhg.shop.api.pinduoduo.response.logistics;

/**
 * Created by 大舒 on 2018/4/18.
 */
public class LogisticsCompaniesResponse {
    /**
     * 快递公司编码
     */
    private String id;
    /**
     *
     快递公司名称
     */
    private String logistics_company;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogistics_company() {
        return logistics_company;
    }

    public void setLogistics_company(String logistics_company) {
        this.logistics_company = logistics_company;
    }
}
