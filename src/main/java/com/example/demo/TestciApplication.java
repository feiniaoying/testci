package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestciApplication {

	public static void main(String[] args) {
		System.out.println("测试！");
		SpringApplication.run(TestciApplication.class, args);
	}
}
