package com.shuhg.shop.api.pinduoduo.response.goods;

/**
 * 送货上门地区列表
 * Created by 大舒 on 2018/4/17.
 */
public class FreeDeliverHouseArea {
    /**
     *
     北京市
     包邮送货上门的省份
     */
    private String province;
    /**
     *
     北京市
     包邮送货上门的城市
     */
    private String city;
    /**
     *
     东城区
     包邮送货上门的城区
     */
    private String town;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
