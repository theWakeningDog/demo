package com.example.demo.util.commandLineRunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by ZhangWei on 2018/4/17 11:34.
 */
@Component
@Order(value = 2)
public class MyStartupRunnerOrder2 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>MyStartupRunnerOrder2服务启动执行，执行加载数据等操作 222222222 <<<<<<<<<<<<<");
    }
}

