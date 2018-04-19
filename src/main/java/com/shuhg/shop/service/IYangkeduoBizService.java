package com.shuhg.shop.service;

import com.shuhg.shop.model.YangkeduoLoginResult;

/**
 * Created by 大舒 on 2018/3/13.
 */
public interface IYangkeduoBizService {
    /**
     * 获取短信验证码
     * @param mobile
     */
    void sendMobileCode(String mobile);

    /**
     * 根据短信验证码登录
     * @param mobile
     * @param code
     * @return
     */
    YangkeduoLoginResult login(String mobile, String code);

    /**
     * 提取产品页 页面信息
     * @param htmlStr
     * @return
     */
    String getPageStr(String htmlStr);
    public void test(String str);

}
