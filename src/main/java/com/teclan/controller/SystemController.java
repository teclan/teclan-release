package com.teclan.controller;

import com.alibaba.fastjson.JSONObject;
import com.teclan.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/system")
public class SystemController {
    @Autowired
    private SystemService systemService;

    @RequestMapping(value = "/stop",method = RequestMethod.GET)
    public JSONObject export(){
        return  systemService.stop();
    }
}
