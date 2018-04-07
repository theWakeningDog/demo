package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhangwei on 2018/4/3 0003.
 */
@Controller
@RequestMapping("/druid")
public class LoginController {

    @GetMapping("")
    public String Login() {
        return "/druid/login";
    }

    @GetMapping("/toMyres")
    public String toMyres() {
        return "/myres/2.html";
    }

    /*
    * 重定向，跳转至另一个controller
    * */
    @GetMapping("/todemo")
    public String toDemo() {
        System.out.println("3343434");
        System.out.println("33333");
        System.out.println("9999");
        return "redirect:/demo/to1";
    }
}
