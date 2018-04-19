package com.shuhg.shop.api.pinduoduo.response.order;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by 大舒 on 2018/4/18.
 */
public class OrderInfoResponse {
    /**
     * 订单编号
     */
    private String order_sn;
    /**
     * 1970-01-01 08:00:00
     成团时间
     */
    private String confirm_time;
    /**
     *
     1970-01-01 08:00:00
     创建时间
     */
    private String created_time;
    /**
     * 中国
     收件地国家
     */
    private String country;
    /**
     *
     上海
     收件地省份
     */
    private String province;
    /**
     * 上海
     收件地城市
     */
    private String city;
    /**
     * 长宁区
     收件地区县
     */
    private String town;
    /**
     *
     上海上海长宁区东诸安浜路1258 号 1106 室
     收件详细地址
     */
    private String address;
    /**
     *
     小bo
     收件人姓名
     */
    private String receiver_name;
    /**
     * 15996315633
     收件人电话，仅订单状态为待发货状态下返回明文，其他状态下返回脱敏手机号，例如“1387677****”
     */
    private String receiver_phone;
    /**
     * 11.00
     支付金额（元）
     */
    private BigDecimal pay_amount;
    /**
     *
     11.00
     商品金额（元）
     */
    private BigDecimal goods_amount;
    /**
     1.00
     折扣金额（元）
     */
    private BigDecimal discount_amount;
    /**
     *
     4100000084201804116305817320
     支付单号
     */
    private String pay_no;
    /**
     *
     0
     邮费
     */
    private BigDecimal postage;
    /**
     *
     WEIXIN
     支付方式，枚举值：QQ,WEIXIN,ALIPAY
     */
    private String pay_type;
    /**
     *
     身份证号码，海淘商品订单专用
     */
    private String id_card_num;
    /**
     *
     身份证姓名，海淘商品订单专用
     */
    private String id_card_name;
    /**
     *
     1
     快递公司编号
     */
    private String logistics_id;
    /**
     *
     131315454315
     快递运单号
     */
    private String tracking_number;
    /**
     *
     2018-04-12 12:08:35
     发货时间
     */
    private String shipping_time;
    /**
     *
     1
     发货状态，枚举值：1：待发货，2：已发货待签收，3：已签收
     */
    private String order_status;
    /**
     *
     1
     是否抽奖订单，0-抽奖订单，1-非抽奖订单
     */
    private String is_lucky_flag;
    /**
    1
    退款状态，枚举值：1：无售后或售后关闭，2：售后处理中，3：退款中，4： 退款成功
     */
    private String refund_status;
    /**
     *
     2018-04-12 23:28:48
     订单最近一次更新时间
     */
    private String updated_at;
    /**
     *
     2018-04-13 11:16:22
     订单承诺发货时间
     */
    private String last_ship_time;
    /**
     *
     商家订单备注
     */
    private String remark;
    /**
     * 订单中商品sku列表
     */
    private List<OrderItem> item_list;
    /**
     * 1.0
     平台优惠金额
     */
    private BigDecimal platform_discount;
    /**
     *
     1.0
     店铺优惠金额
     */
    private BigDecimal seller_discount;
    /**
     *
     10.00
     团长免单优惠金额，只在团长免单活动中才会返回优惠金额
     */
    private BigDecimal capital_free_discount;

    public String getOrder_sn() {
        return order_sn;
    }

    public void setOrder_sn(String order_sn) {
        this.order_sn = order_sn;
    }

    public String getConfirm_time() {
        return confirm_time;
    }

    public void setConfirm_time(String confirm_time) {
        this.confirm_time = confirm_time;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getReceiver_name() {
        return receiver_name;
    }

    public void setReceiver_name(String receiver_name) {
        this.receiver_name = receiver_name;
    }

    public String getReceiver_phone() {
        return receiver_phone;
    }

    public void setReceiver_phone(String receiver_phone) {
        this.receiver_phone = receiver_phone;
    }

    public BigDecimal getPay_amount() {
        return pay_amount;
    }

    public void setPay_amount(BigDecimal pay_amount) {
        this.pay_amount = pay_amount;
    }

    public BigDecimal getGoods_amount() {
        return goods_amount;
    }

    public void setGoods_amount(BigDecimal goods_amount) {
        this.goods_amount = goods_amount;
    }

    public BigDecimal getDiscount_amount() {
        return discount_amount;
    }

    public void setDiscount_amount(BigDecimal discount_amount) {
        this.discount_amount = discount_amount;
    }

    public String getPay_no() {
        return pay_no;
    }

    public void setPay_no(String pay_no) {
        this.pay_no = pay_no;
    }

    public BigDecimal getPostage() {
        return postage;
    }

    public void setPostage(BigDecimal postage) {
        this.postage = postage;
    }

    public String getPay_type() {
        return pay_type;
    }

    public void setPay_type(String pay_type) {
        this.pay_type = pay_type;
    }

    public String getId_card_num() {
        return id_card_num;
    }

    public void setId_card_num(String id_card_num) {
        this.id_card_num = id_card_num;
    }

    public String getId_card_name() {
        return id_card_name;
    }

    public void setId_card_name(String id_card_name) {
        this.id_card_name = id_card_name;
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

    public String getShipping_time() {
        return shipping_time;
    }

    public void setShipping_time(String shipping_time) {
        this.shipping_time = shipping_time;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public String getIs_lucky_flag() {
        return is_lucky_flag;
    }

    public void setIs_lucky_flag(String is_lucky_flag) {
        this.is_lucky_flag = is_lucky_flag;
    }

    public String getRefund_status() {
        return refund_status;
    }

    public void setRefund_status(String refund_status) {
        this.refund_status = refund_status;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getLast_ship_time() {
        return last_ship_time;
    }

    public void setLast_ship_time(String last_ship_time) {
        this.last_ship_time = last_ship_time;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<OrderItem> getItem_list() {
        return item_list;
    }

    public void setItem_list(List<OrderItem> item_list) {
        this.item_list = item_list;
    }

    public BigDecimal getPlatform_discount() {
        return platform_discount;
    }

    public void setPlatform_discount(BigDecimal platform_discount) {
        this.platform_discount = platform_discount;
    }

    public BigDecimal getSeller_discount() {
        return seller_discount;
    }

    public void setSeller_discount(BigDecimal seller_discount) {
        this.seller_discount = seller_discount;
    }

    public BigDecimal getCapital_free_discount() {
        return capital_free_discount;
    }

    public void setCapital_free_discount(BigDecimal capital_free_discount) {
        this.capital_free_discount = capital_free_discount;
    }
}
