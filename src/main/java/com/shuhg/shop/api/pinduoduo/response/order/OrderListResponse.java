package com.shuhg.shop.api.pinduoduo.response.order;

import java.util.List;

/**
 * 订单全量列表 暂时只开放待发货订单查询
 * Created by 大舒 on 2018/4/18.
 */
public class OrderListResponse {
    /**
     * 当前页订单总数
     */
    private Integer total_count;
    /**
     订单编号
     */
    private List<String> order_sn_list;

    public Integer getTotal_count() {
        return total_count;
    }

    public void setTotal_count(Integer total_count) {
        this.total_count = total_count;
    }

    public List<String> getOrder_sn_list() {
        return order_sn_list;
    }

    public void setOrder_sn_list(List<String> order_sn_list) {
        this.order_sn_list = order_sn_list;
    }
}
