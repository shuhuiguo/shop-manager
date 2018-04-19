package com.shuhg.shop.api.pinduoduo.request.logistics;

/**
 * Created by 大舒 on 2018/4/18.
 */
public class LogisticsOnlineSendRequest {
    private String type = "pdd.logistics.online.send";
    /**
     * 订单号
     */
    private String order_sn;
    /**
     *
     快递公司编号
     */
    private String logistics_id;
    /**
     * 快递单号
     */
    private String tracking_number;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrder_sn() {
        return order_sn;
    }

    public void setOrder_sn(String order_sn) {
        this.order_sn = order_sn;
    }

    public String getLogistics_id() {
        return logistics_id;
    }

    public void setLogistics_id(String logistics_id) {
        this.logistics_id = logistics_id;
    }

    public String getTracking_number() {
        return tracking_number;
    }

    public void setTracking_number(String tracking_number) {
        this.tracking_number = tracking_number;
    }
}
