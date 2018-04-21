package com.example.demo3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

/**
 * 改变自动扫描的包
 *
 * Spring Boot默认会扫描启动类同包以及子包下的注解，那么如何进行改变
 *  这种扫描包的方式呢，原理很简单就是：
 * @ComponentScan注解进行指定要扫描的包以及要扫描的类。
 * Created by zhangwei on 2018/4/21 0021 20:51.
 */
@Configuration
public class ChangeScanClass1 implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>demo3下的类ChangeScanClass1扫描到了<<<<<<<<<<<<<<<<");
    }
}
