package com.shuhg.shop.api.pinduoduo.request.goods;

/**
 * 商品运费模版接口
 * Created by 大舒 on 2018/4/17.
 */
public class LogisticsTemplateRequest {
    private String type = "pdd.goods.logistics.template.get";
    /**
     *
     非必填
     默认返回运费模板的页数为1，最高为100页，注意：page与page_size必须传一个
     */
    private Integer page = 1;
    /**
     *
     非必填
     默认返回20条模板数据，最多100条数据
     */
    private Integer page_size= 20;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPage_size() {
        return page_size;
    }

    public void setPage_size(Integer page_size) {
        this.page_size = page_size;
    }
}
