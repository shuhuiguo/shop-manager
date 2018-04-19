package com.shuhg.shop.service.impl;

import com.shuhg.shop.service.IdService;
import com.shuhg.shop.util.DataUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 大舒 on 2018/4/19.
 */
public class IdServiceImpl implements IdService {
    private  static Logger logger = LoggerFactory.getLogger(IdServiceImpl.class);
    private IdWorker idWorker ;
    private  long workId = 0L;
    public IdServiceImpl(){
        workId = DataUtil.getWorkId();
        idWorker = new IdWorker(workId,1123407592147L);
    }
    @Override
    public long genId() {
        try{
            long l = idWorker.nextId();
            logger.info("生成ID  - {}",l);
            return l;
        }catch (Exception ex){
            logger.error("生成ID错误，采用时间戳");
            return System.currentTimeMillis();
        }
    }
}
