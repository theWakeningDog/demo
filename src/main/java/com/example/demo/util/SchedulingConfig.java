package com.example.demo.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 定时任务
 * Created by zhangwei on 2018/4/2 0002.
 */
@EnableScheduling
@Configuration
public class SchedulingConfig {

    /*
    * 一定注意*、？是有空格的
    * */
    @Scheduled(cron = "0/30 * * * * ?")
    public void scheduler() {
        System.out.println("======5秒一次的定时任务======");
    }
}
