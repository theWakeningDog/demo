package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangwei on 2018/3/25 0025.
 */
//返回json字符串的数据，直接可以编写RESTFul的接口
@RestController
public class DController {

    @GetMapping("/hw")
    public String helloworld(){
        return "你好，世界";
    }
}
