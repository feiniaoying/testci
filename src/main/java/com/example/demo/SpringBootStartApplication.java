package com.example.demo;/**
 * Created by chenwt on 2017/9/22.
 */

/**
 * @desc：
 * @author: chenwt
 * @create： 2017/9/22
 * @Company：zkzj
 **/

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 修改启动类，继承 SpringBootServletInitializer 并重写 configure 方法
 */
public class SpringBootStartApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(TestciApplication.class);
    }
}
