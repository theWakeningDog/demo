package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/*
* 让spring boot自动给程序进行必要的配置，等价于以默认属性使用
* @Configuration	@EnableAutoConfiguration		@ComponentScan
* */
@ServletComponentScan
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
