package com.shuhg.shop.api.pinduoduo.request;

import java.util.Date;

/**
 * Created by 大舒 on 2018/4/19.
 */
public class BaseRequest {
    public String type;
    public String data_type = "JSON";
    public String version = "V1";
    public String timestamp ;

    public String getType() {
        return type;
    }

    public String getData_type() {
        return data_type;
    }

    public String getVersion() {
        return version;
    }

    public String getTimestamp() {
        Date date = new Date();
        return String.valueOf(date.getTime());
    }


}
