package com.jxust.btcexplorer.httputils;

import com.alibaba.fastjson.JSONObject;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * RPCRequest is used to send the rpc request
 */
public class RPCRequest {

    //same to configure of bitcoin core rpcport and rpcconnect
    private static final String URL = "http://127.0.0.1:1111";
    //header configure
    private static final String AUTHORIZATION = "Authorization";

    private static final String RPCUSER = "user";
    private static final String RPCPASSWORD = "pwd1";

    //content type
    private static final String CONTENTTYPE = "application/json";

    public static String rpcPost(String command, Object... param) {
        Map<String, String> header = new HashMap<String, String>();
        String author = RPCUSER + ":" + RPCPASSWORD;
        String authorBase64 = base64Encode(author);
        header.put(AUTHORIZATION, "Basic " + authorBase64);

        //data is a json type
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", new Date().getTime());
        jsonObject.put("jsonrpc", "2.0");//version of jsonrpc
        jsonObject.put("method", command);
        if (param != null) {
            jsonObject.put("params", param);
        }

        String result = HttpExecuteUtil.executePost(
                URL,
                header,
                jsonObject.toJSONString(),
                CONTENTTYPE);

        return result;
    }


    /**
     * encode a message to base64 data type
     *
     * @param message
     * @return
     */
    public static String base64Encode(String message) {
        Base64.Encoder encoder = Base64.getEncoder();
        return encoder.encodeToString(message.getBytes(StandardCharsets.UTF_8));
    }

    /**
     * decode a base64 message to string
     */
    public static String base64Decode(String base64Msg) {
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] data = decoder.decode(base64Msg);
        return new String(data);
    }

}
