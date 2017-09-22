package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
public class TestciApplication  extends SpringBootServletInitializer{
	public static void main(String[] args) {
		System.out.println("测试！");
		SpringApplication.run(TestciApplication.class, args);
	}

}
