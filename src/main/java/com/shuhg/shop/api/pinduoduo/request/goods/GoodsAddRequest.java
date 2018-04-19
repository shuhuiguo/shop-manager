package com.shuhg.shop.api.pinduoduo.request.goods;

import java.util.List;

/**
 * Created by 大舒 on 2018/4/17.
 */
public class GoodsAddRequest {
    /**
     * 新增商品时，必填，编辑商品时，不必填
     */
    protected String type = "pdd.goods.add";
    /**
     * 编辑商品时，必填
     */
    private Integer goods_id;
    /**
     * 必填
     商品标题，例如，新疆特产 红满疆枣夹核桃500g
     */
    private String goods_name;
    /**
     * 必填
     1-国内普通商品，2-进口，3-国外海淘，4-直邮 ,5-流量,6-话费,7,优惠券;8-QQ充值,9-加油卡 暂时支持1-普通商品的上架
     */
    private Integer goods_type =1;
    /**
     * 必填
     商品描述， 字数限制：20-500，例如，新包装，保证产品的口感和新鲜度。单颗独立小包装，双重营养，1斤家庭分享装，更实惠新疆一级骏枣夹核桃仁。
     */
    private String goods_desc;
    /**
     * 必填
     叶子类目ID
     */
    private Integer cat_id;
    /**
     * 非必填
     商品短标题（仅在部分活动中生效），字数限制为4-20字
     */
    private String tiny_name;
    /**
     * 必填
     国家ID，0-中国，暂时只传0（普通商品）
     */
    private Integer country_id = 0;

    /**
     *
     非必填
     保税仓，只在goods_type为直供商品时有效（现阶段暂不支持）
     */
    private String warehouse;
    /**
     *
     非必填
     海关名称，只在goods_type为直供商品时有效（现阶段暂不支持）
     */
    private String customs;
    /**
    非必填
    是否需要上报海关，现阶段入参默认false，入参true会失败
     */
    private boolean is_customs = false;
    /**
     *必填

     市场价格，单位为分
     */
    private Integer market_price;
    /**
     * 必填
     是否预售,true-预售商品，false-非预售商品
     */
    private boolean is_pre_sale;
    /**
     * 非必填
     预售时间，is_pre_sale为1时必传，UNIX时间戳
     */
    private String pre_sale_time;
    /**
     * 必填
     承诺发货时间（ 秒），48小时或24小时，is_pre_sale为1时不必传
     */
    private String shipment_limit_second;
    /**
     *
     必填
     物流运费模板ID，可使用pdd.logistics.template.get获取
     */
    private Integer cost_template_id;
    /**
     * 非必填
     团购人数
     */
    private Integer customer_num;
    /**
     * 非必填
     单次限量
     */
    private Integer buy_limit;
    /**
     *
     非必填
     限购次数
     */
    private Integer order_limit;
    /**
     * 必填
     是否7天无理由退换货，true-支持，false-不支持
     */
    private boolean is_refundable;
    /**
     * 必填
     是否二手商品，true -二手商品 ，false-全新商品
     */
    private boolean second_hand;
    /**
     * 必填
     是否支持假一赔十，false-不支持，true-支持
     */
    private boolean is_folt;
    /**
     * 非必填
     服饰面料，fabirc枚举如下：
     */
    private Integer fabric;
    /**
     *
     非必填
     成分含量
     */
    private Integer fabric_content;
    /**
     * 非必填
     水果类目温馨提示，只在水果类目商品才生效， 字数限制：商品描述goods_desc+温馨提示总计不超过500字。
     */
    private String warm_tips;
    /**
     * 非必填
     食品保质期，cat_id in (63,64,65,92,95,99,101,3853,3862,3867,3872,3876,3900,898,897,3993,1079 )必填
     */
    private Integer shelf_life;
    /**
     *
     非必填
     生产日期起始时间， UNIX时间戳 cat_id in (63,64,65,92,95,99,101,3853,3862,3867,3872,3876,3900,898,897,3993,1079 )必填
     */
    private String start_production_date;
    /**
     *
     非必填
     生产日期结束时间， UNIX时间戳 cat_id in (63,64,65,92,95,99,101,3853,3862,3867,3872,3876,3900,898,897,3993,1079 )必填
     */
    private String end_production_date;
    /**
     * 非必填
     产品标准号， cat_id in (63,64,65,92,95,99,101,3853,3862,3867,3872,3876,3900,898,897,3993,1079 )必填
     */
    private String production_standard_number;
    /**
     * 必填
     sku对象列表
     */
    private List<SkuListRequest> sku_list;
    /**
     *
     非必填
     商品goods外部编码
     */
    private Integer out_goods_id;
    /**
     * 必填
     高清缩略图，上传轮播图首图，尺寸400*400，图片格式仅支持JPG,PNG格式
     */
    private String hd_thumb_url;
    /**
     * 必填
     普通缩略图，上传轮播图首图，尺寸200*200，图片格式仅支持JPG,PNG格式
     */
    private String thumb_url;
    /**
     * 非必填
     商品主图，请参考拼多多首页大图，如果商品参加部分活动则必填，否则无法参加活动 a. 尺寸750 x 352px b. 大小100k以内 c.
     图片格式仅支持JPG,PNG格式 d. 图片背景应以纯白为主, 商品图案居中显示 e. 图片不可以添加任何品牌相关文字或logo
     */
    private String image_url;
    /**
     * 商品详情图： a. 尺寸要求宽度处于480~1200px之间，高度0-1500px之间 b. 大小1M以内 c.
     * 数量限制在20张之间 d. 图片格式仅支持JPG,PNG格式 e. 点击上传时，支持批量上传详情图
     */
    private List<String> carousel_gallery;
    /**
     *
     商品详情图： a. 尺寸要求宽度处于480~1200px之间，高度0-1500px之间 b. 大小1M以内
     c. 数量限制在20张之间 d. 图片格式仅支持JPG,PNG格式 e. 点击上传时，支持批量上传详情图
     */
    private List<String> detail_gallery;
    /**
     * 产品标准号 ，例如23453
     */
    private String production_license;
    /**
     * 仅在cat_id=983（卷筒纸）类目下入参，每包或者卷的净含量，计量单位是g，范围是1~999的整数
     */
    private Integer paper_net_weight;
    /**
     * 仅在cat_id=983（卷筒纸）类目下入参，每段/节纸品的长度，单位是mm，范围是1~999的整数
     */
    private Integer paper_length;
    /**
     *
     仅在cat_id=983（卷筒纸）类目下入参，每段/节的宽度，单位是mm，范围是1~999的整数
     */
    private Integer paper_width;
    /**
     * 仅在cat_id=983（卷筒纸）类目下入参，纸张的层数，单位是层，范围是1~9的整数
     */
    private Integer paper_plies_num;


    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public Integer getGoods_type() {
        return goods_type;
    }

    public void setGoods_type(Integer goods_type) {
        this.goods_type = goods_type;
    }

    public String getGoods_desc() {
        return goods_desc;
    }

    public void setGoods_desc(String goods_desc) {
        this.goods_desc = goods_desc;
    }

    public Integer getCat_id() {
        return cat_id;
    }

    public void setCat_id(Integer cat_id) {
        this.cat_id = cat_id;
    }

    public String getTiny_name() {
        return tiny_name;
    }

    public void setTiny_name(String tiny_name) {
        this.tiny_name = tiny_name;
    }

    public Integer getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Integer country_id) {
        this.country_id = country_id;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getCustoms() {
        return customs;
    }

    public void setCustoms(String customs) {
        this.customs = customs;
    }

    public boolean isIs_customs() {
        return is_customs;
    }

    public void setIs_customs(boolean is_customs) {
        this.is_customs = is_customs;
    }

    public Integer getMarket_price() {
        return market_price;
    }

    public void setMarket_price(Integer market_price) {
        this.market_price = market_price;
    }

    public boolean isIs_pre_sale() {
        return is_pre_sale;
    }

    public void setIs_pre_sale(boolean is_pre_sale) {
        this.is_pre_sale = is_pre_sale;
    }

    public String getPre_sale_time() {
        return pre_sale_time;
    }

    public void setPre_sale_time(String pre_sale_time) {
        this.pre_sale_time = pre_sale_time;
    }

    public String getShipment_limit_second() {
        return shipment_limit_second;
    }

    public void setShipment_limit_second(String shipment_limit_second) {
        this.shipment_limit_second = shipment_limit_second;
    }

    public Integer getCost_template_id() {
        return cost_template_id;
    }

    public void setCost_template_id(Integer cost_template_id) {
        this.cost_template_id = cost_template_id;
    }

    public Integer getCustomer_num() {
        return customer_num;
    }

    public void setCustomer_num(Integer customer_num) {
        this.customer_num = customer_num;
    }

    public Integer getBuy_limit() {
        return buy_limit;
    }

    public void setBuy_limit(Integer buy_limit) {
        this.buy_limit = buy_limit;
    }

    public Integer getOrder_limit() {
        return order_limit;
    }

    public void setOrder_limit(Integer order_limit) {
        this.order_limit = order_limit;
    }

    public boolean isIs_refundable() {
        return is_refundable;
    }

    public void setIs_refundable(boolean is_refundable) {
        this.is_refundable = is_refundable;
    }

    public boolean isSecond_hand() {
        return second_hand;
    }

    public void setSecond_hand(boolean second_hand) {
        this.second_hand = second_hand;
    }

    public boolean isIs_folt() {
        return is_folt;
    }

    public void setIs_folt(boolean is_folt) {
        this.is_folt = is_folt;
    }

    public Integer getFabric() {
        return fabric;
    }

    public void setFabric(Integer fabric) {
        this.fabric = fabric;
    }

    public Integer getFabric_content() {
        return fabric_content;
    }

    public void setFabric_content(Integer fabric_content) {
        this.fabric_content = fabric_content;
    }

    public String getWarm_tips() {
        return warm_tips;
    }

    public void setWarm_tips(String warm_tips) {
        this.warm_tips = warm_tips;
    }

    public Integer getShelf_life() {
        return shelf_life;
    }

    public void setShelf_life(Integer shelf_life) {
        this.shelf_life = shelf_life;
    }

    public String getStart_production_date() {
        return start_production_date;
    }

    public void setStart_production_date(String start_production_date) {
        this.start_production_date = start_production_date;
    }

    public String getEnd_production_date() {
        return end_production_date;
    }

    public void setEnd_production_date(String end_production_date) {
        this.end_production_date = end_production_date;
    }

    public String getProduction_standard_number() {
        return production_standard_number;
    }

    public void setProduction_standard_number(String production_standard_number) {
        this.production_standard_number = production_standard_number;
    }

    public List<SkuListRequest> getSku_list() {
        return sku_list;
    }

    public void setSku_list(List<SkuListRequest> sku_list) {
        this.sku_list = sku_list;
    }

    public Integer getOut_goods_id() {
        return out_goods_id;
    }

    public void setOut_goods_id(Integer out_goods_id) {
        this.out_goods_id = out_goods_id;
    }

    public String getHd_thumb_url() {
        return hd_thumb_url;
    }

    public void setHd_thumb_url(String hd_thumb_url) {
        this.hd_thumb_url = hd_thumb_url;
    }

    public String getThumb_url() {
        return thumb_url;
    }

    public void setThumb_url(String thumb_url) {
        this.thumb_url = thumb_url;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public List<String> getCarousel_gallery() {
        return carousel_gallery;
    }

    public void setCarousel_gallery(List<String> carousel_gallery) {
        this.carousel_gallery = carousel_gallery;
    }

    public List<String> getDetail_gallery() {
        return detail_gallery;
    }

    public void setDetail_gallery(List<String> detail_gallery) {
        this.detail_gallery = detail_gallery;
    }

    public String getProduction_license() {
        return production_license;
    }

    public void setProduction_license(String production_license) {
        this.production_license = production_license;
    }

    public Integer getPaper_net_weight() {
        return paper_net_weight;
    }

    public void setPaper_net_weight(Integer paper_net_weight) {
        this.paper_net_weight = paper_net_weight;
    }

    public Integer getPaper_length() {
        return paper_length;
    }

    public void setPaper_length(Integer paper_length) {
        this.paper_length = paper_length;
    }

    public Integer getPaper_width() {
        return paper_width;
    }

    public void setPaper_width(Integer paper_width) {
        this.paper_width = paper_width;
    }

    public Integer getPaper_plies_num() {
        return paper_plies_num;
    }

    public void setPaper_plies_num(Integer paper_plies_num) {
        this.paper_plies_num = paper_plies_num;
    }
}
