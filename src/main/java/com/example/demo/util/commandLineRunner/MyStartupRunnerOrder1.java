package com.example.demo.util.commandLineRunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by ZhangWei on 2018/4/17 11:34.
 */
@Component
@Order(value = 1)
public class MyStartupRunnerOrder1 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("===========@Order注解value越小优先级越大，无注解的级别最小===============");
        System.out.println(">>>>>>>>>>>>>>>MyStartupRunnerOrder1服务启动执行，执行加载数据等操作 11111111 <<<<<<<<<<<<<");
    }
}
