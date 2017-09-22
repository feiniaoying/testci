package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 修改启动类，继承 SpringBootServletInitializer 并重写 configure 方法
 */
public class TestciApplication  extends SpringBootServletInitializer {

	public static void main(String[] args) {
		System.out.println("测试！");
		SpringApplication.run(TestciApplication.class, args);
	}
}
