package com.shuhg.shop.entity;

import java.util.Date;

/**
 * Created by 大舒 on 2018/4/23.
 */
public class BaseEntity {
    public Date create_time;
    public Date update_time;

    public Date getCreate_time() {
        if(create_time == null){
            return new Date();
        }
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}
