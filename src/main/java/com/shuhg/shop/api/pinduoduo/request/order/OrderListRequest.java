package com.shuhg.shop.api.pinduoduo.request.order;

/**
 * Created by 大舒 on 2018/4/18.
 */
public class OrderListRequest {
    private String type = "pdd.order.number.list.get";
    /**
     *
     发货状态，1：待发货 2：已发货待签收 3：已签收 5：全部 暂时只开放待发货订单查询
     */
    private Integer order_status = 1;
    /**
     * 返回数量，默认100。最大100
     */
    private Integer page_size = 100;
    /**
     * 返回页码 默认1，页码从1开始 PS：当前采用分页返回，数量和页数会一起传，如果不传，则采用默认值
     */
    private Integer page = 1;
}
