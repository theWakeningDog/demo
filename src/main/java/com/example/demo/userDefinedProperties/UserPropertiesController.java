package com.example.demo.userDefinedProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangwei on 2018/4/21 0021 16:33.
 */
@RestController("/userProperties")
public class UserPropertiesController {

    @Autowired
    private UserProperties1 userProperties1;
    @Autowired
    private UserProperties2 userProperties2;

    @RequestMapping("/up")
    public String up() {
        return "姓名1：" + userProperties1.getName() + "，性别1：" + userProperties1.getGender() +
                "\n姓名2：" + userProperties2.getName() + "，性别2：" + userProperties2.getGender();
    }
}
