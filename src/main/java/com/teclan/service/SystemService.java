package com.teclan.service;

import com.alibaba.fastjson.JSONObject;
import com.teclan.utils.ResultUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SystemService {
    private static final Logger LOGGER = LoggerFactory.getLogger(SystemService.class);

    public JSONObject stop(){
       new Thread(new Runnable() {
           @Override
           public void run() {
               try {
                   LOGGER.info("服务将在 5s 后停止...");
                   Thread.sleep(5000);
                   LOGGER.info("正在停止服务...");
                   System.exit(0);
               } catch (InterruptedException e) {
                   LOGGER.error(e.getMessage(),e);
               }
           }
       }).start();
       return ResultUtils.get(200,"服务将在 5s 后停止 ...");
    }
}
