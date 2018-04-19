package com.shuhg.shop.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by 大舒 on 2018/4/19.
 */
@Component
public class PinduoduoConfig {
    @Value("${pinduoduo.client.id}")
    private String pinduoduoClientId;

    public String getPinduoduoClientId() {
        return pinduoduoClientId;
    }

    public void setPinduoduoClientId(String pinduoduoClientId) {
        this.pinduoduoClientId = pinduoduoClientId;
    }
}
