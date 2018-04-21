package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by ZhangWei on 2018/4/21 0021 20:57.
 */
@SpringBootApplication
//可用basePackages， 也可用basePackagesClasses
//由于@ComponentScan的限制，使得启动类只扫描到了demo2、demo3，再加入  com.example.demo就可以全部扫描到
@ComponentScan(basePackages = {"com.example.demo3", "com.example.demo2"})
public class ChangeScanClassApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChangeScanClassApplication.class, args);
    }
}
