package com.example.demo.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 用于动态添加资源进行维护使用
 * Created by zhangwei on 2018/3/30 0030.
 */
@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/myres/**").addResourceLocations("classpath:/myres/");
    }
}
