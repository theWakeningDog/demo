package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * thymeleaf 与freemarker可以共存，另外freemarker是创建.ftl格式文件
 * Created by zhangwei on 2018/4/9.
 */
@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

    @GetMapping("hellothymeleaf")
    public String thymeleaf(Map<String, Object> map) {
        map.put("hello", "来自thymeleafController");
        return "/hellothymeleaf";
    }

    @GetMapping("/freemarker")
    public String freemarker(Map<String, Object> map) {
        map.put("hell0", "来自freemarker");
        return "/hellofreemarker.html";
    }
}
