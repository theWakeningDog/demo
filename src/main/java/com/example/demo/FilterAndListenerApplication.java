package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 此Application用于过滤器和监听器
 *
 *
 * Created by zhangwei on 2018/4/13 0013.
 */
@SpringBootApplication
@ServletComponentScan
public class FilterAndListenerApplication {
    public static void main(String[] args) {
        SpringApplication.run(FilterAndListenerApplication.class, args);
    }
}
