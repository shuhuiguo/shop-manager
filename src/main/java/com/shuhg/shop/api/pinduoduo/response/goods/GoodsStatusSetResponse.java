package com.shuhg.shop.api.pinduoduo.response.goods;

/**
 * 商品上架状态设置
 * Created by 大舒 on 2018/4/18.
 */
public class GoodsStatusSetResponse {
    /**
     * 是否修改成功
     */
    private boolean is_success;

    public boolean isIs_success() {
        return is_success;
    }

    public void setIs_success(boolean is_success) {
        this.is_success = is_success;
    }
}
