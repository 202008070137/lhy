package com.kuang.helloworld.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   //可以返回字符串在页面上
public class HelloController {
    @RequestMapping("/hello")
    public String hello()
    {
        return "hello world";
    }
}
