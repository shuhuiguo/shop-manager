package com.shuhg.shop.model;

/**
 * 拼多多登录返回结果
 * Created by 大舒 on 2018/3/13.
 */
public class YangkeduoLoginResult {
    private String accessToken;
    private String acid;
    private String uid;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAcid() {
        return acid;
    }

    public void setAcid(String acid) {
        this.acid = acid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
