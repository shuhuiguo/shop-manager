import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.base.CaseFormat;
import com.shuhg.shop.entity.SourceGoodsEntity;
import com.shuhg.shop.entity.SourceSkuEntity;
import com.shuhg.shop.service.IYangkeduoBizService;
import com.shuhg.shop.service.impl.YangkeduoBizServiceImpl;
import com.shuhg.shop.util.HttpClientKeepSession;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.message.BasicHeader;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by 大舒 on 2018/3/15.
 */
public class YangkeduoTest {
    org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(YangkeduoTest.class);
    HttpClientKeepSession httpClient = new HttpClientKeepSession();
    /**
     * 发送验证码
     * @throws IOException
     */
    @Test
    public void sendMobileCodeTest() throws IOException {
        //用户登录1- 发送验证码
        CloseableHttpResponse response = httpClient.postForm("http://apiv3.yangkeduo.com/mobile/code/request?pdduid=0", "mobile=15361567640");

    }

    /**
     * 根据验证码登录
     * @throws IOException
     */
    @Test
    public void loginTest() throws IOException {
        String loginStr ="{\"app_id\":5,\"mobile\":\"13715075921\",\"code\":\"462394\",\"platform\":\"4\"}";

        JSONObject j = JSONObject.parseObject(loginStr);
        BasicHeader basicHeader = new BasicHeader("content-type","application/json;charset=UTF-8");
        CloseableHttpResponse response = httpClient.postJSON("http://apiv3.yangkeduo.com/login?pdduid=0", j,basicHeader);
        String str =httpClient.getResponseStr(response);
        JSONObject login = JSONObject.parseObject(str);
        print(str);

        addAddressTest();

    }

    /**
     * 添加收货地址
     * @throws IOException
     */
    @Test
    public void addAddressTest() throws IOException {
        BasicHeader basicHeader = new BasicHeader("content-type","application/json;charset=UTF-8");
        BasicHeader acc = new BasicHeader("accesstoken","3a175e0d27c87fed68e8abb4d6f59e49e171d47c");
        CloseableHttpResponse response = httpClient.postJSON("http://apiv3.yangkeduo.com/address?pdduid=1207443665",
                "name=舒惠国&mobile=13715075921&province_id=6&city_id=77&district_id=706&address=发展中心37楼整层",basicHeader,acc);
        print(httpClient.getResponseStr(response));
    }
    /**
     * 获取省市区
     * @throws IOException
     */
    @Test
    public void getAddressTest() throws IOException {
        BasicHeader acc = new BasicHeader("accesstoken","3a175e0d27c87fed68e8abb4d6f59e49e171d47c");
        CloseableHttpResponse response = httpClient.get("http://apiv3.yangkeduo.com/api/galen/v2/regions/1?pdduid=5268248755",acc);
        print(httpClient.getResponseStr(response));
    }
    /**
     * 获取sku
     * @throws IOException
     */
    @Test
    public void getSkuTest() throws IOException {
        CloseableHttpResponse response = httpClient.get("http://mobile.yangkeduo.com/goods.html?goods_id=504118369");
        String str = httpClient.getResponseStr(response,true);
        IYangkeduoBizService yangkeduoBizService = new YangkeduoBizServiceImpl();
        str = yangkeduoBizService.getPageStr(str).replace("ID","Id");
        str = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE,str);
        JSONObject jsonObject = JSON.parseObject(str);
        JSONObject info = jsonObject.getJSONObject("goods");
        String strSku =info.getJSONArray("skus").toJSONString().replace("normal_price","price").replace("group_price","multi_price");
        JSONArray skus = JSON.parseArray(strSku);
        SourceGoodsEntity goodsEntity  = JSON.parseObject(info.toJSONString(),SourceGoodsEntity.class);
        print(JSON.toJSONString(goodsEntity));
        print(JSON.toJSONString(JSON.parseArray(skus.toJSONString(), SourceSkuEntity.class)));
    }

    /**
     * 下单测试
     * @throws IOException
     */
    @Test
    public void orderTest() throws IOException {
        //下单
        JSONObject goods = new JSONObject();
        goods.put("address_id","928482920");


        goods.put("group_id","334825414");
        goods.put("source_type","0");
        goods.put("app_id","9");
        goods.put("is_app","0");
        goods.put("version","1");

        JSONObject good = new JSONObject();
        good.put("sku_id","3404054732");
        good.put("sku_number","1");
        good.put("goods_id","156273107");
        JSONArray jsonArray = new JSONArray();
        jsonArray.add(good);

        goods.put("goods",jsonArray);

        BasicHeader basicHeader = new BasicHeader("content-type","application/json;charset=UTF-8");
        BasicHeader acc = new BasicHeader("accesstoken","3a175e0d27c87fed68e8abb4d6f59e49e171d47c");
        CloseableHttpResponse response = httpClient.postJSON("http://apiv3.yangkeduo.com/order",goods,basicHeader,acc);
        String str = httpClient.getResponseStr(response);
        print(str);
    }

    public void getOrderTest(){

    }
    void print(String str){
        System.out.println(str);
    }
}
