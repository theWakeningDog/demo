package com.example.demo.util;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * 使用代码注册servlet
 *
 * druid配置，这种不要在Application.java中配置@ServletComponentScan
 *
 * 配置完成访问：http://127.0.0.1:8080/druid2/index.html
 *
 * 没出现正确结果，原因：
 * 不能和druid1同时有，只能存在一个
 * Created by zhangwei on 2018/4/4 0004.
 */
@Configuration
public class Druid2 {

    /*
    * 注册StatViewServlet
    * */
    @Bean
    public ServletRegistrationBean DruidStatViewServlet2() {
        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(),
                "/druid/*");

        //添加初始化参数

        //白名单
        bean.addInitParameter("allow", "127.0.0.1");
        //IP黑名单 (存在共同时，deny优先于allow) : 如果满足deny的话提示:Sorry, you are not permitted to view this page
        bean.addInitParameter("deny", "192.168.1.73");
        //登录账号密码
        bean.addInitParameter("loginUsername", "admin2");
        bean.addInitParameter("loginPassword", "123456");
        //是否能够重置数据
        bean.addInitParameter("resetEnable", "false");
        return bean;
    }

    /*
    * 注册一个FilterRegistrationBean
    * */
    @Bean
    public FilterRegistrationBean druidStatFilter2() {

        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());

        //添加过滤规则
        filterRegistrationBean.addUrlPatterns("/*");

        //添加不需要忽略的格式信息
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }

    /*
    * 注册datasource
    *
    * 要和application.properties参数设置对应
    * */
    @Bean
    public DataSource druidDataSource(@Value("${spring.datasource.driver-class-name}") String driverClassName,
                                      @Value("${spring.datasource.url}") String url,
                                      @Value("${spring.datasource.username}") String username,
                                      @Value("${spring.datasource.password}") String password,
                                      @Value("${spring.datasource.max-active}") int maxActive) {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driverClassName);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        druidDataSource.setMaxActive(maxActive);
        System.out.println("--------------DruidDataSource, driverClassName：" + driverClassName +
                "，url：" + url + "，username：" + username + ",password：" + password + ",maxActive：" + maxActive);
        try {
            druidDataSource.setFilters("stat, wall");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return druidDataSource;
    }
}
