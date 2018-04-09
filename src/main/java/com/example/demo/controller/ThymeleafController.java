package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
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
}
