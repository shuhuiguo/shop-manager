import com.shuhg.shop.api.pinduoduo.request.BaseRequest;
import com.shuhg.shop.api.pinduoduo.request.logistics.AddressRequest;
import com.shuhg.shop.util.PinduoduoUtil;
import org.junit.Test;

import java.util.Map;

/**
 * Created by 大舒 on 2018/4/19.
 */
public class PinduoduoApiTestMain {
    @Test
    public void addressTest(){
        BaseRequest request = new AddressRequest();
        Map<String,Object> map = PinduoduoUtil.publicParams(request,"testClientId","testAccessToken");
        System.out.println(map.toString());
    }
}
