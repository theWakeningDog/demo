package com.example.demo;

import com.example.demo.userDefinedProperties.UserProperties1;
import com.example.demo.userDefinedProperties.UserProperties2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 *读取配置文件的启动类，要加入EnableConfigurationProperties
 *
 * 对应的包  userDefinedProperties
 * Created by zhangwei on 2018/4/21 0021 16:22.
 */
@SpringBootApplication
@EnableConfigurationProperties(value = {UserProperties1.class, UserProperties2.class})
public class UserPropertiesApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserPropertiesApplication.class, args);
    }
}
