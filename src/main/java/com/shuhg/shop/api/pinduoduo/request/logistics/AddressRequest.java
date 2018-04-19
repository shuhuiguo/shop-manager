package com.shuhg.shop.api.pinduoduo.request.logistics;

import com.shuhg.shop.api.pinduoduo.request.BaseRequest;

/**
 * 获取拼多多标准国家地址库
 * Created by 大舒 on 2018/4/18.
 */
public class AddressRequest extends BaseRequest{
    private String type = "pdd.logistics.address.get";

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
