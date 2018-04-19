package com.shuhg.shop.util;

import java.net.InetAddress;
import java.util.Random;

/**
 * Created by shuhg on 2017/2/24.
 */
public class DataUtil {
    public static  String ip (){
            InetAddress ia=null;
            try {
                ia=ia.getLocalHost();
                String localip=ia.getHostAddress();
                return localip;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
    }
    public static Long getWorkId(){
        String ipStr = ip();
        if(ipStr != null ){
            Long ip = Long.parseLong(ipStr.replace(".",""));
            return ip%1000;
        }else{
            return random();
        }
    }

    /**
     * 获取100 -1000之间的数
     * @return
     */
    public static Long  random(){
        int max =1000;
        int min =100;
        Random dom = new  Random();
        int rs = dom.nextInt(max)%(max-min+1)+min;

        return Long.parseLong(rs+"");
    }
}
