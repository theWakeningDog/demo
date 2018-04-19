package com.example.demo.util.environmentAware;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * 凡是被Spring管理的类，实现接口EnvironmentAware重写方法serEnvironment可以在启动工程时，
 * 获取到系统环境变量和application 配置文件中的变量
 *
 * 可以在controller和service中实现接口environment获取系统变量或application.properties中的变量
 * Created by zhangwei on 2018/4/18 0018.
 */
@Configuration
public class MyEnvironmentAware implements EnvironmentAware {

    @Value("${spring.datasource.url}")  //注入application.properties中的属性到指定变量中
    private String myUrl;

    /*
    * 此方法是在系统启动时被执行
    * */
    @Override
    public void setEnvironment(Environment environment) {
        System.out.println("myUrl=" + myUrl);
        System.out.println(environment.getProperty("path"));        //获取系统变量属性
        System.out.println(environment.getProperty("spring.datasource.url"));    //获取application.properties中的属性
        //还可以获取前缀是spring.datasource的列表-------没搞出来
    }
}
