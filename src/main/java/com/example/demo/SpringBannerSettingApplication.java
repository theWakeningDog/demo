package com.example.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 改变spring启动banner
 * Created by ZhangWei on 2018/4/22 16:33.
 */
@SpringBootApplication
public class SpringBannerSettingApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringBannerSettingApplication.class, args);
        SpringApplication application = new SpringApplication(SpringBannerSettingApplication.class);

        //Banner.Mode.OFF：关闭
        //Banner.Mode.CONSOLE:控制台输出，默认方式
        //Banner.Mode.LOG：日志方式输出
        application.setBannerMode(Banner.Mode.OFF);

        application.run(args);
    }
}
