package com.teclan.controller;

import com.alibaba.fastjson.JSONObject;
import com.teclan.utils.ResultUtils;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public JSONObject login(@RequestBody JSONObject jsonParam){

        JSONObject jsonObject = ResultUtils.get(200,"登录成功");

        jsonObject.put("USER","");
        jsonObject.put("TOKEN","123");
      return  jsonObject;
    };

    @RequestMapping(value = "/logout",method = RequestMethod.POST)
    public JSONObject logout(@RequestBody JSONObject jsonParam){

        JSONObject jsonObject = ResultUtils.get(200,"退出成功");
        return  jsonObject;
    };

}
