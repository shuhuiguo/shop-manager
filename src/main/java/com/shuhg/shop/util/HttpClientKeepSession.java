package com.shuhg.shop.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.*;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.CharsetUtils;
import org.apache.http.util.EntityUtils;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/**
 * Created by 大舒 on 2018/3/12.
 */
public class HttpClientKeepSession {
    private final static org.slf4j.Logger LOG = LoggerFactory.getLogger(HttpClientKeepSession.class);
    public  static CloseableHttpClient httpClient = null;
    public  static HttpClientContext context = null;
    public  static CookieStore cookieStore = null;
    public  static RequestConfig requestConfig = null;

    public HttpClientKeepSession(){
        init();
    }
    private  void init() {
        context = HttpClientContext.create();
        cookieStore = new BasicCookieStore();
        // 配置超时时间（连接服务端超时1秒，请求数据返回超时2秒）
        requestConfig = RequestConfig.custom().setConnectTimeout(120000).setSocketTimeout(60000)
                .setConnectionRequestTimeout(60000).build();
        // 设置默认跳转以及存储cookie
        httpClient = HttpClientBuilder.create()
                .setKeepAliveStrategy(new DefaultConnectionKeepAliveStrategy())
                .setRedirectStrategy(new DefaultRedirectStrategy()).setDefaultRequestConfig(requestConfig)
                .setDefaultCookieStore(cookieStore).build();
    }

    /**
     * http get
     *
     * @param url
     * @return response
     * @throws ClientProtocolException
     * @throws IOException
     */
    public  CloseableHttpResponse get(String url,Header ... headers) throws  IOException {
        HttpGet httpget = new HttpGet(url);
        for(Header header : headers){
            httpget.setHeader(header);
        }
        CloseableHttpResponse response = httpClient.execute(httpget, context);
        return response;
    }

    /**
     * http postForm
     *
     * @param url
     * @param parameters
     *            form表单
     * @return response
     * @throws ClientProtocolException
     * @throws IOException
     */
    public  CloseableHttpResponse postForm(String url, String parameters)
            throws  IOException {

        List<NameValuePair> nvps = toNameValuePairList(parameters);
        HttpEntity entity = new UrlEncodedFormEntity(nvps, "UTF-8");
        return  post(url,entity);

    }
    public  String postForm(String url, Map<String,Object> parameters)
            throws  IOException {

        List<NameValuePair> nvps = toNameValuePairList(parameters);
        HttpEntity entity = new StringEntity(JSON.toJSONString(parameters), "UTF-8");
        return  getResponseStr(post(url,entity));

    }
    /**
     * 提交json参数
     * @param url
     * @param parameters
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     */
    public  CloseableHttpResponse postJSON(String url, String parameters, Header entityHead,Header ... miscellaneous)
            throws  IOException {
        if(parameters != null && !"".equals(parameters.trim())) {
            JSONObject json = toNameValueJSON(parameters);
            StringEntity entity = new StringEntity(json.toString(), "utf-8");//解决中文乱码问题
            if (entityHead != null) {
                entity.setContentType(entityHead);
            }
            return post(url,entity,miscellaneous);
        }else {
            return post(url,null,miscellaneous);
        }




    }
    public  CloseableHttpResponse postJSON(String url, JSONObject parameters,Header entityHead,Header ... miscellaneous)
            throws  IOException {
        StringEntity entity = new StringEntity(parameters.toJSONString(),"utf-8");//解决中文乱码问题
        if(entityHead != null){
            entity.setContentType(entityHead);
        }

        return post(url,entity,miscellaneous);

    }

    /**
     * 执行post
     * @param url
     * @param entity
     * @return
     * @throws IOException
     */
    public  CloseableHttpResponse post(String url, HttpEntity entity)
            throws  IOException {
        HttpPost httpPost = new HttpPost(url);
        httpPost.setEntity(entity);
        CloseableHttpResponse response = httpClient.execute(httpPost, context);
        return response;

    }
    public  CloseableHttpResponse post(String url, HttpEntity entity,Header ... headers)
            throws  IOException {
        HttpPost httpPost = new HttpPost(url);
        httpPost.setEntity(entity);
        for(Header header : headers){
            httpPost.setHeader(header);
        }
        CloseableHttpResponse response = httpClient.execute(httpPost, context);
        return response;

    }

    /**
     * 上传
     * @param url
     */
    public static void upload(String url) {
        try {
            HttpPost httppost = new HttpPost(url);
            FileBody bin = new FileBody(new File("C:\\Users\\Desktop\\jinzhongzi.jpg"));
            HttpEntity reqEntity = MultipartEntityBuilder.create()
                    .setMode(HttpMultipartMode.BROWSER_COMPATIBLE)
                    .addPart("uploadFile", bin)
                    .setCharset(CharsetUtils.get("UTF-8")).build();
            httppost.setEntity(reqEntity);
            System.out.println("executing request: "+ httppost.getRequestLine());
            CloseableHttpResponse response = httpClient.execute(httppost,context);
            try {
                cookieStore = context.getCookieStore();
                List<Cookie> cookies = cookieStore.getCookies();
                for (Cookie cookie : cookies) {
                    LOG.debug("key:" + cookie.getName() + "  value:" + cookie.getValue());
                }

                System.out.println("----------------------------------------");
                System.out.println(response.getStatusLine());
                HttpEntity resEntity = response.getEntity();
                if (resEntity != null) {
                    // 响应长度
                    System.out.println("Response content length: "
                            + resEntity.getContentLength());
                    // 打印响应内容
                    System.out.println("Response content: "
                            + EntityUtils.toString(resEntity));
                }
                // 销毁
                EntityUtils.consume(resEntity);
            } finally {
                response.close();
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    @SuppressWarnings("unused")
    private  List<NameValuePair> toNameValuePairList(String parameters) {
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        String[] paramList = parameters.split("&");
        for (String parm : paramList) {
            int index = -1;
            for (int i = 0; i < parm.length(); i++) {
                index = parm.indexOf("=");
                break;
            }
            String key = parm.substring(0, index);
            String value = parm.substring(++index, parm.length());
            nvps.add(new BasicNameValuePair(key, value));
        }
        System.out.println(nvps.toString());
        return nvps;
    }
    private  List<NameValuePair> toNameValuePairList(Map<String,Object> parameters) {
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        for (Map.Entry entry : parameters.entrySet()){
            nvps.add(new BasicNameValuePair(entry.getKey()+"", entry.getValue()+"'"));
        }

        return nvps;
    }
    private  JSONObject toNameValueJSON(String parameters) {
        JSONObject jsonObject = new JSONObject();
        String[] paramList = parameters.split("&");
        for (String parm : paramList) {
            int index = -1;
            for (int i = 0; i < parm.length(); i++) {
                index = parm.indexOf("=");
                break;
            }
            String key = parm.substring(0, index);
            String value = parm.substring(++index, parm.length());
            jsonObject.put(key,value);
        }
        return jsonObject;
    }
    /**
     * 手动增加cookie
     * @param name
     * @param value
     * @param domain
     * @param path
     */
    public  void addCookie(String name, String value, String domain, String path) {
        BasicClientCookie cookie = new BasicClientCookie(name, value);
        cookie.setDomain(domain);
        cookie.setPath(path);
        cookieStore.addCookie(cookie);
    }

    /**
     * 获取响应数据
     *
     * @param httpResponse
     * @throws ParseException
     * @throws IOException
     */
    public  String getResponseStr(CloseableHttpResponse httpResponse) throws ParseException, IOException {
        return getResponseStr(httpResponse,false);


    }
    /**
     * 获取响应数据
     * @param httpResponse
     * @param isGzip 是否是压缩数据
     * @return
     * @throws IOException
     */
    public  String getResponseStr(CloseableHttpResponse httpResponse, boolean isGzip) throws IOException {
        // 获取响应消息实体
        HttpEntity entity = httpResponse.getEntity();
        if(isGzip){
            // 判断响应实体是否为空
            if (entity != null) {
                GZIPInputStream gzin = null;
                InputStreamReader isr = null;
                StringBuffer sb = null;
                try {
                    gzin = (GZIPInputStream) (entity.getContent());
                    isr = new InputStreamReader(gzin, "UTF-8");
                    java.io.BufferedReader br = new java.io.BufferedReader(isr);
                    sb = new StringBuffer();
                    String tempbf;
                    while ((tempbf = br.readLine()) != null) {
                        sb.append(tempbf);
                        sb.append("\r\n");
                    }

                    return sb.toString();
                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {
                    isr.close();
                    gzin.close();
                    httpResponse.close();
                }
            }
        }else {
            // 判断响应实体是否为空
            if (entity != null) {
                try {
                    String responseString = EntityUtils.toString(entity,"UTF-8");
                    return responseString;
                } catch (Exception ex) {

                } finally {
                    httpResponse.close();
                }
            }
            return null;
        }
            return null;

    }

    /**
     * 把当前cookie从控制台输出出来
     *
     */
    public static void printCookies() {
        System.out.println("headers:");
        cookieStore = context.getCookieStore();
        List<Cookie> cookies = cookieStore.getCookies();
        for (Cookie cookie : cookies) {
            System.out.println("key:" + cookie.getName() + "  value:" + cookie.getValue());
        }
    }

    /**
     * 检查cookie的键值是否包含传参
     *
     * @param key
     * @return
     */
    public static boolean checkCookie(String key) {
        cookieStore = context.getCookieStore();
        List<Cookie> cookies = cookieStore.getCookies();
        boolean res = false;
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals(key)) {
                res = true;
                break;
            }
        }
        return res;
    }



    public static void main(String[] args) throws ClientProtocolException, IOException {

    }

}
