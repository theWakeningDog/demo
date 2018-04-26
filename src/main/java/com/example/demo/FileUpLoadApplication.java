package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;

import javax.servlet.MultipartConfigElement;

/**
 * Created by ZhangWei on 2018/4/23 15:34.
 */
@SpringBootApplication
public class FileUpLoadApplication {

    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //限制上传数据大小，超了会抛出异常信息
        factory.setMaxFileSize("100KB");
        //设置总上传数据大小
        factory.setMaxRequestSize("200KB");
        factory.setLocation("路径地址");
        return factory.createMultipartConfig();
    }

    public static void main(String[] args) {
        SpringApplication.run(FileUpLoadApplication.class, args);
    }
}
