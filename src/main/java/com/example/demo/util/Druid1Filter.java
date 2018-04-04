package com.example.demo.util;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * druid过滤器
 * Created by zhangwei on 2018/4/2 0002.
 */
@WebFilter(filterName="druidWebStatFilter", urlPatterns="/*",
        initParams={
                @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")// 忽略资源
        }
)
public class Druid1Filter extends WebStatFilter {
}
