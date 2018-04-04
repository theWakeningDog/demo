package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Demo;
import com.example.demo.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by zhangwei on 2018/3/26 0026.
 *
 * RestController :不能直接返回视图，可以利用ModelAndView
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private DemoService demoService;

    /*
    * 保存
    * */
    @ResponseBody
    @RequestMapping("/save")
    public String save() {
        Demo d = new Demo();
        d.setName("小名");
        d.setId(2);
        demoService.save(d);
        return "save， ok";
    }

    /*
    * 通过id查找
    * */
    @RequestMapping("/getById")
    @ResponseBody
    public Demo getById(long id) {
        return demoService.getById(id);
    }

    @GetMapping("/to1")
    public String to1() {
        return "one";
    }

    @RequestMapping("/getDemo")
    public Demo getDemo() {
        Demo d = new Demo();
        d.setId(1);
        d.setName("Angel");
        return d;
    }

    /**
     * 利用fastjson返回数据
     * 形式为：{"id":2,"name":"张伟"}
     */
    @RequestMapping("/getFastJson")
    public String getFastJson(){
        Demo d = new Demo();
        d.setId(2);
        d.setName("张伟");
        return JSONObject.toJSONString(d);
    }

    @RequestMapping("/zeroException")
    public int zeroException(){
        return 100/0;
    }
}
