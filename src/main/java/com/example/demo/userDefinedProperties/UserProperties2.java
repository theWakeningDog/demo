package com.example.demo.userDefinedProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 用户自定义属性：用新的配置文件
 * Created by zhangwei on 2018/4/19 0019 下午 9:21.
 *
 * classpath 后面要有  /
 */
@Component
@ConfigurationProperties(prefix = "zhangwei2")
@PropertySource(value = "classpath:/zhangwei2.properties")
public class UserProperties2 {
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
