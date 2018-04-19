package com.shuhg.shop.api.pinduoduo.response.goods;

import java.util.List;

/**
 * Created by 大舒 on 2018/4/17.
 */
public class LogisticsTemplateResponse {
    /**
     * 返回的运费模板总数
     */
    private Integer total_count;
    /**
     *
     商家运费模板对象列表
     */
    private List<LogisticsTemplate> logistics_template_list;
}
