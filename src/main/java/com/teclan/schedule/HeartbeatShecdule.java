package com.teclan.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Component
public class HeartbeatShecdule {
    private static final Logger LOGGER = LoggerFactory.getLogger(HeartbeatShecdule.class);

    @Scheduled(cron = "0/5 * * * * ?")
    public void heartbeat(){
        LOGGER.info("I am alive ...");
    }
}
