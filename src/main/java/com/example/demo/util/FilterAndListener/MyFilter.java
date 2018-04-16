package com.example.demo.util.FilterAndListener;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 使用注解标注过滤器
 * @WebFilter：将一个实现了javax.servlet.Filter接口的类定义为过滤器
 * filterName：声明过滤器名称，可选
 * urlPatterns：指定过滤url模式，也可以用属性value来声明。（指定url过滤模式是必选属性）
 * Created by zhangwei on 2018/4/13 0013.
 */
@WebFilter(filterName = "myFilter", urlPatterns = "/*")
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("=====Filter初始化=====");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("======执行过滤操作========");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("=====Filter销毁=====");
    }
}
