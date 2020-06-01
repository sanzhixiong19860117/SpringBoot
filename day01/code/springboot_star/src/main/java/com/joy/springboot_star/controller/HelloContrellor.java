package com.joy.springboot_star.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContrellor {
    //路径操作
    @RequestMapping("/hello")
    public String hello(){
        return "helloworld";
    }
}
