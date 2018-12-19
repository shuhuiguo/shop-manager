import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.shuhg.shop.Application;
import com.shuhg.shop.api.pinduoduo.request.BaseRequest;
import com.shuhg.shop.api.pinduoduo.request.logistics.AddressRequest;
import com.shuhg.shop.constant.PlatformtypeEnum;
import com.shuhg.shop.facade.SourceGoodsFacade;
import com.shuhg.shop.service.IYangkeduoBizService;
import com.shuhg.shop.util.HttpClientKeepSession;
import com.shuhg.shop.util.PinduoduoUtil;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 大舒 on 2018/4/19.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration
public class PinduoduoApiTestMain {
    @Autowired
    private IYangkeduoBizService yangkeduoBizService;

    @Autowired
    private SourceGoodsFacade sourceGoodsFacade;
    HttpClientKeepSession httpClient = new HttpClientKeepSession();
    @Test
    public void addressTest() throws IOException {
        BaseRequest request = new AddressRequest();
        Map<String,Object> map = PinduoduoUtil.publicParams(request,"f1b07a41205447ba83684d158458e8d4","testAccessToken");
        map = PinduoduoUtil.signRequest(map,"fca657ca586b252382e32662b6c246ba7f80913c");
        String response =  httpClient.postForm("http://gw-api.pinduoduo.com/api/router",map);
        JSONObject jsonObject = JSON.parseObject(response);
        System.out.println(jsonObject.toJSONString());
    }

    @Test
    public void addSourceGoods() throws IOException {
        String url = "http://mobile.yangkeduo.com/goods.html?goods_id=71424055";
        //Header header = new BasicHeader("Accept-Encoding","GZIP");
        CloseableHttpResponse response = httpClient.get(url);
        String str = httpClient.getResponseStr(response,true);
        sourceGoodsFacade.addSourceGoods(str,url, PlatformtypeEnum.PINDUODUO);
    }

    @Test
    public void addSourceGoodsByCatUrl() throws IOException {
        String url = "http://apiv3.yangkeduo.com/operation/59/groups?opt_type=3&offset=115&size=100&sort_type=DEFAULT&flip=&pdduid=0";
        CloseableHttpResponse response = httpClient.get(url);
        String str = httpClient.getResponseStr(response,false);
        Pattern pattern = Pattern.compile("(\"goods_id\":)(.*?),");
        Matcher matcher = pattern.matcher(str);
        url = "http://mobile.yangkeduo.com/goods.html?goods_id=";
        String goodsUrl ="";
        //sourceGoodsFacade.addSourceGoods(str,url, PlatformtypeEnum.PINDUODUO);
        while (matcher.find()) {
            //System.out.println(matcher.group(2));
            goodsUrl = url+matcher.group(2);
            //Header header = new BasicHeader("Accept-Encoding","GZIP");
            response = httpClient.get(goodsUrl);
            str = httpClient.getResponseStr(response,true);
            sourceGoodsFacade.addSourceGoods(str,url, PlatformtypeEnum.PINDUODUO);
        }

    }
}
