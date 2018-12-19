package com.shuhg.shop.facade;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.base.CaseFormat;
import com.shuhg.shop.constant.PlatformtypeEnum;
import com.shuhg.shop.entity.SourceGoodsEntity;
import com.shuhg.shop.entity.SourceSkuEntity;
import com.shuhg.shop.service.ISourceGoodsService;
import com.shuhg.shop.service.ISourceSkuService;
import com.shuhg.shop.service.IYangkeduoBizService;
import com.shuhg.shop.service.IdService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by 大舒 on 2018/4/19.
 */
@Component
public class SourceGoodsFacade {
    private static final  Logger LOGGER = LoggerFactory.getLogger(SourceGoodsFacade.class);
    @Autowired
    private IYangkeduoBizService yangkeduoBizService;
    @Autowired
    private ISourceGoodsService sourceGoodsService;
    @Autowired
    private ISourceSkuService sourceSkuService;
    @Autowired
    private IdService idService;

    @Transactional
    public void addSourceGoods(String goodsInfo,String url,PlatformtypeEnum platformtypeEnum){
        LOGGER.info("goods url {}",url);
        goodsInfo = yangkeduoBizService.getPageStr(goodsInfo).replace("ID","Id");
        //驼峰命名转下划线命名
        goodsInfo = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE,goodsInfo);
        JSONObject jsonObject = JSON.parseObject(goodsInfo);
        JSONObject info = jsonObject.getJSONObject("goods");
        //替换爬去的sku 团购价和销售价
        String strSku =info.getJSONArray("skus").toJSONString().replace("normal_price","price").replace("group_price","multi_price");
        JSONArray skus = JSON.parseArray(strSku);
        SourceGoodsEntity goodsEntity  = JSON.parseObject(info.toJSONString(),SourceGoodsEntity.class);
        //生成ID
        Long goods_id = idService.genId();
        goodsEntity.setId(goods_id);
        goodsEntity.setGoods_url(url);
        goodsEntity.setPlatform_name(platformtypeEnum.name());
        goodsEntity.setPlatform_type(platformtypeEnum.ordinal());
        //保存商品
        sourceGoodsService.save(goodsEntity);
        //aazz
        List<SourceSkuEntity> skuEntities = JSON.parseArray(skus.toJSONString(), SourceSkuEntity.class);
        if(skuEntities != null){
            for(SourceSkuEntity skuEntity: skuEntities){
                skuEntity.setId(idService.genId());
                skuEntity.setSource_goods_id(goods_id);
                skuEntity.setGoods_id(goodsEntity.getGoods_id());
                skuEntity.setPlatform_name(platformtypeEnum.name());
                skuEntity.setPlatform_type(platformtypeEnum.ordinal());
                sourceSkuService.save(skuEntity);
            }
        }
    }
}
