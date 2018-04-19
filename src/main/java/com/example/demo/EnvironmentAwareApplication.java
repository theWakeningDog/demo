package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by zhangwei on 2018/4/18 0018 下午 9:35.
 */
@SpringBootApplication
public class EnvironmentAwareApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnvironmentAwareApplication.class, args);
    }
}
