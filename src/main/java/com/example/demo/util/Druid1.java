package com.example.demo.util;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * 配置统计监控功能，与filter（Druid1Filter）一起用
 *
 * druid1是基于注解的配置，Druid1Filter一样
 *
 * 此文件用处：druid数据源状态监控，文件名应为：DruidStatViewServlet
 *
 * 需要在Application.java中添加@ServletComponentScan
 *
 *  配置完成访问：http://127.0.0.1:8080/druid/index.html，这个地址和下面的配置的urlPatterns有关
 * Created by zhangwei on 2018/4/2 0002.
 */
@WebServlet(urlPatterns = "/druid/*",
initParams = {
        @WebInitParam(name = "allow", value = "192.168.1.72,127.0.0.1"),// IP白名单 (没有配置或者为空，则允许所有访问)
        @WebInitParam(name = "deny", value = "192.168.1.73"), //IP黑名单 (存在共同时，deny优先于allow)
        @WebInitParam(name="loginUsername",value="admin"),// 用户名
        @WebInitParam(name="loginPassword",value="123456"),// 密码
        @WebInitParam(name="resetEnable",value="false")// 禁用HTML页面上的“Reset All”功能
})
public class Druid1 extends StatViewServlet {

    private static final long serialVersionUID = 1L;
}
