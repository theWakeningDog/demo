package com.example.demo.util.FilterAndListener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 监听session的创建及销毁
 *
 * 问题：访问页面没出现    ======session被创建=====
 * Created by zhangwei on 2018/4/13 0013.
 */
@WebListener
public class MyHttpSessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("======session被创建=====");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("======session被销毁，ServletContex初始化=====");
    }
}
