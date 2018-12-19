package com.shuhg.shop.util;


import com.shuhg.shop.api.pinduoduo.request.BaseRequest;
import com.sxjr.common.util.MD5Util;
import org.apache.commons.collections.map.HashedMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;


/**
 * Created by 大舒 on 2018/4/19.
 */
public class PinduoduoUtil {
    public static Map<String,Object> signRequest(Map<String,Object> params,String client_secret){
        List<String> paramNames  = new ArrayList<>();
        paramNames.addAll(params.keySet());
        Collections.sort(paramNames);
        StringBuilder sb = new StringBuilder(client_secret);
        for (String paramName : paramNames) {
            sb.append(paramName).append(String.valueOf(params.get(paramName)));
        }
        sb.append(client_secret);
        String sign = MD5Util.MD5(sb.toString());
        params.put("sign",sign);
        return params;
    }

    public static Map<String,Object> publicParams(BaseRequest request,String client_id,String access_token){
        Map<String,Object> publicParams = new HashedMap();
        publicParams.put("client_id",client_id);
        publicParams.put("access_token",access_token);
        publicParams.put("type",request.getType());
        publicParams.put("timestamp",request.getTimestamp());
        publicParams.put("version",request.getVersion());
        publicParams.put("data_type",request.getData_type());
        return publicParams;
    }



}
