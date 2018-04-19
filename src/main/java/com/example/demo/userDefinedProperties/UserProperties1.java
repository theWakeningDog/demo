package com.example.demo.userDefinedProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 用户自定义属性：继续在application.properties中添加
 * Created by zhangwei on 2018/4/19 0019 下午 9:03.
 */
@ConfigurationProperties(prefix = "zhangwei1")
public class UserProperties1 {

    private String name;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
