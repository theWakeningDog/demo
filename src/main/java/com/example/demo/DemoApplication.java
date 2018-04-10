package com.example.demo;

import com.example.demo.controller.MyServlet;
import com.example.demo2.SpringUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

/*
* 让spring boot自动给程序进行必要的配置，等价于以默认属性使用
* @Configuration	@EnableAutoConfiguration		@ComponentScan
* */
//@ServletComponentScan
@SpringBootApplication
@Import(value=SpringUtil.class)   //这是第三种，扫描不在包下的springutil
public class DemoApplication {

	/*
	* 方式二
	* 注册springutil，在demo2中的
	* */
//	@Bean
//	public SpringUtil springUtil2() {
//		return new SpringUtil();
//	}

	@Bean
	public ServletRegistrationBean MyServlet() {
		return new ServletRegistrationBean(new MyServlet(),"/myservlet/*");
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
