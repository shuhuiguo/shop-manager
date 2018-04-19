package com.shuhg.shop.api.pinduoduo.request.order;

/**
 * 订单详情
 * Created by 大舒 on 2018/4/18.
 */
public class OrderInfoRequest {
    private String type = "pdd.order.information.get";
    /**
     * 订单号
     */
    private String order_sn;

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
}
