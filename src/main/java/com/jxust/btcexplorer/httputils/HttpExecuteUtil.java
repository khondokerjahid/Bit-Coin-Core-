package com.jxust.btcexplorer.httputils;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Set;

/**
 * HttpExecuteUtil is a tool that send a request like GET or POST
 */
public class HttpExecuteUtil {

    /**
     * execute a post request and return result
     *
     * @param url http post url
     * @return request response
     */
    public static String executePost(String url, Map<String, String> headerMap, String data, String contenttype) {
        //1、define a client object
        DefaultHttpClient client = new DefaultHttpClient();

        //2、define a http post
        HttpPost post = new HttpPost(url);
        if (headerMap != null) {
            //get all keys of map
            Set<String> keys = headerMap.keySet();
            for (String key : keys) {
                String value = headerMap.get(key);
                post.setHeader(key, value);
            }
        }

        StringEntity entity = null;
        try {
            entity = new StringEntity(data);
            //setContentType
            entity.setContentType(contenttype);
            entity.setContentEncoding(String.valueOf(StandardCharsets.UTF_8));

            //3、set post entity
            post.setEntity(entity);

            //4、do execute
            HttpResponse response = client.execute(post);

            //5、check result
            int code = response.getStatusLine().getStatusCode();
            if (code == HttpStatus.SC_OK) {//request success
                HttpEntity resultEntity = response.getEntity();
                return EntityUtils.toString(resultEntity);
            } else {//request failed
                return "request failed, status code is :" + code;
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
