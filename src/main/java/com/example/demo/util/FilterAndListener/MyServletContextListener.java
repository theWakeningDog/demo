package com.example.demo.util.FilterAndListener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 使用@WebListener注解，实现ServletContextListener接口
 * Created by zhangwei on 2018/4/13 0013.
 */
@WebListener
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("==========ServletContextListener初始化==========");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("==========ServletContextListener销毁==========");
    }
}
