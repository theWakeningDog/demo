package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by ZhangWei on 2018/4/17 11:38.
 */
@SpringBootApplication
public class CommandLineRunnerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommandLineRunnerApplication.class, new String[]{"张伟", "杨仕臻"});
    }
}
