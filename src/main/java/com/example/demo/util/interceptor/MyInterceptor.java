package com.example.demo.util.interceptor;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * HandlerInterceptor 的功能跟过滤器类似，但是提供更精细的的控制能力：在request被响应之前、request被响
 应之后、视图渲染之前以及request全部结束之后。我们不能通过拦截器修改request内容，但是可以通过抛出异常（或
 者返回false）来暂停request的执行。
 实现 UserRoleAuthorizationInterceptor 的拦截器有：
 ConversionServiceExposingInterceptor
 CorsInterceptor

 PathExposingHandlerInterceptor
 ResourceUrlProviderExposingInterceptor
 ThemeChangeInterceptor
 UriTemplateVariablesHandlerInterceptor
 UserRoleAuthorizationInterceptor
 其中 LocaleChangeInterceptor 和 ThemeChangeInterceptor 比较常用。
 配置拦截器也很简单，Spring 为什么提供了基础类WebMvcConfigurerAdapter ，我们只需要重写 addInterceptors
 方法添加注册拦截器。


 实现自定义拦截器只需要3步：
 1、创建我们自己的拦截器类并实现 HandlerInterceptor 接口。
 2、创建一个Java类继承WebMvcConfigurerAdapter，并重写 addInterceptors 方法。
 2、实例化我们自定义的拦截器，然后将对像手动添加到拦截器链中（在addInterceptors方法中添加）。
 * Created by zhangwei on 2018/4/15 0015.
 */
public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(">>>MyInterceptor1>>>>>>>在请求处理之前进行调用（Controller方法调用之 前）");
        return true;// 只有返回true才会继续向下执行，返回false取消当前请求
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        System.out.println(">>>MyInterceptor1>>>>>>>请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        System.out.println(">>>MyInterceptor1>>>>>>>在整个请求结束之后被调用，也就是在 DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）");
    }
}
