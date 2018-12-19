package com.shuhg.shop.service.impl;

import com.shuhg.shop.model.YangkeduoLoginResult;
import com.shuhg.shop.service.IYangkeduoBizService;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 大舒 on 2018/3/13.
 */
@Service("yangkeduoBizService")
public class YangkeduoBizServiceImpl implements IYangkeduoBizService {


    /**
     * 获取短信验证码
     *
     * @param mobile
     */
    @Override
    public void sendMobileCode(String mobile) {

    }

    /**
     * 根据短信验证码登录
     *
     * @param mobile
     * @param code
     * @return
     */
    @Override
    public YangkeduoLoginResult login(String mobile, String code) {
        return null;
    }

    /**
     * 提取产品页 页面信息
     *
     * @param htmlStr
     * @return
     */
    @Override
    public String getPageStr(String htmlStr) {
        String regex = "(window.rawData=)(.*);";
        Pattern r = Pattern.compile(regex);
        Matcher m = r.matcher(htmlStr);
        String data = "";
        while (m.find()){
            data = m.group();
            data = data.replace("window.rawData=","").trim();
            data = data.substring(0,data.lastIndexOf(";"));
            return data;
        }
        //yangkeduoBizService.test("ccc");
        return null;
    }

    public void test(String str){
        System.out.println();
    }
}
