package com.teclan.utils;

import com.alibaba.fastjson.JSONObject;

public class ResultUtils {

    public static JSONObject get(int code,String message,String details){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code",code);
        jsonObject.put("message",message);
        jsonObject.put("details",details);
        return jsonObject;
    }

    public static JSONObject get(int code,String message){
        return get(code,message,"");
    }
}
