package com.example.demo.util.commandLineRunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 启动加载数据CommandLineRunner
 *
 * 服务启动执行
 * Spring boot 应用程序启动后，会遍历CommandLineRunner接口的实例并运行他们的run方法
 * Created by zhangwei on 2018/4/17.
 */
@Component
public class MyStartUpRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        //这里的args是程序启动类app.java中的app.class, new String[]{"张伟", "杨仕臻"}
        System.out.println(Arrays.asList(args));
        System.out.println(">>>>>>>>>>>>>>>CommandLineRunner服务启动执行，执行加载数据等操作<<<<<<<<<<<<<");
    }
}
