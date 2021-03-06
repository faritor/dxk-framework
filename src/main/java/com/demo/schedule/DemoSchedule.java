package com.demo.schedule;

import com.demo.service.CustomerService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时器demo
 * Created by dxk on 2016/10/27.
 */
@Component
public class DemoSchedule {

    private static final Logger logger = LoggerFactory.getLogger(DemoSchedule.class);

    @Autowired
    private CustomerService customerService;

    @Scheduled(cron="0/10 * * * * ?")
    public void statusCheck() {
        logger.info("----------------每10秒执行一次");
    }
}
