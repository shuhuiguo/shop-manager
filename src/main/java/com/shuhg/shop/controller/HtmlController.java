package com.shuhg.shop.controller;

import com.shuhg.shop.service.ISourceGoodsService;
import com.shuhg.shop.service.IYangkeduoBizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 大舒 on 2018/3/19.
 */
@Controller
public class HtmlController {
    @Autowired
    ISourceGoodsService goodsSourceService;
    @Autowired
    IYangkeduoBizService yangkeduoBizService;
    @RequestMapping("/{path1}/{path2}")
    public String html(@PathVariable("path1") String path1,@PathVariable("path2") String path2){
        return path1+"/"+path2;
    }
    @RequestMapping("/html/{path1}/{path2}")
    public String html2(@PathVariable("path1") String path1,@PathVariable("path2") String path2){
        return path1+"/"+path2;
    }

    @RequestMapping("/resouce")
    @ResponseBody
    public Object getGoodsResouce(){
        return yangkeduoBizService.getPageStr("ddd");
        //return goodsSourceService.selectByKey(1);
    }
}
