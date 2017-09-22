package com.example.demo.controller;/**
 * Created by chenwt on 2017/9/22.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @desc：
 * @author: chenwt
 * @create： 2017/9/22
 * @Company：zkzj
 **/
@Controller
public class HelloController {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/hello/{myName}")
    @ResponseBody
    String index(@PathVariable String myName) {
        return "Hello "+myName+"!!!";
    }
}
